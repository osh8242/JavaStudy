import kr.or.kosa.Person;


// 연습용 test class
class Test{ // default class Test
	int i; // default int i
	int j; 
	void print() { // default void print()
		System.out.println(i);
	}
}

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.personPrint();
		
		
		Person person1 = new Person();
			
		person1.name = "김유신";
		person1.age = 100;
		person1.power = true;
		person1.personPrint();
		
		// 결과
		System.out.println(person); // 주소값 kr.or.kosa.Person@6e8dacdf

		System.out.println(person1);// 주소값 kr.or.kosa.Person@7a79be86
		
		//참조타입의 할당은 주소값 할당
		Person person2 = person1;
		if(person2 == person1) {
			
		}
	}

}
