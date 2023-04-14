import java.util.ArrayList;
import java.util.List;

//교재 13장
/*
Today Point
jdk 1.5버전

C#, JAVA(필수기능)

1. 타입을 처음부터 강제
2. 타입 안정성 (타입 강제)
3. 강제 형변환 필요없다 (ex. (Car)Object 로 캐스팅할 필요가 없다)

 */

//설계도를 만들 때
class MyGeneric<T>{ //T (Type Parameter)
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Person {
	int age = 100;
}

public class Ex04_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGeneric<String> mygen = new MyGeneric<String>();
		/*
		class MyGeneric<String>{ //T (Type Parameter)
			String obj;
			
			void add(String obj) {
				this.obj = obj;
			}
			
			String get() {
				return this.obj;
			}
		}
		 */
		
		mygen.add("문자열");
		System.out.println(mygen.get());
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("홍길동");
		list.add(new Person());
		
		//개선된 포문을 사용해서 Person 객체는 age값을 출력하시고
		for(Object obj : list) {
			try {
				Person p = (Person) obj;
				System.out.println("펄슨" + p.age);
			} catch (Exception e) {
				System.out.println(obj.toString());
			}
		}
		
		List<Person> plist = new ArrayList<>();
		plist.add(new Person());
		plist.add(new Person());
		plist.add(new Person());
		for(Person p : plist) {
			System.out.println(p.age);
		}
	}

}
