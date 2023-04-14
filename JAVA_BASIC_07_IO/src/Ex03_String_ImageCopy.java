import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_String_ImageCopy {

	public static void main(String[] args) {
		String originFile = "D:\\temp\\p.jpg";
		String targetFile = "copy.jpg";
		//default 경로 : 현재 프로젝트 폴더
		//D:\thezone\java\labs\JAVA_BASIC_07_IO
		
		FileInputStream fs = null;
		FileOutputStream fos = null;
		 try {
			fs = new FileInputStream(originFile);
			fos = new FileOutputStream(targetFile);
			
			int data = 0;
			while ((data = fs.read()) != -1 ){
				fos.write(data); //byte 값				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fs.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
