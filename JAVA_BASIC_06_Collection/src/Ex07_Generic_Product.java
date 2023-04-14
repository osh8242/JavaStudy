import java.util.ArrayList;
import java.util.List;

import kr.or.kosa.CopyEmp;
import kr.or.kosa.Emp;

class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(this.price/10.0);
	}
}

class KtTv extends Product{
	KtTv() {
		super(500);
	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	Audio() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook( ) {
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook";
	}
}


public class Ex07_Generic_Product {

	public static void main(String[] args) {
		//1. Array 사용해서 객체 만들기
		// 상품들을 담을 수 있는 Cart를 만드세요
		Product[] cart = new Product[3];
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		//단점 : 배열의 크기가 고정적이라 물건을 새로 맨글어야함
		
		//2. ArrayList를 사용해서 Cart를 만드세요
		List<Product> pcart = new ArrayList<>();
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new NoteBook());
		//동적으로 추가 삭제가 가능해진다
		for(Product product : pcart) {
			System.out.println(product);
		}
		
		//Emp
		//3. ArrayList를 사용해서 사원 3명을 만드세요~
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(1, "오승환", "조장"));
		list.add(new Emp(2, "우나은", "조원"));
		list.add(new Emp(3, "장석진", "조원"));
		
		//3.1 사원의 정보를 toString() 사용하지 말고 사번, 이름, 직종을 출력해보세요~
		//개선된 for 문 사용
		for (Emp e : list) {
			System.out.printf("%d, %s, %s\n",e.getEmpno(),e.getEname(), e.getJob());
		}
		
		
		//3.2 위와 동일하게 출력하되 일반 for문 사용
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.printf("%d, %s, %s\n", list.get(i).getEmpno(),list.get(i).getEname() , list.get(i).getJob());
		}
		
		//ArrayList 사용해서 사원 3명을 만드세요 (CopyEmp)
		//CopyEmp(100, "김씨", 1000)
		//CopyEmp(200, "이씨", 2000)
		//CopyEmp(300, "박씨", 3000)
		
		List<CopyEmp> clist = new ArrayList<>();
		clist.add(new CopyEmp(100, "김씨", 1000));
		clist.add(new CopyEmp(200, "이씨", 2000));
		clist.add(new CopyEmp(300, "박씨", 3000));
		
		//4.1 200번 사원의 급여를 6000으로 수정하세요 (일반 for문 사용) getter, setter
		for(int i = 0 ; i < clist.size() ; i++) {
			if(clist.get(i).getEmpno() == 200) {
				clist.get(i).setSal(6000);
				System.out.println(clist.get(i).getSal());
			}
		}
		
		//4.2 300번 사원의 이름을 박씨에서 "궁금해씨"로 수정하고 결과를 출력하세요(개선되 for문 사용) 
		for(CopyEmp ce : clist) {
			if(ce.getEname().equals("박씨")) {
				ce.setEname("궁금해씨");
				System.out.println(ce.getEname());
			}
		}
		
	}

}
