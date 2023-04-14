import kr.or.kosa.MyStack;

public class Ex06_MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms = new MyStack(5);
		ms.push("1");
		ms.push("2");
		ms.push("3");
		System.out.println(ms.pop());
		ms.push("4");
		ms.push("5");
		ms.push("6");
		ms.push("7");

		System.out.println(ms.isEmpty());
		System.out.println(ms.isfull());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());

	}

}
