import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
Disk (File 처리 대상) >> Disk >> 입출력의 단위가 한 byte씩 하는게 효율적일까?

여러명 학생을 한명씩 목적지에 보내는 것이 아니고
여러명이 탈 수 있는 버스를 대여해서 한번에 보내고 처리....

버스 : Buffer
1. I/O 성능 개선 (접근 횟수)
2. Line 단위 (엔터)

BufferedOutputStream은 보조 스트림이므로
독자적인 작업이 불가능하다
따라서 File(Input||Output)Stream
 */

public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt"); //파일이 없으면 파일을 create
			bos = new BufferedOutputStream(fos); // 버퍼 생성
			
			for (int i = 0 ; i < 10 ; i++) {
				bos.write('A'); //data.txt에...
			}
			bos.flush();
			
			/*
			 JAVA Buffer 사이즈 8KB(8192byte)
			 1.Buffer 안에 내용이 채워지면(8KB 도달) 스스로 출발~ (버퍼를 비우는 작업)
			 2.강제로 출발 (buffer) 강제 비우고 : flush() or close()하면 자동 flush()
			 3.실제로 개발할 때는 close()만 쓴다..어차피 close()하면 flush() 된닌깐~
			 
			 */
			
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
