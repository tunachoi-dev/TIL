# 조건문 (Conditional Statements)
## 1. 조건문이란?
조건문은 프로그램이 특정 조건에 따라 다른 동작을 하도록 제어하는 구문입니다.
즉, **"만약 ~라면 ~을 해라"** 라는 상황을 코드로 표현할 수 있게 해줍니다.

자바에서 대표적인 조건문은 다음과 같습니다.
- `if`, `if-else`, `if-else if-else`
- `switch`

---
## 2. if문
조건식이 `true`일 때만 블록 안의 코드가 실행됩니다.
```java
int score = 85;

if (score >= 60){
	System.out.println("합격");
}
```
- 조건 `score >= 60`이 참이면 `"합격"`이 출력됩니다.
- 거짓이라면 아무 일도 일어나지 않습니다.

---
## 3. if-else문
조건식이 `true`면 `if` 블록이 실행되고, `false`면 `else` 블록이 실행됩니다.
```java
int score = 45;

if (score >= 60){
	System.out.println("합격");
} else{
	System.out.println("불합격");
}
```

---
## 4. if-else if-else문
조건이 여러 개일 때 사용합니다.
```java
int score = 75;

if (score >= 90){
	System.out.println("A 학점");
} else if (score >= 80){
	System.out.println("B 학점");
} else if (score >= 70){
	System.out.println("C 학점");
} else{
	System.out.println("F 학점");
}
```
- 위에서부터 차례대로 조건을 검사하고, **처음으로 참이 되는 조건 블록만 실행**합니다.

---
## 5. 중첩 if문
if문 안에 또 다른 if문을 넣어 사용할 수 있습니다.
```java
int score = 85;
boolean isPass = true;

if (isPass){
	if (score >= 80){
		System.out.println("우수 합격");
	} else{
		System.out.println("일반 합격");
	}
}
```
하지만 가독성이 떨어질 수 있으므로, 너무 깊게 중첩하지 않도록 주의해야 합니다.

---
## 6. switch문
하나의 변수 값에 따라 여러 경우를 분기할 때 사용합니다.
```java
int grade = 2;

switch (grade) {
	case 1:
		System.out.println("1학년");
		break;
	case 2:
		System.out.println("2학년");
		break;
	case 3:
		System.out.println("3학년");
		break;
	default:
		System.out.println("학년 정보 없음");
}
```
- `switch`는 비교 대상 값이 **정수, 문자, 문자열**일 때 사용합니다.
- `break`를 쓰지 않으면 다음 case로 계속 넘어가므로 꼭 필요할 때 넣어야 합니다.
- `default`는 모든 case가 해당하지 않을 때 실행됩니다.
### Java 14 이후의 switch 표현식
새로운 switch 문법에서는 `->` 와 `yield`를 이용해 더 깔끔하게 코드를 작성할 수 있습니다.
```java
int grade = 2;
String result = switch (grade){
	case 1 -> "1학년";
	case 2 -> "2학년";
	case 3 -> "3학년";
	default -> "학년 정보 없음";
};
System.out.println(result);
```

---
## 7. 삼항 연산자 (`?:`)
조건문을 한 줄로 간단히 표현할 수 있습니다.
```java
조건식 ? 값1 : 값2
```
- **조건식** -> `true` 또는 `false`를 반환해야 합니다.
- 조건식이 `true`라면 **값1**이 선택됩니다.
- 조건식이 `false`라면 **값2**가 선택됩니다.
즉, `if-else`를 한 줄로 축약한 형태라고 볼 수 있습니다.
### 예제와 동작 방식
```java
// if-else
int score = 70;
String result;
if (score >= 60) {
	result = "합격";
} else {
	result = "불합격";
}

/// 삼항 연산자
String result = (score >= 60) ? "합격" : "불합격";
```
- `score >= 60` -> 조건식 평가(`70 >= 60` -> `true`)
- 참이므로 `"합격"`이 선택되어 `result`에 저장
- 최종 출력 : `합격`
만약 `score`가 50이라면 조건식이 `false`가 되어 `"불합격"`이 들어갑니다.
### 중첩 삼항 연산자
```java
int score = 85;

String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
System.out.println(grade);  // B
```
- 가능은 하지만, 중첩이 많아지면 가독성이 떨어지므로 복잡한 경우에는 `if-else if` 구조가 더 낫습니다.
### 자료형 주의
삼항 연산자의 두 결과값(`값1`, `값2`)은 같은 타입이거나 자동 변환이 가능한 타입이어야 합니다.
```java
int x = true ? 1 : 2   // o
int y = true ? 1 : "text"  // x (타입 불일치)
```

--- 
## 8. 주의할 점
1. **조건식은 반드시 boolean 결과여야 한다.**
```java
int score = 95;

if (score) {...}  // x (score가 정수라서 오류)
if (score > 50) {...}  // o (boolean 결과)
```
2. **switch문의 fall-through**
	`break`를 빼먹으면 의도치 않게 여러 case가 연속 실행됩니다.
3. **가독성**
	조건이 많으면 `switch`나 `if-else` 대신 다른 구조(예 : Map, Enum)를 쓰는 게 더 깔끔할 수 있습니다.
