# 인터페이스(Interface)란?

객체는 외부와의 상호작용을 **메서드(Method)** 를 통해 정의합니다.
즉, 메서드는 객체와 외부 세계를 연결하는 **인터페이스(Interface)** 역할을 합니다.

예를 들어 TV의 전원 버튼은 사용자가 내부 전기회로를 직접 다루지 않고도 TV를 켜고 끌 수 있게 해주는 **인터페이스**입니다.

자바에서 인터페이스는 주로 **몸체가 없는(구현되지 않은) 메서드들의 집합**입니다.
즉, "이런 기능들이 있어야 한다"라는 약속을 정의하는 것입니다.

자전거의 행동을 인터페이스로 정의하면 다음과 같습니다.

```java
interface Bicycle{
	void changeCadence(int newValue);
	void changeGear(int newValue);
	void speedUp(int increment);
	void applyBrakes(int decrement);
}
```

이제 이 인터페이스를 실제 클래스에서 구현하려면 `implements` 키워드를 사용합니다.

```java
class ACMEBicycle implements Bicycle{

	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	// 인터페이스에 정의된 모든 메서드 반드시 구현해야 함.
	public void changeCadence(int newValue) {
		cadence = newValue;
	}
	
	public void changeGear(int newValue) {
		gear = newValue;
	}
	
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	
	public void applyBreakes(int decrement) {
		speed = speed - decrement;
	}
	
	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
	}
}
```

👉 이렇게 하면 `ACMEBicycle` 클래스는 `Bicycle` 인터페이스에서 약속한 동작들을 모두 제공한다는 걸 보장해야 하고, **컴파이러가 이를 강제합니다.** 만약 하나라도 빠지면 컴파일 에러가 발생합니다.

---
## 인터페이스를 사용하는 이유
### 1. 공통된 규약(약속)을 정의하기 위해

인터페이스는 **"이 클래스가 이런 기능들을 반드시 제공한다"** 라는 계약(contract)입니다. 예를 들어 `Bicycle` 인터페이스를 구현한다면, 어떤 자전거 브랜드 클래스든 **반드시** `changeGear()`, `speedUp()` 같은 메서드를 갖고 있어야 합니다.
👉 따라서 개발자 입장에서 "이 객체는 이런 동작을 보장한다"라는 확신을 가질 수 있습니다.
### 2. 다형성(Polymorphism)을 활용하기 위해

하나의 인터페이스 타입으로 여러 구현체를 다룰 수 있습니다.

```java
Bicycle bike1 = new ACMEBicycle();
Bicycle bike2 = new AnotherBrandBicycle();

bike1.speedUp(10);
bike2.speedUp(15);
```

👉`Bicycle` 인터페이스를 기준으로 코드를 작성하면, 새로운 자전거 브랜드 클래스를 추가하더라도 코드 수정이 최소화됩니다.
### 3. 유연하고 확장성 있는 설계를 위해

클래스 상속은 한 번에 하나의 부모 클래스만 가질 수 있지만, **인터페이스는 여러 개를 동시에 구현**할 수 있습니다.

```java
class SmartBicycle implements Bicycle, GPS, MusicPlayer{
	...
}
```

👉 이렇게 하면 한 클래스가 자전거 기능 + GPS 기능 + 음악 기능을 동시에 가질 수 있습니다.

---
## 정리
- **인터페이스(Interface)** : 구현 없이 메서드 시그니처(이름, 매개변수, 반환형)만 정의된 "약속"
- **구현 클래스(Class)** : `implements` 키워드를 사용해 인터페이스를 실제로 구현
- **의미** : 인터페이스는 클래스와 외부 세계 간의 계약(contract) 역할을 하며, 자바 컴파일러가 이 계약을 반드시 지키도록 강제