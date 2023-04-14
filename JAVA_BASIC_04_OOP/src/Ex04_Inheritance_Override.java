/*
Today Point
상속관계에서 override : 상속관계에서 자식이 부모의 함수를 재정의하는 것
상속관계에서 자식클래스가 부모클래스의 메소드를 재정의(내용을 바꿈)
재정의 : 규칙의 변화가 없고 (함수의 이름, 타입) 내용만 변환(중괄호 안에 실행코드 코드 수정)

문법)
1. 부모함수 이름 동일
2. 부모함수 parameter 동일
3. 부모함수 return type 동일
4. 결국에는 { 실행블럭 코드만 변경하는 것이 오버라이딩 }
 */

class Point2{
	int x = 4;
	int y = 5;
	String getPosition() {
		return this.x+"/"+y;
	}
}

class Point3D extends Point2{
	int z = 6;
	
	// z까지 나오는 함수를 만들고 싶어용
	// 내가 만든 함수가 정말 재정의 인지 아닌지 검증하고 싶어여ㅕㅕㅕ
	
	//Annotation
	/*
	1.주석이라는 뜻으로 컴파일러에게 정보를 제공한다
	2.소프트웨어 개발툴이 빌드나 배치시 코드를 자동으로 생성할 수 있도록 정보제공
	3.실행시(런타임시) 특정 기능을 실행하도록 정보를 제공
	 */
	
	@Override //컴파일러에게 코드 작성 문법 에러를 체크하도록 정보를 제공
	String getPosition() {
		return super.getPosition()+"/"+z; 
	}
}

public class Ex04_Inheritance_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		String result = p.getPosition();
		System.out.println(result);
	}

}
