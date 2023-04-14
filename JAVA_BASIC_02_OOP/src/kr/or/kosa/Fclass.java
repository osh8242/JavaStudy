package kr.or.kosa;
/*
기능(행위) 만드는 방법
method 만드는 방법(문법)

method : 행위 또는 기능의 최소단위 구현 : [하나의 함수]는 [하나의 기능]만 구현
ex) 먹는 기능, 자는 기능

ex) 롯데월드 : 게임방 : 동전(농구), 동전 뽑기 (포켓몬)

**모든 함수는 호출에 의해서만 동작한다**
누군가 이름을 부르지 않으면 동작하지 않는다.

java)
1. void, parameter(o) : public void print(String str) { 실행구문 }
2. void, parameter(x) : public void print(){ 실행구문 } //공짜
3. return type, parameter(o) : public int print(int data) { return 100; }
4. return type, parameter(x) : public int print() { return 100;} 

void >> 돌려주는 값이 없어요 >> return type 없어요
return type >> 8가지 기본타입 + String + Array + class, interface, collection
이 중에서 8가지 + String + class 부터 학습을 시작하지.

public boolean print(){ return true; }
Car print(){return Car주소값} // Car라는 클래스를 리턴해야하므로 Car클래스를 new Car();로 생성하여 주소값을 리턴해야한다........-
--> Car print() {return new Car();}
--> Car print() {Car car = new Car(); return car;}

String print() {return "";}
 
parameter type >> void print(String 변수)
parameter type >> 8가지 기본타입 + String + Array + class, interface, collection
 
void print( int i ){ } >> 호출 print(100);
void print( String str ) {} >> 호출 print("이예진");
void print ( Car c ) {} >> 호출 >> Car c1 = new Car(); print(c1);    or   print(new Car());
 
void print2(int a, int , b, int c){} // 실행할 때 3개의 parameter를 받음
print2(10); XXXXXXXX
print2(10,10); XXXXXXXXXXXXX
print2(10,10,"10"); XXXXXXXXXXXXXXXX
print2(10,10,10); OOOOOOOOOOOOOO

함수의 이름은 어떻게 만들면 좋을까요??
관용적으로는 첫자를 대문자로
단어를 조합해서 함수명만으로도 어떤 기능을 하는지 알아볼 수 있도록
 
메소드는 : getNumber();
사원테이블에서 사원의 모든 정보를 가지고 오는 함수를 만들어라
void getEmpAllList()

사원테이블에서 사원의 번호를 가지고 사원의 모든 정보를 가지고 오는 함수를 만들어라
void getEmpListByEmpno()
 
 


 */


public class Fclass {
	public int data;
	
	// void m() >> 컴파일러가 자동으로 modifier가 default 되므로 같은 폴더(package)에서만 호출(사용)가능해진다.
	
	// 함수의 접근자(수정자)는 70%가 public, 나머지 30%는 private
	// 'class 내부에서는' public이나 private이나 서로 접근이 가능하므로 구분이 무의미하다
	// 클래스 내부에서 사용해라>> 이런 함수를 다른 함수를 도와주는 함수 (공통함수)
	
	public void m() { //void이면서 pararmeter(x)
		// 기능 구현
		System.out.println("일반함수 : void, parameter(x)");
	}
	
	public void m2(int i) {
		System.out.println("일반함수 : void, parameter(0)");
		System.out.println("parameter 값을 활용 : " + i);
	}
	
	public int m3() {
		//무조건 return (type var);이 있어야함
		return 10000;
	}
	
	public int m4(int data) {
		return 100+data;
	}
	// 여기까지 m()~m4()가 가장 베이직한 함수 4가지이다.
	
	
	//return type(o), parameter(o)
	public int sum(int i , int j , int k) {
		return i+j+k;
	}
	
	//함수의 접근자(수정자) 한정자
	//int sum(); >> 컴파일러가 default int sum(); 으로 만듬
	//private int sum() >> 객체입장에서 접근 불가 >> 같은 클래스 안에서만 접근가능
	//private 클래스 내부에서 다른 함수를 도와주는 공통함수이다
	
	private int subSum(int i) {
		return i + 100;
	}
	
	//Fclass fclass = new Fclass();
	//fclass.에서도 이름이 뜨지않아요
	
	public void callSubSum() {
		int result = subSum(100); // private 함수를 호출해서 사용함
		System.out.println("call result : " + result);
	}
	
	public int opSum(int data) {
		//다양한 로직 (제어문)
		int result = subSum(data);
		//제어문
		if(result>0) {
			return 1;
		}else {
			return -1;
		}
	}
	
	//Quiz
	/*
	함수를 생성하는데
	정수타입의 parameter 2개를 받아서.. 둘 중에 큰 값을 리턴하세요 
	ex) max(10,5) 값을 입력하면 10이 반환되어야해요.
	
	 */
	
	public int max(int a, int b) {
		return (a>=b)?a:b;
	}
	// return 수를 최대한 줄이자.
	// 굳이 불필요한 변수를 담지말자. 어차피 함수는 블랙박스라 내부가 자세할 필요가 없다...
	
	
}
