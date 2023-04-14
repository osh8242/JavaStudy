import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Today Point (매우매우 매우매우 중요함********************)


 */
public class Ex02_ArrayList {

	public static void main(String[] args) {
		// List 인터페이스를 구현하고있는 클래스 >> ArrayList >> 순서를 보장한당~(index로)
		// 식당의 번호표, 은행 번호표(동명이인)
		ArrayList arraylist = new ArrayList(); //컨트롤+쉬프트+o (자동임포트)
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		for(int i = 0 ; i < arraylist.size() ; i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.toString());
		
		// add 함수는 데이터를 순차적으로 넣기작업을 합니다.
		arraylist.add(400); // index == 3인 방에 들어감니다
		arraylist.add(0, 1111);
		System.out.println("0번째 방에 1111 추가 : " + arraylist.toString());
		// 추가, 삭제시 해당 인덱스 뒤의 모든 요소가 이동해야하므로
		// 추가, 삭제에 성능이 좋지 않아요.....
		// 순차적인 데이터의 추가, 삭제에 강점이 있다..
		
		// [1111, 100, 200, 300, 400]
		
		System.out.println(arraylist.contains(200));
		System.out.println(arraylist.size());
		arraylist.clear();//데이터 삭제! (but 용량은 남아있다)
		System.out.println(arraylist.size());
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.isEmpty());
		
		Object value = arraylist.remove(0);
		System.out.println(value);
		System.out.println(arraylist.toString());
		
		//Point 다형성
		//인터페이스 부모타입
		//다형성(확장성, 유연성)
		
		//ArrayList arraylist = new ArrayList();
		//습관적으로 다형성코드를 쓰려고 노력해야함
		List li = new ArrayList<>();
		//부모타입의 참조변수 li는 자식객체의 주소값을 가질 수 있다
		//인터페이스인 List는 구현코드가 없으므로 재정의된 자식함수의 실행이 가능^^*
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		System.out.println(li.toString());
		
		List li2 = li.subList(0, 2);
		System.out.println(li2.toString());
		
		
		//ArrayList >> 사실 본질은 Array임. 단지 컴파일러가 자동으로 새로운 배열로 이동시켜줄뿐
		//정렬
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		System.out.println(alist.toString());
		Collections.sort(alist); //오름차순 정렬!!!!
		// 하지만 초급개발자는 직접 해봐야죠!!!!!
		System.out.println(alist.toString());
		Collections.reverse(alist);
		System.out.println(alist.toString());
		
		
		
		
		
		
		
		
	}

}
