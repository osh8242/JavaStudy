import kr.or.kosa.Car;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		
		//자동차 생산하기
		Car mycar; //stack에 mycar가 로컬 변수로 할당됨
		mycar = new Car(); //비로소 heap에 공간 할당됨
		mycar.setDoor(2);
		mycar.setCarColor("Red");
		mycar.run();

	}

}
