package kr.or.kosa;

import java.util.HashSet;

/*
Set 인터페이스
(원안에 들어가세요) : 순서를 보장(x) , 중복을 허락하지 않아요
순서가 없고 중복을 허락하지 않는 데이터 집합
구현하는 클래스
HashSet , TreeSet (자료구조)

*/
public class Ex09_Set_Quiz {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		while(hs.size()<6) {
			hs.add((int)(Math.random()*45 + 1));
		}
		System.out.println(hs.toString());
		
		//Quiz
		//아래 코드를 HashSet 으로 만들고 식사하세요
		/*
		 for(int i = 0 ; i < 6 ; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			for(int j = 0 ; j < i ; j++) { //j < i (채워진 개수 만큼 비교)
				if(lotto[i] == lotto[j]) {
					i--;
					break;
					
				}
			}
		} 
	   */
		
	}

}
