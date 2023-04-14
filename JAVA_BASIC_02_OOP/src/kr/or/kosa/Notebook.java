package kr.or.kosa;
/*
노트북 클래스 == 설계도 (고유정보, 상태정보, 부품정보)
노트북은 마우스를 가지고 있다 (부품정보) >> 설계도 1장 추가 >> class Mouse {}도 필요 >> 데이터타입
마우스는 휠1개, 버튼2개, 좌표값을 가지고 있다

class Mouse {
	int x;
	int y;
}

노트북은 색상을 가지고 있다
노트북은 생산년도를 가지고 있다

 */
public class Notebook {
	//Public Mouse mouse = new Mouse(); // 이렇게 만들면 마우스와 통합되어 생명주기가 똑같음
	// (필요에 따라) 노트북이 마우스를 가질 수도, 아닐 수도 있게 하자!!!!!!!!!!!!!!!!!!!!!!!
	// 가진다 : 생성된 마우스의 주소값을 가질 수 있다 (heap에 생성된)
	
	public void handleMouse(Mouse mouse) {
		mouse.setX(100);
		mouse.setY(200);
		mouse.getPosition();
	}
	
	
	private String color; // ex) Black
	private int year;
	
	public String getColor() {
		return color + "색";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//함수 생성 (특수한 목적의 함수 : private member field 간접적으로 read, write)
	public int getYear() { //읽기저뇽
		return year;
	}
	public void setYear(int year) { // 쓰기저뇽
		if (year < 0) {this.year = 1999;}
		else {this.year = year;}
	}
	public void noteBookInfo() {
		System.out.printf("이 노트북은 %s색이고 %d년에 출시되었습니다\n",color,year);
	}
	
	/*
	객체지향언어 : capsulation(은닉화) >> 직접할당을 막고 간접할당을 통해서 접근,제어하겠다
	캡슐화를 modifier를 이용하여 private로 설정하면 됨;;; 너무 간단함^^;;;;;
	방법 > 자원을 private (참조변수 입장에서 객체에 접근했을 때 자원이 보이지 않으면 된당)
	
	1. 모든 member field 캡슐화
	2. 직접할당을 막고 간접할당을 통해서 원하는 값으로 제어
	3. 간접 : 개발자가 직접 논리를 제어하겠다.
	4. 간접 접근 함수생성 (write 함수, read 함수) >> RW, R, W 다됨..
	
	
	 */
	
}
