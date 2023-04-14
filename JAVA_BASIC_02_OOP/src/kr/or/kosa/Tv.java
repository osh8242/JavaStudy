package kr.or.kosa;
/*
Tv 설계도 요구사항정의
티비는 채널 정보를 가지고 있다. (예를 들면 1~200 값을 가질 수 있다) public
티비는 브랜드 이름을 가지고 있다. (예를 들면 엘지, 삼성) public
티비는 채널 전환 기능을 가지고 있다. (채널은 한 채널씩 이동이 가능하다)
	채널 증가기능
	채널 감소기능
티비의 채널정보와 브랜드 이름을 볼 수 있는 기능을 가지고 있다. 

 */


public class Tv {
	public int ch;
	public String brand;
	
	public void chUpper() {
		ch++;
	}
	public void chLower() {
		ch--;
	}
	
	public void tvinfo () {
		System.out.printf("제품 브랜드명 : [%s], 현재 채널 : [%d]\n", brand , ch);
	}
}
