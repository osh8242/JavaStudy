class Human{
	String name;
		
}

class OverClass{
	int add(int i, int j) {
		return i+j;
	}
	
	void add(Human human) { // Human타입 객체의 주소값을 입력받는 함수
		System.out.println(human.name);
	}
	//1. add(new Human());
	//2. Human h = new Human(); add(h);

	//배열은 객체다 == 배열도 타입이다
	int add(int param) {
		return param + 100;
	}
	
	int[] add(int[] params) { // 가변길이의 변수를 입력받는 것과 같음 add(String ... values) >> add(1,2,3) , add(1,2)
		// int[] arr = {1,2}일 때, add(arr) 가능? 어.가능.
		//add(new int[] {1,2,3});
		int[] target = new int[params.length];
		for(int i = 0 ; i < target.length ; i++) {
			target[i] = params[i]+1;
		}
		return target; //int[] target의 주소값(heap에 있는 int[] target 배열 주소)
		
		//return null; // 리턴값이 있는 함수면 리턴부터 설정하고 코딩해라~~!!!!
	}
	
}

public class Ex06_Array_Method {

	public static void main(String[] args) {
		
		OverClass overt = new OverClass();
		int[] source = {10,20,30,40,50};
		int[] ta = overt.add(source);
		for (int value : ta) {
			System.out.println(value);
		}
	}

}
