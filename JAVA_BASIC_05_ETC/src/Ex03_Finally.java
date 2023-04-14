import java.io.IOException;

/*
try ({

} catch (Exception e){

} finally {
	강제적으로 실행되는 블럭
}

finally를 구현했다면
예외발생여부에 상관업시 '강제적으로' 실행되어야하는 구문
심지어 return조차도 무시하고 실행된다

게임 CD 설치 과정
1. 설치파일 >> c:\Temp 폴더에 복사
2. 복사한 파일 >> 프로그램 설치
3. 정상 설치 >> C:\Temp 복사한 파일 내용 삭제
4. 비정상 설치 >> 설치 중 PC가 비정상 종료 >> c:\Temp 내용 삭제 

 */
public class Ex03_Finally {
	
	static void copyFiles() {
		System.out.println("copy Files");
	}
	
	static void startInstall() {
		System.out.println("Installing ....");
	}
	
	static void fileDelete() {
		System.out.println("FileDelete");
	}
	
	/*
	예외가 발생 ... 정말 0/0이거나 index 범위 밖이거나 등등..
	"홍길동"이 입력되는 예외.. 개밪ㄹ자가 필요에 의해서 어떤 상황을 예외적인 상황이라고 정의할 수 있다.
	
	>>사용자 정의 예외 처리
	throw new IOException
	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyFiles();
		startInstall();
		fileDelete();
		
		try {
			copyFiles();
			startInstall();
			//throw new IOException("install 도중에 문제 발생!_!_!_!_!_!");
		} catch (Exception e) {
			System.out.println("예외가 발생했구요.. : "+e.getMessage());
		}finally {
			//강제 실행 블럭
			//정상, 비정상이어도 무조건 실행
			//** 함수가 가지는 return 을 finally 먼저 실행****
			fileDelete();
		}
			
	}

}
