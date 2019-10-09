# SWExpertAcademy_D3_Java_7272

## SW Expert Academy D3 7272. 안경이 없어

### 1. 문제설명

출처: https://swexpertacademy.com/main/code/problem/problemList.do

input으로 공백으로 나눠진 두개의 문자열이 들어온다. 문제의 주인공이 안경이 없어 알파벳에 구멍의 갯수로만 구분할 수 있다. 예를 들어 `B`는 두개의 구멍을 갖고있으므로 유일하게 인식할 수 있고, `A D O P Q R`는 하나의 문자로 인식한다. 이외 구멍이 없는 문자들을 또 하나의 문자로 인식한다. 두개의 문자열을 주인공의 시점에서 같은지 아닌지 판단하는 문제.

[입력]
> 첫 번째 줄에 테스트 케이스의 수 `T`가 주어진다.
> 각 테스트 케이스의 첫 번째 줄에는 두 문자열이 공백 하나로 구별되어 주어진다.
> 각 문자열은 알파벳 대문자 만으로 이루어져 있으며, 길이는 `10`이하이다.

[출력]
> 각 테스트 케이스마다 `#x`(`x`는 테스트케이스 번호를 의미하며 `1`부터 시작한다)를 출력하고,
> 두 문자열을 같은 것으로 생각하면 `SAME`을, 다른 것으로 생각하면 `DIFF`를 출력한다.

### 2. 풀이

두 문자열을 받아와 길이를 비교한다. 길이가 다르면 곧바로 `DIFF`를 출력하고 같다면 각각의 문자를 비교한다. 각각의 문자는 `charAt()`을 이용하여 가져와 인식할수 있는 세가지의 문자중 어떻게 보이는지 가져올 함수를 별도로 선언하여 처리하였다.

```java
private static int getAlphabetLooks(char c) {
		if (c == 'B') {
			return TWO_HOLE;
		} else if (c == 'A' || c == 'D'|| c == 'O'|| c == 'P'|| c == 'Q'|| c == 'R') {
			return ONE_HOLE;
		} else {
			return ZERO_HOLE;
		}
	}
```

두개의 문자열에서 보이는 문자의 모양이 모두 같다면 `SAME`을 return하고 그렇지 않다면 `DIFF`를 return하여 해결하였다.
```java

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

```
