# 패키지(Package) 란?
**패키지(Package)** 는 관련된 클래스와 인터페이스를 **정리하는 네임스페이스(namespace)** 입니다.
개념적으로는 **컴퓨터 폴더**와 비슷합니다.
- HTML 파일은 `html` 폴더
- 이미지 파일은 `images` 폴더
- 스크립트는 `scripts` 폴더
👉 마찬가지로, 자바 프로그램은 수백 ~ 수천 개의 클래스와 인터페이스로 이루어질 수 있기 때문에 **관련된 것들을 하나의 패키지에 묶어 관리**하는 게 효율적입니다.

자바 플랫폼은 이미 수많은 **클래스 라이브러리**(= 패키지 모음)를 제공하고 있습니다. 이를 **API(Application Programming Interface)** 라고 부릅니다.
- `String` -> 문자열 처리
- `File` -> 파일 생성, 삭제, 수정
- `Socket` -> 네트워크 통신
- GUI 관련 클래스 -> 버튼, 체크박스 등

즉, 개발자는 이 방대한 API를 활용해 **애플리케이션의 로직 설계**에 집중할 수 있고, 인프라(파일 처리, 네트워크, UI 등)는 API가 제공하는 패키지를 통해 간단히 해결할 수 있습니다.

---
## 코드 예시
### 1. 패키지 정의
```java
// src/com/example/bicycle/Bicycle.java
package com.example.bicycle;  // 패키지 선언

public interface Bicycle{
	void changeGear(int newGear);
	void speedUp(int increment);
	void applyBrakes(int decrement);
}
```
### 2. 같은 패키지 내 클래스
```java
// src/com/example/bicycle/MountainBike.java
package com.example.bicycle;

public class MountainBike implements Bicycle {
	private int speed;
	private int gear;
	
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	
	@Override
	public void speedUp(int increment) {
		speed -= decrement;
	}
	
	public void printStatus() {
		System.out.println("gear: " + gear + ", speed: " + speed);
	}
}
```
### 3. 다른 패키지에서 사용
```java
// src/com/example/test/PackageDemo.java
package com.example.test;

import com.example.bicycle.MountainBike;  // 다른 패키지 클래스 가져오기

public class PackageDemo{
	public static void main(String[] args) {
		MountainBike bike = new MountainBike();
		bike.changeGear(3);
		bike.speedUp(15);
		bike.printStatus();
	}
}
```

---
## 정리
- **패키지(Package)** = 관련 클래스와 인터페이스를 모아 높은 "폴더/네임스페이스"
	-**이점** : 코드 정리, 이름 충돌 방지, 재사용성 강화
 - **자바 API** = 자바 플랫폼이 제공하는 거대한 패키지 모음
 - **사용 방법**
	 - `package` 키워드 : 클래스가 속한 패키지 선언
	 - `import` 키워드 : 다른 패키지의 클래스 사용
👉 즉, 패키지는 **코드를 체계적으로 정리하고, 필요한 기능을 가져와 쉽게 쓰도록 돕는 도구"** 입니다.