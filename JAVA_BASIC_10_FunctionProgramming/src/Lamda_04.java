

@FunctionalInterface
interface MyFun{
	void method(int x);
}

@FunctionalInterface
interface MyFun2{
	int method(int x, int y);
}


public class Lamda_04 {
	public static void main(String[] args) {
		
		MyFun my = new MyFun() {
			@Override
			public void method(int x) {
				System.out.println("param x : " + x);				
			}
		};
		my.method(100);
		///////////////////////////////////////////////////
		MyFun my2 = (x) -> {System.out.println("param -x : " + x);};
		my2.method(200);
		
		MyFun my3 = x -> System.out.println("param -x : " + x);
		my3.method(300);
		
		///////////////////////////////////////////////////

		MyFun2 myfun = new MyFun2() {
			@Override
			public int method(int x, int y) {
				int result = x + y;
				return result;
			}
		};
		
		System.out.println(myfun.method(100, 200));
		
		MyFun2 myfun2 = (x,y) -> {int result = x + y; return result;};
		MyFun2 myfun3 = (x,y) -> x+y;
		
	}

}
