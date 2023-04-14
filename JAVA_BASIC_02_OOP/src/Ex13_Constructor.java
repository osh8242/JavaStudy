/*
생성자 함수(constructor)
1. 특수한 목적의 함수
2. 목적(member field 초기화 >> static{}, {} >> 이런 초기화 블럭은 잘 안씀니다)
3.  일반 함수와 다른점
3.1 함수 이름이 고정(class이름과 동일함)
3.2 return type 이 없다.. void 함수임니다. 
3.3 실행시점 >> new 를 통해서 객체를 생성 >> heap에 객체가 생성됨 >> 객체의 member field 할당 >> 자동으로 생성자함수 출동!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
3.4 void 함수이지만 너무나 당연해서 생략함니다. >> public 클래스이름(){} 이런식으로 코딩함니다

4. 왜 만들까? > 생성되는 객체마다 강제적으로 member field를 초기화하고 싶어서용.....

class Car {String color;}
>>설계도를 만든이는 자동차 색상은 니가 알아서 해라해 (안해도 어쩔 수 없다해)

class Car {String color = "blue"}
// 객체를 생성하면 무조건 자동차의 색은 blue로 세팅되어있음
  
 문제) 자동차의 색상을 정하지 않고 출고
 설계도를 사용하는 사라미 자동차를 만들때 색상을 넣지 않으면 출고 안되게 하고 싶어욧!!!!
 >> 생성자 설계를 강제하지 않으면 객체 안 만들어져욧!!!!!!
 
 5. 생성자 함수는 1개만 만들까.....???????????????????????????????????????????????????????????????????????????????????????????
 **6. 생성자 함수도 오버로딩(overloading)이 가능하다구욧?!!!!! 이걸로 객체생성 조건구현이 가능하다구욧?????????????????????????????????????????????????
 ****** 생성자 함수를 쓰는 가장 중요한 목적은 member field의 강제적 초기화라구욧!!!!!!!!
 */

class Car{
	String carname="포니";
	//생성자 (default constructor) >> 기본 생성자
	public Car() {
		System.out.println("저는 기본생성자라구욧!!!!!!!!!!!!!!!!");
		  carname = "내 마음♥";
		}
}

class School {
	String schoolName = "강남";
	//public School(){}
	//컴파일러가 School 객체를 만들 때 생성자함수가 없다면, 
	//자동으로 생성자함수를 만들어준다구욧!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
}
////////////////////////////////////////////////////////////////////////////////////////////
class Car2{
	String carname;
	//생성자가 생략되어있음 public Car2(){}
	
}

class Car3{
	String carname; // default : null
	public Car3() {
		this.carname = "포니포니♥";
	}
}

//이 설계도 Car4는 자동차를 만드는데 있어서 2가지 선택지를 줍니다
//그냥 만들면 carname이 "기본이름"이지만 문자열을 주면서 만들면 문자열이 carname이 됩니다.
class Car4{
	String carname;
	public Car4() {
		this.carname = "기본이름";
	}
	//overloading (함수) >> 생성자함수(특수목적) >> 생성자 >> overloading 가능!!!!
	public Car4(String carname) {
		this.carname = carname;
	}
}

//설계의도 : 차 이름 무조건 넣어라 안넣으면 차 없다
class Car5{
	String carname;
	public Car5(String name) {
		carname = name;
	}	
}

class Car6 { // 상품주문서와 비슷한 느낌(overloading 기본 상품 or 옵션추가 기능 구현가능)
	String carcolor;
	int door;
	public Car6() {
		carcolor="blue";
		door=4;
	}
	public Car6(int num) {
		carcolor = "blue";
		door = num;
	}
	public Car6(String color, int num) {
		carcolor = color;
		door = num;
	}
}

////////////////////////////////////////////////////////////////////////////////////////////
public class Ex13_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(); // 기본 생성자에욧!!!!!!!!!!!!!!!!
		System.out.println(car.carname);
		School school = new School(); // default constructor를 불러보아요!
		
		Car4 car4 = new Car4("포니포니♥");
		System.out.println(car4.carname);
		
	

	}

}
