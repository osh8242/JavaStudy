import java.util.Vector;

/*
Collection FrameWork
'다수의 데이터'를 다루는 표준화된 '인터페이스'를 구현하고있는 '클래스'의 집합
이제부터는 여태까지 배운 문법들을 활용하는 것을 배울 것이다!!

Collection (인터페이스) >> 상속 >> List >> 구현 >> ArrayList
Collection (인터페이스) >> 상속 >> Set >> 구현 >> HashSet

** ArrayList 의 부모타입은 List이다 (ㅇ) 
	>> List로 다양한 ArrayList 객체주소를 받을 수 있다(다형성)
** Collection 인터페이스는 ArrayList의 부모타입이다 (ㅇ)
** instanceof로 검증가능하다

Map 인터페이스 (key, value) 쌍의 배열 >> 구현 >> HashMap

1. List (줄을 서시오)
순서가 있는 데이터의 집합(List)을 다룬다(index로 순번관리, 중복데이터 허용)

>>tip) 
Array 관리 >> [홍길동][홍길동][홍길동][홍길동][홍길동].. >> [0]번째 방에 있는 홍길동 나와!!!!!
Array는 처음부터 방의 크기를 잡아야하고 크기가 고정이므로 자유롭게 쓰기 힘듬니다

1.1 Vector (구버전) -> 동기화 보장 (ㅇ) -> Lock 기능이 default로 탑재
>> Vector(like 화장실처럼 한명이 사용하면 잠궈버림) 
>> 멀티스레드 환경에서 lock기능활용 >> 성능은 떨어지지만 보안이 좋음

1.2 ArrayList (신버전) -> 동기화 보장 (X) -> Lock 기능이 필요하면 사용(option)
>> ArrayList(like 비빔밥) 
>>멀티스레드 환경 lock >> 성능이 좋으나 보안이 안좋음

요새는 Vector는 잘 안씀.. 오래된 시스템에서나 쓰는거기 때문에..
==============================================================

다수의 데이터를 다루는 방법 (Array >> 정적, 고정)
*************************배열(Array)는 한번 크기가 정해지면 크기 변경이 불가능함.. 너무 불편..
정수 배열 3가지 만드는 방법
1. int[] arr1 = new arr1[3];
2. int[] arr2 = {1,2,3};
3. int[] arr3 = new arr3[]{1,2,3};
arr3가 놀고 있는데 데이터가 100건이 추가되어야한다면,,
int[] arr4 = new int[100];
**************************새로운 배열을 만들고 데이터를 이동해야함(코드로 직접 개발자가 구현해야함)
>> Collection은 이 배열을 새로 만들고 이동하는 과정을 자동으로 해줌!!

Array\
1. 배열의 크기가 고정 : Car[] cars = {new Car(), new Car()} 2개짜리 Car 배열
2. 접근방법 (index)로~

List 인터페이스를 구현하고 있는 ArrayList, Vector는
1. 배열의 크기가 동적으로 확장 or 축소 기능? >> 아님 >> 진실은 컴파이럴가 새로운 배열을 만드는 것
2. 순서를 유지 (내부적으로 Array) 사용, 중복값 허용
3. 중복값 허용 (index를 통해서 제어)


 */


public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기용량 : " + v.capacity()); // 초기용량 10
		System.out.println("size : 값의크기(개수) : "+v.size()); // 초기보유개수 0
		
		v.add("AA"); // object를 인자로 받을 수 있는데 모든 데이터는 object의 자식이므로 인자로 가능
		v.add("BB");
		v.add("CC");
		v.add(10);
		System.out.println("size : 값의크기(개수) : "+v.size());
		System.out.println(v.toString());
		//Array >> 배열의 개수를 알아보는 함수 >> length(); >> 방의 개수를 센다
		//Collection >> size(); >> 채워져있는 값의 개수를 센다
		//Collection >> 객체를 알고싶다 >> 함수 get([index]) 를 사용한다
		for (int i = 0 ; i < v.size() ; i++) {
			System.out.println(v.get(i));
		}
		for (Object obj : v) {
			System.out.println(obj);
		}
		//단점 : 작은 데이터(같은 타입의 데이터) >>> 가장 큰 타입을 사용해서 얻는 것이 불합리적이다
		//>> 제너릭 >> 타입을 강제 >> Point!
		Vector<String> v2 = new Vector<>();
		v2.add("hello");
		v2.add("world");
		for (String str : v2) {
			System.out.println(str);
		}
		
		Vector v3 = new Vector<>();
		System.out.println(v3.capacity()); // Object[] obj = new Object[10]; 동적
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A"); // 11번째
		
		System.out.println(v3.toString());
		System.out.println(v3.capacity()); // 용량 20
		
		// 그냥 편하게 쓰세요 (동적으로 늘어나고 줄어요)
		// 새로운 배열을 만들고 이사시키는 작업을 자동으로 해주는 거예요..
		
		
	}

}
