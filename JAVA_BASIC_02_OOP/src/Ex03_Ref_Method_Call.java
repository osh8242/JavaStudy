import kr.or.kosa.Tv;

public class Ex03_Ref_Method_Call {

	public static void main(String[] args) {
		// Tv를 만드세요 (메모리에 올리세요) >> heap
		Tv lgtv = new Tv();
		lgtv.brand = "LG";
		lgtv.tvinfo();
		
		lgtv.chUpper();
		lgtv.chUpper();
		lgtv.chUpper();
		lgtv.chUpper();
		lgtv.tvinfo();
		
		Tv sstv = new Tv();
		sstv.brand = "Samsung";
		
		Tv ktv = sstv; // ktv는 sstv와 같은 주소를 같고 있어서 부르는 이름이 2개가 된 것일뿐 사실상 같은 객체임를 다룸
		
	}

}
