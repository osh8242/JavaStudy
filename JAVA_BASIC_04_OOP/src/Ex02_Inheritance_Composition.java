import java.util.Scanner;

/*
현업 개발
한개의 클래스로 설계하는 경우는 거의 없다

설계도 1장 모든 업무를 구현.. 현실적으로 불가능
설계도를 여러개로 나눈다... 문제 발생 (기준, 논리)

쇼핑몰
결제관리, 배송관리, 재고관리, 회원관리, 상품관리, 판매처관리, 카드관리... >> 각각의 업무별로 설계도

**************** 기준 ****************
여러개의 설계도가 있을 때 설계도끼리의 관계.... 만들어주는 기준

1. 상속관계  is ~ a	: A는 B이다 (부모를 뒤에 놓는다)
2. 포함관계  has ~ a	: A는 B를 가지고 있다
 
 원은 도형이다
 경찰은 권총이다 (x)
 경찰은 권총을 가지고 있다
 
 원은 도형이다
 원 extends 도형
 삼각형은 도형이다
 삼각형은 extends 도형
 
 원은 점을 가지고 있다 (o)
 has ~ a (부품정보)
 >> class 원 {점이라는 부품이 member field 구현}
 >> class 점 {x,y}
 
 경찰 권총
 경찰은 권총이다(x)
 경찰은 권총을 가지고 있다
 class 권총{}
 class 경찰{권총 member field}
 
 원은 도형이다
 삼각형은 도형이다
 사각형은 도형이다
 
 도형 분모 (공통적) 자원 : 추상화, 일반화 >> 그리다, 색상
 원은 : 구체화, 특수화(자신만이 가지는 특징) >> 반지름, 한점
 
 점 : 좌표값 (x,y)
 원은 점을 가지고 있다
 삼각형은 점을 가지고 있다
 사각형은 점을 가지고 있다
 
 ---------------------------------------------------
 class Shape{ 그리다, 색상 }
 class Point {좌표값} >> 포함관계 >> {부품}
 
 구체화, 특수화 : Circle, Triangle
 
 */

class Shape{
	String color= "violet";
	void draw() {
		System.out.println("도형을 그리다");
	}
}

class Point{
	int x;
	int y;
	
	public Point() {
		this(1,1);	
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

//문제1)
/*
원을 만드세요
1. 원은 도형이다 (is ~ a) : 원은 Shape이다
2. 원은 점을 가지고 있다 (has ~a) : Point
3. 원은 특수화되고 구체화된 내용은 '반지름'이다

원의 반지름은 초기값 10을 가진다
점을 좌표는 초기값 (10,15)를 가진다
초기값을 설정하지않으면 반지름과 점의 값을 입력받을 수 있다

 */
class Triangle extends Shape{
	Point[] points;
	
	Triangle() {
		this(new Point(0,0), new Point(0,1), new Point(1,0));
	}
	
	Triangle(Point point1,Point point2,Point point3) {
		this.points = new Point[] {point1, point2, point3};
	}
	
}

class Circle extends Shape{
	Point point;
	int radius;
	
	public Circle(){
		this(10, new Point(10,15));
	}
	
	public Circle(int r, Point point) {
		this.radius = r;
		this.point = point;
	}
	
}

public class Ex02_Inheritance_Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		System.out.println(c.radius);
		System.out.println(c.point.x); // [주소값].[주소값]... 이런 유형 많음
		System.out.println(c.point.y); // .을 통해 계속 주소 타고감~
		c.draw();
		
		//반지름, 점의 값을 자유롭게
		/*
		Point point = new Point(10,20);
		Circle circle2 = new Circle(100, point)
		 */
		
		Circle c2 = new Circle(100, new Point(10,20));
		
		Triangle tri = new Triangle();
		//tri.trianglePoint();
		
		Triangle tri2 = new Triangle(new Point(1,2), new Point(3,4),new Point(5,6));
		//tri2.trianglePoint();
		
		
		Point[] parray = new Point[] {new Point(11,22),new Point(33,44),new Point(55,66)};
		Triangle tri3 = new Triangle();
		//tri3.trianglePoint();

	}

}
