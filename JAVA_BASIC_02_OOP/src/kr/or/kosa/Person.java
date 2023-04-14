package kr.or.kosa;

/*
class == 설계도 == 데이터 타입(여러개를 모아놓은)

설계도(종이쪼가리) >> 구체화를 하지 않으면 그저 종이쪼가리 >> 구체화(메모리에 할당) >> 구체화된 자원을 객체(Object) 혹은 Instance라고 부릅니다

설계도 : 
field (고유, 상태, 부품(더 나누어질 수 있다))
Method(기능, 행위))
constructor(생성자 함수)
 */

public class Person {
	public String name; //초기화하지 않아도 default값(null)을 갖는다. 생성되는 객체마다 다른 값을 가질 수 있다
	public int age; // default 값 : 0;
	public boolean power; // default : false;
	
	public void personPrint() {
		System.out.printf("이름은 %s 나이는 %d 파워는 %s 입니다\n",name,age,power);
	}
	// member field, instance variable >> 객체변수 >> 주소값을 가지고 있는 변수

	/*
	1. instance variable 초기화 하지 않아도 된다 >> why >> default 값을 가지고 있음
		변수가 처음으로 값을 할당 받는 것 >> 초기화
	2. age member field 초기화 하고 싶엉~
		필요하다면 당연히 초기화할 수도 있음
		ex) public int age = 1; // 생성시 default 값을 내가 원하는 값으로 설정한다는 의미
	
	Today Point) why 초기화 안함? 응~ 내맘

	
	 */
	
	
}
