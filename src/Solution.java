import java.util.Scanner;

class Solution
{
	public static final String OUTPUT_DIFF = "DIFF";
	public static final String OUTPUT_SAME = "SAME";
	
	public static final int ZERO_HOLE = 0;
	public static final int ONE_HOLE = 1;
	public static final int TWO_HOLE = 2;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String[] strings = sc.nextLine().split(" ");
			
			if (strings[0].length() != strings[1].length()) {
				System.out.println("#"+test_case+" "+OUTPUT_DIFF);
			
			} else {
				boolean isSame = true;
				for (int i = 0; i < strings[0].length(); i++) {
					if (getAlphabetLooks(strings[0].charAt(i)) != getAlphabetLooks(strings[1].charAt(i))) { 
						isSame = false;
						break;
					}
				}
				if (isSame) {
					System.out.println("#"+test_case+" "+OUTPUT_SAME);
				}
				else {
					System.out.println("#"+test_case+" "+OUTPUT_DIFF);				
				}
			}
			
		}
		
	}

	private static int getAlphabetLooks(char c) {
		if (c == 'B') {
			return TWO_HOLE;
		} else if (c == 'A' || c == 'D'|| c == 'O'|| c == 'P'|| c == 'Q'|| c == 'R') {
			return ONE_HOLE;
		} else {
			return ZERO_HOLE;
		}
	}
	
	
}