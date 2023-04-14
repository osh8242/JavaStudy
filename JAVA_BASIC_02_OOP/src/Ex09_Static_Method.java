
public class Ex09_Static_Method {

	public void method() {
		System.out.println("나는 일반함수임^^");
	}
	
	static void smethod() {
		System.out.println("나는 static함수임^^;;;;;");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex09_Static_Method.smethod();
		smethod();
		
		Ex09_Static_Method test = new Ex09_Static_Method();
		test.method();
		
	
	}

}
