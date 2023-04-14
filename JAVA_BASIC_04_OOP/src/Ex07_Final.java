import java.lang.invoke.VarHandle;

/*
변수 <> 상수
상수 : 한번 값이 [초기화] 되면 변경 불가
상수자원 : 고유값 >> 주민번호, 파이값 PI=3.141591..., 시스템번호 (버전번호 v1.0, v1.1.0 ..)
상수는 변수랑 구분하기 어렵잖아?
그니까 우리 관용적으로 대문자로 쓰자 ex) PI

JAVA : final NUM=10;
C# : const integer NUM=10;

final 키워드
1.final class Car {} >> 최종설계도 == 상속금지
ex) public final class Math extends Object{}

2.public final void print(){} >> 상속 관계에서 재정의 금지

3.member field (상수)***



 */

class Vcard{
	final String KIND="heart";
	final int NUM=10;
	
	void method() {
		//JAVA API
		System.out.println(Math.PI);
	}	

}


//설계자 입장에서
//53장의 카드 생성시 카드마다 다른 상수값을 가지게 하고 싶다

class Vcard2{
	final String KIND;
	final int NUM;
	//초기화를 해줄 것이라는 믿음을 줘야함..프리허그
	//초기화 보장필요
	//member field 초기화 (생성자)
	
	public Vcard2(String kind, int num) {
		this.KIND = kind;
		this.NUM = num;
	}

	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
}

public class Ex07_Final {

	public static void main(String[] args) {
		Vcard vcard = new Vcard();
//		vcard.KIND = "AAA"; 변경불가
//		System.out.println(vcard.KIND);
//		vcard.method();
		
		Vcard2 v1 = new Vcard2("spade", 1);
		System.out.println(v1.toString());
		
		Vcard2 v2 = new Vcard2("spade", 2);
		System.out.println(v2.toString());
		
		Vcard2 v3 = new Vcard2("heart", 1);
		System.out.println(v3.toString());
	}

}
