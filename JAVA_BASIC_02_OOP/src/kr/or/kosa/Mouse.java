package kr.or.kosa;

public class Mouse {
	//마우스는 한 점을 가지고 있다
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void getPosition() {
		System.out.printf("x : %d , y : %d\n",x,y);
	}
	
	
}
