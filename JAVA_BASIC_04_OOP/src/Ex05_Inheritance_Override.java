import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}

class Test3 extends Test2 {
	int x = 300; // C# 부모 무시하기 (부모자식 같은 변수 쓰지마세요...)
	//만약 쓰면 부모는 무시하게댑니다
	
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("자식이 부모의 함수를 재정의했다");
	}
	
	void print(String str) {
		System.out.println("나는 오버로딩 함수라고해. 호출해줘서 고마워.");
	}
}

public class Ex05_Inheritance_Override {

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		System.out.println(test3.x);
		test3.print();
		test3.print("overloading");
				
		Emp emp = new Emp(1000, "홍길동");
		System.out.println(emp);
		//kr.or.kosa.Emp@1c4af82c
		//kr.or.kosa.Emp + "@" + 1c4af82c 조합된 값
		System.out.println(emp.toString());
		//kr.or.kosa.Emp@1c4af82c
		// 왜 두개가 같은 출력일까...?
		//.toString()이 생략되어있었으므로 그렇다
		
		/*
		clasee Object {
			public String toString(){ 
				return 패키지명 + "@" + 주소값;
			}
		}
		
		class Emp extends Object{
			
		}
		 */
		
		
	}

}
