import java.io.FileReader;
import java.io.FileWriter;

/*
문자기반의 데이터 다루기 (char[])
String 클래스 >> 내부적으로 char[] 관리

Reader, Writer class <<abstract>>

대상이 파일이면
FileReader, FileWriter


 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java"); //read
			fw = new FileWriter("copy_Ex01.txt"); //경로에 파일이 없으면 create 해준다
			
			int data = 0 ;
			while ((data = fr.read()) != -1) {
				//System.out.println(data);
				//fw.write(data);
				if(data != '\n' && data != '\r' && data != '\t' && data != ' ') {
					fw.write(data);
				} //압축버전 (엔터, 탭, 빈문자는 파일에 쓰지않겠다
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
