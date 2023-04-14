/*
원칙 : 객체를 생성할 때 생성자는 1개만 호출가능 { new Zcar() ,,, new Zar(10) ,,,}

 this >> 객체 자신
 
 Zcar(){}

 */
/*
class Zcar{
	String color;
	String gearType;
	int door;
	Zcar(){ //기본 설정
		this.color = "red";
		this.gearType = "auto";
		this.door = 2;
	};
	Zcar(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	void socarPrint() {
		System.out.println(this.color + " , " + this.gearType + ", " + this.door);
	}
	
}
*/

class Zcar{
	String color;
	String gearType;
	int door;
	Zcar(){ //기본 설정
		this("red","auto",2); // 나를 다시 부르네?! ... 생성자를 다시 호출
	}
	Zcar(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	void socarPrint() {
		System.out.println(this.color + ", " + this.gearType + ", " + this.door);
	}
	
}

class Zcar2{
	String color;
	String gearType;
	int door;
	Zcar2(){ //기본 설정
		this("red", 2);
		System.out.println("default");
		//기본옵션(red,2,auto)
	}
	Zcar2(String color, int door) {//색상과 문개수 변경
		this(color, "auto", door);
		System.out.println("parameter 2 constructor");
		//옵션 color, door 변경 (default auto)
	}
	Zcar2(String color, String gearType, int door) { //모든 옵션은 변경가능합니다
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("parameter 3 constrctor");
		//옵션 color, door, gearType 모두 설정
	}
	
	void socarPrint() {
		System.out.println(this.color + ", " + this.gearType + ", " + this.door);
	}
	
}

public class Ex16_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zcar zcar = new Zcar();
//		zcar.socarPrint();
//		
//		Zcar zcar2 = new Zcar("Yellow", "auto", 10);
//		zcar2.socarPrint();
		
		Zcar2 car = new Zcar2(); // 기본옵션
		
		Zcar2 car2 = new Zcar2("Gold", 2);
		
		Zcar2 car3 = new Zcar2("Gold", "auto", 20);
		
	}

}
