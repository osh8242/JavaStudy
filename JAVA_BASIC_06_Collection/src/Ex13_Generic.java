import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 HashMap<K,V>
 
 HashMap<String, String>
 HashMap<Integer, String>
 HashMap<String, Student>	*POINT*
 
 put("kglim", new Student())
 
 */

class ArrayTest{
	ArrayList<String[]> al = new ArrayList<>();
}

class Student{
	int kor;
	int math;
	int eng;
	String name;
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
	
}
public class Ex13_Generic {

	public static void main(String[] args) {
		HashMap<String, String> sts = new HashMap<>();
		sts.put("A", "AAA");
		System.out.println(sts.get("A"));
		
		//실무에서 Map
		//학생의 성적 데이터를 담아라~~
		//Key(학번), value[국어, 영어, 수학] >> value에 ArrayList 또는 Collection을 ㅆ써야함
		
		HashMap<String, Student> smap = new HashMap<>();
		smap.put("hong", new Student(100, 90, 50, "홍길동"));
		smap.put("kim", new Student(50, 30, 50, "김유신"));
		
		Student sd = smap.get("kim");
		System.out.println(sd.kor + " / " + sd.eng + " / " + sd.math + " / " + sd.name);
		
		ArrayTest at = new ArrayTest();
		String[] strarr = {"A", "B", "C"};
		at.al.add(strarr);
		
		//Tip
		Set set = smap.entrySet(); // Map(key,value) 가공 >> key+"="+value 형태의 String으로 만들어줌
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		 hong=Student@626b2d4a
		 kim=Student@5e91993f
		 */
		
		
		//Tip
		//Key와 Value를 분리해서 보고싶다?!
		// class Entry { Object key, Object value }
		// Map {Entry[] elements} >> Map.Entry
		// 맵이라는 인터페이스는 Entry의 배열로 구성되어있따!!!!!!!!
		for (Map.Entry<String, Student> m : smap.entrySet()) {
			System.out.println(m.getKey() + " / " + m.getValue().name);
		}
		//key, value를 함꼐 받고 싶으면 Map.Entry를 이용하자
		//여기서 value는 Student를 상위 인터페이스로 구현해서 리턴하였으므로
		//인터페이스로 받은 value 객체를 Student로 다운캐스팅하면 Student의 속성값도 얻을 수 있따!!!
		
		
	}

}
