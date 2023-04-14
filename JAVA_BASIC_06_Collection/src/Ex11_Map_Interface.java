import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 Map 인터페이스
 (Key, value) 쌍의 구조를 갖는 배열
 ex) 지역번호 (02,서울), (031,경기도), ...
 
 key는 중복되면 안됨니다~ >> Set과 유사 
 value는 중복되도 됨니다~ >> List ...
  
 Generic 지원
 Map 인터페이스 구현하는 클래스
 구버전 : HashTable (동기화o) : 스레드 하나가 사용하게되면 사용을 마칠 때까지 다른 스레드를 대기상태로 만든다
 신버전 : HashMap ** (동기화x) : 동기화를 기본적으로는 보장하지 않으므로 성능은 좋다~~!
 
 최소한 ArrayList, HashMap, Generic까지는 마스터해야합니다.
 
 */
public class Ex11_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004"); // id, pwd라고 봅시다
		map.put("scott", "1004");
		map.put("Superman", "1007");
		System.out.println(map.containsKey("tiger")); // 대소문자를 구분하므로 false
		System.out.println(map.containsKey("scott")); // true
		System.out.println(map.containsValue("1004")); // true
		
		// key를 제공하면 value 값을 뱉어낸다
		System.out.println(map.get("Tiger")); // 1004
		System.out.println(map.get("hong"));
		
		//만약에
		System.out.println(map.size());
		System.out.println(map.put("Tiger", "1008")); // 같은 키가 있으면 value 값을 덮어써버림
		System.out.println(map.size());
		System.out.println(map.get("Tiger")); // 1008
		System.out.println(map.toString());
		
		Object value = map.remove("Superman");
		System.out.println("삭제된 value : "+value);
		System.out.println(map.toString());
		
		//응용(이해)
		Set set = map.keySet();
		//KeySet() 함수는 Set 인터페이스를 구현하는 객체를 생성하고, 
		//데이터를 담아서 그 주소를 리턴
		//부모타입인 Set 인터페이스를 통해서 자식객체의 주소를 받을 수 있다
		//표준화된 출력을 해볼까요?
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collection clist = map.values();
		System.out.println(clist.toString());

	}

}
