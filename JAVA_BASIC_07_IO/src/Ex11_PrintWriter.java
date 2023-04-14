import java.io.BufferedReader;
import java.io.FileReader;

/*
출력 형식을 지정 보조 스트림
1. printf
2. String.format
3. I/O PrintWriter (파일에 출력 정의(이쁘게))

현업) 세금계산서, 지출결의서 출력, 휴가서, 품의서 >> 만들어 주는 >> reporting >> 오즈, 크리스탈 레포트


 */
public class Ex11_PrintWriter {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			/*
			PrintWriter pw = new PrintWriter("D:\\temp\\homework.txt");
			pw.println("*********************************************");
			pw.println("*********************************************");
			pw.println("***              HOME WORK                ***");
			pw.printf("%3s : %5d %5d %5d %5.1f","아무개",100,88,90,(float)((100+88+90)/3));
			pw.println();
			pw.close();
			*/
			
			//read (Line단위) 문자
			fr = new FileReader("D:\\temp\\homework.txt");
			br = new BufferedReader(fr);
			String s = "";
			while ((s= br.readLine())!= null) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
