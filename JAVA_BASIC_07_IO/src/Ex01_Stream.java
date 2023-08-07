import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
IO(input / output)

Stream(통로)
통로가 쓰는 데이터의 종류는 : 이미지, 파일, 문자..

JAVA API >> 이미 입출력 클래스가 있음
I/O의 기본 단위는 byte

Abstract Class
InputStream, OutputStream (추상함수 .... 재정의)

당신이 Byte 데이터 작업을 하고 싶다면?
InputStream 상속 구현하는 클래스를 사용하시오~

Byte 타입을 입력하려면 대상에 따라서
1. Memory라면, ByteArrayInputStream
2. File이라면, FileInputStream(***)

Byte 타입을 출력하려면 대상에 따라서
1. Memory라면, ByteArrayOutputStream
2. File이라면, FileOutputStream(***)

사실 지금까지 memory -> Array, Collection을 통해서 메모리기반 작업을 해왔다.
이미 배열과 컬렉션에서 메모리 작업을 하기 때문에 메모리 입출력은 잘 사용하지않는다.


 */
public class Ex01_Stream {

	public static void main(String[] args) {
		//byte (-128~127) 정수를 저장하는 타입
		byte[] inSrc = {-1,0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; // 현재 메모리를 갖고 있지않아요..
		
		//입출력 스트림을 통해 memory에 접근하여 read, write를 해보자
		ByteArrayInputStream input = null; // 입력 스트림 생성
		ByteArrayOutputStream output = null; // 출력 스트림 생성
		
		input = new ByteArrayInputStream(inSrc); // 입력 스트림이 inSrc 데이터를 읽어들임
		output = new ByteArrayOutputStream();
		
		System.out.println("outSrc before : " + Arrays.toString(outSrc));
		
		//공식 같은 출력 로직 구현(암기하시오)
		int data = 0;
		while((data = input.read()) != -1) {
			//System.out.println("data : "+ data);
			
			//read한 데이터를 다른 Stream을 통해서 출력
			output.write(data); //출력스트림 안에 데이터를 (write)담아라~
			//write 대상이 data가 아니고 BeteArrayOutputStream 자신의 통로에...
		}
		
		/*
		while(input.read() != -1) {
			//read() 함수는 내부적으로 next()이므로
			System.out.println(input.read()); // 1,3,5,7,9
		}
		 */
		
		
		//byte[] outSrc = null;
		outSrc = output.toByteArray();
		System.out.println("outSrc after : " + Arrays.toString(outSrc));

	}

}
