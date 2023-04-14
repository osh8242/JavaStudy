import kr.or.kosa.Pclass;

/*
private
default
public
상속관계에서 protected

protected 양면성 >> default, public
>>상속이 없는 클래스 안에서 protected >> default 동일
>>결국 상속 관계에서만 의미 >> public

 */

class Dclass {
	public int i;
	private int p;
	int s; //default : 같은 폴더(패키지)내에서
	protected int k; // default 동일 (상속이 아니면 디폴트랑 같기 때문에 사용하지 않아요..)
}

class Child2 extends Pclass{ //protected 변수를 가지고 있는 Pclass 상속
	void method() {
		this.k = 100; // 상속관계에서 >> 자식은 부모의 protected 자원을 사용가능하다 (public처럼)
		System.out.println(this.k);
		// m(); 자식이 자식 본인 클래스 내부에서는 접근이 가능하지만
	}
	//protected의 진정한 의미는 재정의를 재정의를 했으면 좋겠는데.. >> 재정의해. 그래야 니가 외부에서도 쓸 수 있음ㅇㅇ
	//즉. 미완성 Method의 경우에 protected를 써서 상속받는 자식 클래스가 본인 클래스에 맞게 재정의해서 쓰라는 의미이다.
	//(구체화가 충분히 되지않은 Method의 경우에 protected)

	@Override
	protected void m() {
		// TODO Auto-generated method stub
		super.m();
	}
}

public class Ex08_Inheritance_Protected {

	public static void main(String[] args) {
		Pclass pclass = new Pclass();
		//pclass.i =1; //public 접근가능
		Child2 child = new Child2();
		
		

	}

}
