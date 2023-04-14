import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Today Point

Byte 데이터를 read / write 대상이 >> File (a.txt)

FileInputStream
FileOutputStream

이미지, 엑셀 등을 read, write

File >> a.txt, b.data (write, read)

I/O 자원은 개발자 직접적으로 자원에 대한 해제작업을 해야함
(ex. 파일 작업중에 같은 파일을 또 열려면, 기존에 열었던 파일을 닫아야한다)
>> close()를 써서 자원을 닫아주어야함
>> 예외처리 (강제된) 사용하는 I/O 클래스는 강제로 예외처리를 요구하는 코드가 많다


 */


public class Ex02_FileStream {

	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		String path = "D:\\temp\\a.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("D:\\temp\\new.txt",true);
			// 현재 temp 폴더 안에 new.txt 파일이 없어요
			/*
			 FileOutputStream
			 1. write 파일이 존재하지 않으면 >> 자동 파일 생성 (create 기능)
			 2. fos = new FileOutputStream("D:\\temp\\new.txt",false);
			 	false 옵션을 넣어주면 덮어쓰기한다
			 	true 옵션이면 기존 파일 내용에 추가하여 작성한다(default)
			 
			 */
			
			int data = 0 ;
			while ((data = fs.read()) != -1) { //D:\\temp\\a.txt 파일 읽어들이기
//				System.out.println("정수 : " + data + " : " + (char)data);
				fos.write(data);
				fos.write('\n');
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//try 문에서 오류가 발생했던 안했던간에
			//함수가 강제로 return을 하더라도 finally 블럭은 반드시 실행된다**************
			//보통 자원해제 close()를 많이 쓴다
			//because I/O 자원들은 가비지 컬렉터가 관리하지 않기 때문이다
			//close() 명시적으로 소멸자 호출
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
