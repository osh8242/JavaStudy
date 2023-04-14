/*
OOP 특징 (여러개의 조각(작은)클래스들을 조립해서 하나의 큰 그림을 만든다~~)
설계도 : 메인 설계도의 부분 설계도, 메인 설계도의 하위 설계도, 별도의 독립적인 설계도....

1.상속
2.캡슐화(은닉화) >> 'private' modifier로 구현
3.다형성 (상속관계에서 부모타입의 자식타입의 주소를 가질 수 있다) 

상속 선언
JAVA	: 'child extends Base'
C#		: 'child : base'

상속 특징
1. 다중 상속 불가(단일 상속 원칙 >> 계층적 상속을 통해서 극복)
2. 계층적 상속(여러개의 클래스를 상속)
3. 다중 상속 지원 (단, interface만.. )
	interface (표준, 약속, 규칙, 규약을 정의하고 있는 클래스)

상속이란?
1. 진정한 의미 : 재사용성!!!
2. 단점 : 비용.. (초기설계비용이 많이듬)
		부모-자식 간의 종속성이 너무 커서 안좋아요.. >> 요새 트렌드는 느슨한 관계를 좋아해요..
3. 재사용성 >> 설계 >> 시간 >> ... 재사용성이 높아져서 장기적으로보면 이득임...  

모든 클래스는 메모리에 올라가야 사용가능 하다

Child child = new Child();

메모리 상에는 GrandFather >> Father >> child 순으로 올라감

사용자가 만드는 모든 클래스는 default (명시하지 않아도) : Object를 상속한다
class Car Extends Object 생략
Object >> Root >> 최상위 >> 모든 클래스의 부모인 수준(like 단군)

 */
class Car {// Car extends Object
	
	
}

class GrandFather {
	public int gmoney=5000;
	private int pmoney = 100000000; //private은 상속관계라 하더라도 접근불가
	public int getPmoney(){
		return pmoney;
	}
	public GrandFather() {
		System.out.println("에헴. 할애비다~");
	}
	
}

class Father extends GrandFather{
	public int fmoney=3000;
	public Father() {
		System.out.println("으흠~ 애비다");

	}
}


class Child extends Father {
	public int cmoney=100;
	public Child() {
		System.out.println("전 응애입니다");
	}
	
}

public class Ex01_Inheritance {
	
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
	}

}
