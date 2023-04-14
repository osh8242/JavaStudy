import kr.or.kosa.common.Car;

/*
클래스 == 설계도 == 타입(사용자 정의 타입)
클래스의 구성 요소 (설계도라고 판단하려면 최소한 무엇을 가지고 있어야 한다)
[멤버필드 + 메소드] + 생성자
(속성 + 함수)

필드 (member field) >> 데이터, 자료 정보를 담고 있다 >> 고유정보, 상태정보, 부품정보**
함수 (Method) >> 기능(행위) >> ex) 자동차 >> 달린다, 멈춘다, 소리가 난다, 문을 연다 등...
+ 추가적으로 생성자(함수) >> 특수한 목적의 함수 >> 객체가 생성시 member field 초기화하는 목적으로 생성되는 함수
	getter, setter, (read, write)

class 설계도 {
	고유정보
	상태정보
	부품정보
	
	method
} 설계하는 연습이 필요하다...........

클래스, 필드, 생성자함수, 메소드 : 영역을 가지고 있음(scope, 범위) 
>> scope는 생성되는 장소(위치)나 modifier를 가지고 제어

장소(위치) : package를 기반으로 ... 클래스 내부인지, 함수 내부인지, 제어문 내부인지에 따라 범위가 다름~~
접근자 : public, private, default, protected

kr.or.kosa.common 안에 생성한 Car 클래스는 >> public class Car{} >> public 이므로 다른 폴더에서도 사용가능
kr.or.kosa.common 안에 생성한 AirPlane 클래스는 >> class AirPlane{} >> 같은 폴더에서만 사용가능. 다른 폴더에서 import 해도 안됨.

default : 같은 폴더(패키지) 내에서만 사용가능하게 하겠다.
	>> default는 잘 사용하지 않음. 보통 연습용으로. 또는 특정 클래스에만 도움을 주는 클래스 생성시

연습용으로 빠르게 작업 ....하려면 어떻게 해야 편할까?
하나의 물리적 Java 파일은 여러개의 클래스를 가질 수 있다
>> Ex01_Main.java 파일은 그 안에 public class Ex01_Main 클래스를 가지고 있다.
1. 개발에서는 필요한 클래스는 package를 생성하고 그 안에 만들어서 사용한다. Car 클래스처럼
2. 그냥 연습할 경우에는 굳이 패키지(폴더)를 여러개를 만들어서 할 필요가 있을까
3. 하나의 물리적 파일에 여러개의 클래스를 만들어서 쓸 수 있게 해줄게 (연습할 때 써..)
3-1. 대신에 public 접근자는 한 놈만 갖을 수 있음 


*/
class Emp{ //연습할 때나 한 파일에 클래스 여러개 만들지 실제로는 따로 파일 만들어서 사용 권장
			// 한 파일에서는 public을 갖는 클래스는 오직 하나이므로
	}

class Dept{ // 컴파일러가 default class Dept 로 해석한다.(default)
			// public을 붙이면 The public type Dept must be defined in its own file 에러가 난다.
	int deptNo;
	public String dname; // 이 클래스 자체가 default인데 변수가 public일 이유가 있을까?
						 // 에러는 아니지만 class Dept가 default라서 다른 위치에서 접근할 수 없으므로
						 // public일 이유가 없다.
	
	private int count;	 // private : 캡슐화(은닉), 감추다, 숨기다.
						 // private이 선언된 클래스에서만 사용가능.
						 // 같은 폴더, 같은 파일이든 상관없이 다른 곳에서는 사용불가
						 // 설계자의 의도1 : class 내부에서만 사용하는 목적으로 private 선언
						 // 설계자의 의도2 : 외부에서 직접 접근을 막고 간접 접근을 통해서만 제어할 수 있게하자.
	// public을 이용해 private을 제어하는 특수한 함수 getter(읽기전용함수), setter(쓰기전용함수)
	public int getCount( ) {
		return this.count;
	}
	public void setCount(int count) { // 간접할당 : 함수를 통해서 변수값을 간접할당***
		if( count < 0 ) { 
			this.count = 0;
		} else {
			this.count = count;
		}
				
	}
}

//class Apt { 이미 같은 패키지(default) 내부에 Apt가 있으므로 같은 이름으로 Apt를 또 만들면 오류남니다.
//	
//}

/*
폴더
kr.or.kosa.dto.Test

public class Test {
	private int i;
	
	public void setI(int i){
		this.i = i;
	}
	
	public int getI(){
		return this.i;
	}
	
	pubilc void print(){
	
	}
}
 */

class Test {  // modifier 를 선언하지 않았으므로 default
	int data; // modifier는 default. 클래스가 가지는 변수 (member field) >> instance variable
	
	void print() { // modifier는 default
		int num=0; // local variable 지역 변수이며 반드시 초기화해야 사용가능
		for (int i =0 ; i <= 100; i++) { // 변수 i는 for문의 시작하면 만들어지고 끝나면 사라짐
			
		}
		for (int i =0 ; i <= 100; i++) { // 앞 for 문에서 이미 int i가 선언되었지만 다시 사용해도 괜찮음.
			
		}
		for (int k =0 ; k <=100; k++) {
			
		}
		System.out.println(num);
		
	}
}
//변수 data는 class Test 가 생성될 때 new Test() 하면 만들어짐.
//변수 num은 print()라는 함수가 호출되었을 때 생성됨.
//변수 i는 for문이 실행될 때 생성됨.

public class Ex01_Main {

	public static void main(String[] args) {
		// 같은 폴더 안에 있는 클래스...
		Apt apt = new Apt(); // class Apt 이므로 폴더 내부에서만 Apt를 사용가능
		Car car = new Car(); // Public class Car 이므로 폴더의 구분없이 어디서나 Car 사용가능
		// kr.or.kosa.common.Car car = new kr.or.kosa.common.Car(); //이렇게 사용도 가능.. but 누가 일케씀? 
		
		Dept dept = new Dept();
		//dept.count // count 변수는 캡슐화되어서 같은 파일 내이지만 사용불가 
		
		dept.deptNo = 100;
		System.out.println(dept.deptNo);
		
		dept.dname = "IT";
		System.out.println(dept.dname);
		
		dept.setCount(-100);
		System.out.println(dept.getCount());
		
		Test test = new Test();
		test.print();

	}

}
