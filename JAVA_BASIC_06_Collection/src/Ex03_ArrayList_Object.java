import java.util.ArrayList;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		// 1. 사원 1명을 만듯요
		Emp emp = new Emp(1000, "김유신", "장군");
		System.out.println(emp.toString());
		
		//2. 사원 2명을 마늗세요
		Emp[] emplist = {new Emp(100, "김씨", "영업"),new Emp(200, "김씨", "IT")};
		for(Emp e : emplist) {
			System.out.println(e.toString());
		}
		
		//3. ArrayList 사용해서	
		ArrayList elist = new ArrayList();
		elist.add(new Emp(100, "김씨", "영업"));
		elist.add(new Emp(200, "박씨", "IT"));
		//추가 입사!
		elist.add(new Emp(300, "이씨", "IT"));
		for (int i = 0 ; i<elist.size() ;i++) {
			//System.out.println(elist.get(i).toString());
			//toString을 오버라이드 했기 때문에 toString을 안써도 된다
			System.out.println(elist.get(i));
		}
		
		
		for(Object obj : elist) {
			Emp e = (Emp) obj;
			System.out.println(e.getEmpno() +"/" +e.getEname() +"/"+ e.getJob());
		}
		
		//현업개발자 (Object >> 필요 >> Downcasting >> 자식객체 접근
		//Object 쓰지말자 ... 대신에
		//타입을 강제하는 방법을 만들자 >> 데이터의 관리는 하나의 타입으로 >> 타입은 필요시에 사용
		//Generic (제너릭) 사용
		ArrayList<Emp> list2 = new ArrayList<>();
		list2.add(new Emp(1,"A","IT"));
		for (Emp e : list2) {
			System.out.println(e.getEmpno());
		}
	}

}
