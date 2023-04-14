import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex10_Set_TreeSet {

	public static void main(String[] args) {
		// set : 순서(x), 중복(x)
		
		/*
		 TreeSet은 순서를 보장하지 않아요. 중복 데이터를 허락하지 않아요.
		 그러나 정렬기능이 있어요.
		 >> 검색하거나 정렬이 필요할 경우 사용하는 자료구조
		 like 로또번호(중복없어야하고 정렬도 필요함)
		 
		 이진트리 : root > leaf
		 데이터 저장시 정렬기능을 제공한다
		 */
		
		HashSet<String> hs = new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		System.out.println(hs.toString()); 
		// [P, A, B, D, F, G, K] ; 순서가 없어요
		
		Set<Integer> lotto = new TreeSet<>();
		for ( ; lotto.size() < 6  ; ) {
			int num = (int)(Math.random()*45 + 1);
			lotto.add(num);			
			System.out.println("num : "+ num);
		}
		System.out.println(lotto.toString());
		
		

	}

}
