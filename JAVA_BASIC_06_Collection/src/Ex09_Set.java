import java.util.HashSet;

/*
Set 인터페이스
(원안에 들어가세요) : 순서를 보장하지 않음, 중복을 허용하지 않음
순서가 없고 중복을 허락하지 않는 데이터 집합
구현하는 클래스
HashSet, TreeSet (자료구조)


 */
public class Ex09_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(100);
		boolean bo = hs.add(55);
		System.out.println("정상 : " + bo);
		
		bo=hs.add(1);
		System.out.println("결과 : " + bo); //false가 나오면 같은 데이터가 Set에 있다는 의미!!
		
		//ex) 로또, 차량번호, 회원id..
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("C");
		hs2.add("Z");
		hs2.add("A");
		hs2.add("H");
		hs2.add("b");
		hs2.add("b");
		System.out.println(hs2.toString()); //[A, b, C, F, H, Z] 순서가 없이 출력된다
		
		String[] strobj = {"A", "B", "C", "D", "B", "A"}; //10000건의 데이터라고 가정
		HashSet<String> hs3 = new HashSet<>();
		for(int i = 0 ; i < strobj.length ; i++) {
			hs3.add(strobj[i]);
		}
		System.out.println(hs3.toString());
		
		//Quiz

	}

}
