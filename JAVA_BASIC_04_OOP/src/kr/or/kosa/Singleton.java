package kr.or.kosa;
/*
디자인 패턴(생성에 관련된 이야기) >> new 에 대한 이야기

싱글톤 : 객체 하나를 만들어서 공유하겠다
의도 : 하나의 객체를 공유하는 보장성 코드를 만들어라

공유프린터
공유 IP

Singleton s1 = new Singleton();
Singleton s2 = new Singleton();
Singleton s3 = new Singleton();
싱글톤 객체를 하나만 만들고 싶다
>> 생성자를 private
 */
public class Singleton {
	
	private static Singleton p;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if( p == null ) {
			p = new Singleton(); // Point 같은 클래스 내부에서는 public, private, protected의 구분이 의미없음 >> 다 접근가능
		}
		return p; // p의 주소가 null일 때만 생성해서 리턴하므로 하나만 생성됨을 보장함
	}

}
