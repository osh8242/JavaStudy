/*
함수 사용시 parameter 값을 전달 or 주소(참조값) referrence를 전달할 수도 있음
void m(int x){	 >> 	x라는 변수는 값을 받는당~
	x=1000000;
}	

int y = 100;
m함수 호출 >> m(y) >> call by value

-----------------------------------------------

void m2(Car c) { } // m2라는 하므수는 parameter는 Car 타입을 가지는 객체 c의 주소값을 받겠다~~~
Car c2 = new Car(); // ex) c2의 주소 : 0x0b....
m2(c2) >> m2(0x0b....) >> call by referrence
 
 */

class Data {
	int i;
}


public class Ex10_Method_Call {
	
	static void scall(Data sdata) { //Data 타입을 갖는 주소값을 받겠다... (ref)
		System.out.println("함수 : " + sdata.i);
		sdata.i = 1111; // sdata의 주소로 찾아가서 i변수값을 1111로 변경하시오!
	}
	
	static void vcall(int x) {//정수 int 값을 받겠다 (value) 
		System.out.println("before x : " + x);
		x = 8888;
		System.out.println("after x : "+ x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data(); // d라는 변수는 주소값을 가지고 있슴. ex)0xab..
		d.i = 100;
		System.out.println("d.i : "+d.i);
		
		scall(d); //d의 주소값 0xab.. 전달
		System.out.println("after d.i : "+d.i);
		
		vcall(d.i);
		System.out.println("d.i : "+d.i);
		
	}

}
