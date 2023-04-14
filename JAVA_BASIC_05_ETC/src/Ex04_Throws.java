import java.io.IOException;

import kr.or.kosa.ExClass;

public class Ex04_Throws {

	public static void main(String[] args) {
		/*
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException e1) {
			
		} catch (IOException e2) {
			
		}
		finally {
			
		}

	}

}
