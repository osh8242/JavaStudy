import kr.or.kosa.Bird;

class Bi extends Bird{
	@Override
	protected void moveFast() {
		// TODO Auto-generated method stub
		super.moveFast();
	}
}

class Ostrich extends Bird{
	//타조는 날지 못하므로
	void run() {
		System.out.println("run .....");
	}
	@Override
	protected void moveFast() {
		run();
	}
}

public class Ex09_Inhertance_Protected {

	public static void main(String[] args) {
		Bi bi = new Bi();
		bi.fly();
		bi.moveFast();
		
		Ostrich o = new Ostrich();
		o.fly();
		o.moveFast();

	}

}
