import java.util.Arrays;

/*
배열은 객체다 (Array)
1. new를 통해서 생성한다. (주소값을 갖는다)
2. heap 메모리에 객체가 생성된다. (관리 자원이다)
3. 정적배열(고정배열) : 배열은 한번 선언하면(크기가 정해지면) 크기변경이 불가하다 < > 동적(Collection : 자바가 제공하는 api 클래스)
4. 자료구조(알고리즘) : 제어문(결합) : 기초적인 자료구조
	>> 자원을 얼마나 효율적으로 사용할 것인가..?!

 */



public class Ex01_Array {

	public static void main(String[] args) {
		int s, s1, s2, s3, s4;
		int s5; int s6; int s7;
		//같은 타입의 변수 여러개를 선언해서 사용할 필요가 있을까?
		
		//배열
		int[] score = new int[5];
		//int 5개짜리 공간 객체(int array)를 heap 공간에 새로 만들어라
		//그리고 배열의 주소를 score라는 변수에 저장해라!!!!!!!!!!
		// 연속된 공간으로 방이름을 index(첨자) >> [0][1][2][3][4] ..
		System.out.println(score[0]);
		score[0]=100;
		score[1]=200;
		score[2]=300;
		score[3]=400;
		score[4]=500;
		
//		score[5]=600;
//		java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		방의 개수는 항상 index 값보다 1이 크다
		System.out.println(score[3]);
		//Array방에 있는 모든 값을 출력해보세요
		System.out.println("-----------------------");
		System.out.println("배열의 모든 요소를 출력합니다");
		for ( int i = 0 ; i < score.length ; i++) { // Array는 배열의 개수를 제공한다 (score.length)
			System.out.printf("score[%d] = %d\n", i, score[i]);
		}
		System.out.println();
		//java.util.Arrays -> 도움을 주는 클래스...!
		//배열을 사용하는데 필요한 다양한 도구를 제공합니당
//		System.out.println(Arrays.toString(score));
		
		//Tip) 당분간 Api기능은 쓰지마세용 ex) toString, sort 등등..
		//Arrays.sort(score);
		//변수 3개 자리이동 순서 바꾸는 ... swap....
		
		//정렬 알고리즘 (신입은 버블, 퀵 정렬 코드는 술술 쓸수 있어야...)
		
		//Today point
		//배열 만드는 3가지
		int[] arr = new int[5]; // 기본
		int[] arr2 = new int[] {10,20,30,40,50}; //초기값을 통해서 배열의 개수를 정의하고 값을 할당
		int[] arr3 = {11,22,33}; // 컴파일러가 알아서 new를 처리합니다
		//배열은 무조건 선언시 크기도 정해주어야함
		//Tip) const arr = [1,2,3,4,5]; let arr = [1,2,3,4,5];
		
		for ( int i = 0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		//배열은 객체다(new를 통해서 생성되고 heap 메모리에 올라간다)
		int[] arr4; // statck arr4 변수 생성 (null) >> 안에 내용물(주소값)이 없어요 >> 심지어 heap 메모리에 올라가있지도 않아요
		arr4 = new int[] {21,22,23,24,25};
		System.out.println(arr4); // arr4는 주소값 [I@6a5fc7f7을 가지고 있다.
		
		int[] arr5 = arr4; // arr4의 주소값을 arr5에 할당했다~
		//같은 메모리를 보고있다
		System.out.println(arr5 == arr4);
		
		//배열의 타입은 몇가지 일까요? 8가지 + String + 클래스 ...
		String[] strArr = new String[] {"가","나","가나다"};
		for (int i = 0 ; i < strArr.length ; i++) {
			System.out.println(strArr[i]);
		}
		
		char[] carr = {'A', 'B'};
		float[] farr = new float[3];
		Car[] carArr = new Car[3]; // 이 배열에는 class Car 타입의 주소들이 담길수 있다. (Car 클래스로 만들어진 객체들의 주소값)
		//Car c = new Car();
		//carArr[0] = c;
	
		

	}

}
class Car{//클래스 == 설계도 == 데이터 타이프
	
	
}

