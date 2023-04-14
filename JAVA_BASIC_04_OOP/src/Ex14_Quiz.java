class Ssystem {
	//System이라는 클래스를 만든다
	public static PPrint out = new PPrint();
}

class PPrint {
	
	public void pprintln() {
		System.out.println("와우");
	};
}

public class Ex14_Quiz {

	public static void main(String[] args) {
		Ssystem.out.pprintln();

	}

}
