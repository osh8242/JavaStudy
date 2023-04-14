/*
String 클래스 (문자를 여러개 담을 수 있는 클래스)
String은 수 많은 함수를 가지고 있다...! 대부분의 데이타는 문자열입니다...
우리가 이 문자열을 가공할 일이 넘넘 많아용..(ex 자르고 나누고 합치고 바꾸고 등등..)
String >> 가지고 있는 일반함수 + static 함수 활용 (15~20개) 함수 공부...


 */
public class Ex05_String {

	public static void main(String[] args) {
		String str = "";
		String[] strarr = {"abc", "bbb", "ccc"};
		
		for (String s : strarr) {
			System.out.println(s);
		}
		//사용방법 : int, double처럼 부담없이 기본타입처럼 사용해왔다
		
		String st = "홍길동";
		System.out.println(st.length()); // 왜 length가 존재할까요? >> 배열이므로
		//[홍][길][동] >> char[]로 관리
		System.out.println(st); // 주소가 나와야하지않나? 왜 문자열 값이 나오지? toString()이 생략되어있음
		
		//String 클래스는 Object라는 부모 클래스를 가지고 있고
		// 이 부모 클래스는 toString()을 가지고 있다
		//String extends Object로 나왔음 >> 재정의 (override) >> 주소에 가서 값을 read해서 그 값을 리턴
		
		//결론 요약 : String은 특수해서 출력시 toString()이 생략되어있고
		//부모클래스인 Object에서 가지고 있는 toString()을 재정의하면서 값을 리턴하도록 바꾸었기 때문이다 
		
		//정식 표기
		String sdata = new String("김유신");
		System.out.println(sdata);
		
		String name="가나다라마";
		//내부적으로 char[] member field >>배열[가][나][다][라][마]
		//class String extends Object {private car[] str .......... setter ........ @override toString()}
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		//문자열의 비교
		System.out.println(str1); //toString() 생략되어있음
		System.out.println(str2.toString()); //toString() 재정의했었음. 주소값이 아니고 값이 나오도록.
		
		System.out.println(str1 == str2);
		//연산자==는 값을 비교 str1 주소값과 str2 주소값
		//같은 주소로 판정
		//**메모리에 실제로 같은 문자열이 있으면 재사용한다...
		//str1과 str2 같은 메모리를 참조한다
		
		//Point
		//문자열의 비교는 무조건 ... equals()
		System.out.println(str1.equals(str2)); //equals는 주소를 찾아가서 그 안에 값을 비교
		
		//why : equals를 씁니까
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3==str4); // false
		System.out.println(str3.equals(str4)); // true
		
		String s = "A";
		s += "B";
		s += "C";
		s = "A";
		//String 은 누적해서 쓰면 메모리 낭비가 심해서 아래 기능들을 주로 쓴다
		//Stringbuilder, Stringbuffer
		
	}

}
