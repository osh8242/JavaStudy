import kr.or.kosa.Singleton;

public class Ex15_Singleton_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}

}
