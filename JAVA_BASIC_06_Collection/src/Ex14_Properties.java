import java.util.Properties;

/*
 Map 인터페이스를 구현한 클래스.
 특수한 목적을 가지고 있음.
 특수한 목적 : <String, String> // key와 value의 타입이 String으로 고정되어있음
 
 사용 목적
 1. App 전체에 사용되는 자원관리
 2. 환경변수 (전역변수 같은 의미)
 3. 프로그램의 버전
 4. 로그인 ID, 비번
 5. 공통변수
 
 표준화(공통)된 키-값 데이터를 담아둘테니 편하게 써라~! 
 
 */
public class Ex14_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin", "kosa@or.kr");
		prop.setProperty("version", "1.x.x.x");
		prop.setProperty("downpath", "C:\\Temp\\images");
		//각각의 개발 페이지에서 본다고 가정
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("downpath"));

	}

}
