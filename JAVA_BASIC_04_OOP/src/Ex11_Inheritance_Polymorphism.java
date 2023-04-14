class Pbase {
	int p = 100;

}

class Cbase extends Pbase {
	int c = 200;
}

class Dbase extends Pbase {

}

public class Ex11_Inheritance_Polymorphism {

	public static void main(String[] args) {
		//상속관계에서 부모타입의 참조변수는 여러개의 자식타입 주소를 가질 수 있다
		//이것이 자바에서 말하는 '다형성'이다
		
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString()); //Cbase@3d012ddd
		
		//다형성
		Pbase pbase = cbase;
		Dbase dbase = new Dbase();
		pbase = dbase;
		System.out.println(pbase.toString()); //Dbase@5e91993f
		
		/////////////////////////////////////////
		// 부모주소를 자식에게 ..... 불가.... 강제변환
		Cbase ccc = (Cbase)pbase;
	}

}
