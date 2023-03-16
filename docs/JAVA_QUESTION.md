# 자바 핵심 개념 정리
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
원시 타입: 실제 데이터 값을 저장하는 타입<br>
- 논리형 boolean 1byte<br>
- 문자형 char 2byte<br>
- 정수형 byte 1byte<br>
- 정수형 short 2byte<br>
- 정수형 int 4byte<br>
- 정수형 long 8byte<br>
- 실수형 float 4byte<br>
- 실수형 double 8byte<br>
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
오버라이딩: 상위 클래스가 가지고 있는 메소드를 하위 클래스가 재정의해서 사용<br>
오버로딩: 같은 이름의 메소드를 여러개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
프로그래밍에서 필요한 데이터를 추상화시켜 상태와 행위를 가진 객체로 만들고, 객체들간의 상호작용을 통해 로직을 구성하는 프로그래밍 방법
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
추상 클래스: 하나 이상의 추상 메소드를 포함하는 클래스<br>
인터페이스: 클래스들이 필수로 구현해야 하는 추상 자료형<br>
인터페이스는 추상 클래스와 달리 다중 상속이 가능하다<br>
상속관계를 쭉 타고 올라갔을 때 같은 조상 클래스를 상속하는데 기능까지 완벽하게 똑같은 기능이 필요할 경우에는 추상클래스를, 
상속관계를 쭉 타고 올라갔을 때 다른 조상 클래스를 상속하는데 같은 기능이 필요할 경우에는 인터페이스를 사용한다
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
동적으로 할당했던 메모리 영역 중 필요없게 된 메모리 영역을 주기적으로 삭제하는 프로세스
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
JVM: Java Virtual Machine의 약자로, 자바가 운영체제의 종류에 구애받지 않고 프로그램을 실행할 수 있도록 도와주는 역할<br>
1. Class Loader: 클래스 파일(바이트 코드)을 JVM내의 Runtime Data Areas로 로드<br>
2. Execution Engine: 클래스 로더를 통해 JVM내의 Runtime Data Area에 배치된 바이트 코드들을 명령어 단위로 읽어서 실행<br>
+Runtime Data Area: 자바 어플리케이션을 실행할 때 사용되는 데이터들을 적재하는 영역
</div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
불변 객체: 객체 생성 이후 내부의 상태가 변하지 않는 객체<br>
final: 수정할 수 없다는 의미의 키워드<br>
사용하는 이유: 항상 동일한 값을 반환할 것이기 때문에 동기화를 고려하지 않아도 되고 예외가 발생하여도 오류가 발생하지 않은 것처럼 다음 로직 핸들링이 가능하고 협업 시 값이 변하지 않음을 보장받을 수 있기에 이용히 편리해지기 때문
</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
Method 영역: 클래스 정보, static 변수, 변수 정보, 메소드 정보 등을 저장<br>
Heap 영역: 인스턴스를 생성할 때(new를 사용하여 객체를 만들 때) 생성되는 메모리 형식<br>
Stack 영역: int, long, boolean 등 기본 자료형을 생성할 때 저장하는 공간
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
new 연산자를 이용할 경우 메모리의 Heap 영역에 할당되고 리터럴을 이용한 경우에는 String Constant Pool이라는 영역에 할당된다
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 람다(lambda)에 대해 알아볼까요?</summary>
<div markdown="1">
메소드의 이름과 반환 값이 없는 익명 함수<br>
메소드를 하나의 식으로 표현한 것으로 함수를 간략하면서도 명확한 식으로 표현할 수 있게 해줌<br>
(매개변수, ...)->{실행문} 의 형태를 가짐
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 스트림(stream)에 대해 알아볼까요?</summary>
<div markdown="1">
컬렉션의 저장 요소를 하나씩 참조하여 람다식으로 처리할 수 있도록 해주는 반복자<br>
별도의 멀티스레드 구현 없이도 병렬처리가 가능
</div>
</details>
<br>

