# 클래스(Class)란 무엇인가?

현실 세계에서는 동일한 종류의 객체가 여러 개 존재합니다.
예를 들어, 같은 제조사와 모델로 만들어진 자전거가 수천 대 있을 수 있습니다.
각 자전거는 같은 **설계도(blueprint)** 로 만들어졌기 때문에 동일한 구성 요소를 가지고 있죠.

객체지향 프로그래밍에서 우리는 이렇게 말합니다.
👉 "여러 자전거 객체는 `Bicycle`이라는 클래스의 인스턴스(instance)다."

즉, **클래스(Class)** 는 **객체(Object)를 생성하기 위한 설계도**입니다.

---
## 예시 : 자전거 클래스 구현
```java
class Bicycle{
	// 상태(State) = 필드(Field)
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	// 행동(Behavior) = 메서드(Method)
	void changeCadence(int newValue) {
		cadence = newValue;
	}
	
	void changeGear(int newValue) {
		gear = newValue;
	}
	
	void speedUp(int increment) {
		speed = speed + increment;
	}
	
	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}
	
	void printStates() (
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
	)
}
```
- **필드 (cadence, speed, gear)** -> 자전거의 상태
- **메서드 (changeCadence, changeGear, speedUp, applyBrakes)** -> 자전거의 행동

👉 이 클래스에는 `main()` 메서드가 없습니다.
이유는 `Bicycle` 클래스는 단순히 **객체를 정의하는 설계도**일 뿐이고, 실제로 객체를 만들고 사용하는 역할은 다른 클래스가 해야 하기 때문입니다.

---
## 객체 생성 및 사용
```java
class BicycleDemo {
	public static void main(String[] args){
	
	// 두 개의 자전거 객체 생성
	Bicycle bike1 = new Bicycle();
	Bicycle bike2 = new Bicycle();
	
	// 첫 번째 자전거 동작 수행
	bike1.changeCadence(50);
	bike1.speedUp(10);
	bike1.changeGear(2);
	bike1.printStates();
	
	// 두 번째 자전거 동작 수행
	bike2.changeCadence(50);
	bike2.speedUp(10);
	bike2.changeGear(2);
	bike2.changeCadence(40);
	bike2.speedUp(10);
	bike2.changeGear(3);
	bike2.printStates();
	}
}
```
---
## 보충 설명
- `Bicycle` 클래스는 **객체를 정의하는 틀(blueprint)**
- `BicycleDemo` 클래스는 실제 실행을 담당하는 **애플리케이션 진입점**
- `bike1`, `bike2`는 각각 **Bicycle 클래스의 인스턴스(instance)**
- 같은 클래스에서 만들어졌지만, 각 객체의 상태(`cadence`, `speed`, `gear`)는 서로 독립적
👉 즉, 클래스는 "설계도", 객체는 그 설계도로 만든 "실제 제품"이라고 비유할 수 있습니다.
