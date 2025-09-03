# Java란 무엇인가?

## 📖 학습 목표
- Java란 무엇인가 이해한다.
- Java의 주요 특징에 대해 설명할 수 있다.

## 📝 개념 정리
### 1. 개념
#### Java란 무엇인가?
Java는 1995년 Sun Microsystems(현재 Oracle이 소유)에서 James Gosling이 주도하여 개발한 프로그래밍 언어이자 컴퓨팅 플랫폼입니다. Java의 철학은 "Write Once, Run Anywhere"이며, 이는 한 번 작성한 코드가 다양한 운영체제와 플랫폼에서 동일하게 실행될 수 있다는 의미로, 플랫폼 독립적인 프로그래밍을 실현하는 것이 Java의 핵심 목표입니다.
#### Java의 주요 특징
##### 객체 지향 프로그래밍(Object-Oriented Programming, OOP)
자바는 모든 것을 객체로 모델링하는 객체 지향 언어입니다. 객체 지향 프로그래밍은 프로그램을 여러 개의 '객체' 단위로 쪼개어 만들고, 이 객체들이 서로 상호작용하도록 설계하는 프로그래밍 패러다임입니다. 자바는 객체 지향의 4가지 주요 개념인 **캡슐화(Encapsulation), 상속(Inheritance), 다형성(Polymorphism), 추상화(Abstraction)** 을 지원합니다.
##### 플랫폼 독립성 (Platform Independence)
자바는 **자바 가상 머신(Java Virtual Machine, JVM)** 덕분에 플랫폼 독립성을 가지고 있습니다. 자바 소스 코드를 컴파일하면 바이트코드(.class파일)가 생성되는데, 이 바이트코드는 특정 운영체제에 종속되지 않습니다. JVM은 각 운영체제(WindowsOS, macOS, Linux 등)에 맞게 설치되어 이 바이트코드를 해당 운영체제가 이해할 수 있는 기계어로 변환하여 실행합니다.
##### 자동 메모리 관리 (Automatic Memory Management)
자바는 **가비지 컬렉터(Garbage Collector)** 를 통해 사용하지 않는 메모리를 자동으로 찾아 없애줍니다. 개발자가 직접 메모리를 할당하고 해제하는 번거러움이 줄어들어 개발 효율성을 높이고 메모리 누수 오류를 방지하는 데 도움을 줍니다.
##### 멀티스레딩 지원 (Multithreading Support)
자바는 언어 차원에서 **멀티스레딩(Multithreading)** 을 지원하여 동시에 여러 작업을 처리할 수 있도록 지원합니다.
##### 강력한 보안
자바는 JVM이라는 보호된 가상 환경 내에서 실행됩니다. 덕분에 바이러스나 악성 코드가 운영체제에 직접 접근하여 시스템을 손상시키는 것을 막아주어 보안에 강합니다.

### 2. 핵심 키워드
- 객체 지향 프로그래밍(Object-Oriented Programming, OOP)
- 가비지 컬렉터(Garbage Collector)
- 멀티스레딩(Multithreading)
