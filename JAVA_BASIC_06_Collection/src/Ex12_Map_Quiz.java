import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ex12_Map_Quiz {

	public static void main(String[] args) throws IOException {
		/*
		 Map을 사용하는 데이터 집합
		 지역번호, 우편번호, 회원(id, pwd) ...
		 */
		HashMap<String, String> loginmap = new HashMap<>(); // 메모리에는 회원의 id, pwd저장
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		/*
		 우리의 시스템은 회원가입한 회원의 id, pwd를 관리하고 있다
		 로그인시 아이디와 비번을 확인해서 회원이라면 사이트 접속 가능
		 id(o), pwd(o) >> 회원님 방가방가 출력 >> while 탈출
		 id(o), pwd(x) >> 비밀번호 확인메시지 출력 >>
		 id(x)		   >> 해당 id 없음을 메시지로 출력
		 
		 사용자로부터 id, pwd 입력 받으세요~
		 1. id는 공백제거하시고
		 2. 영어 소문자로 바꾸시고
		 3. String 변수에 담아서 사용하시고
		 4. pwd는 공백만 제거하세요
		 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.print("아이디 : ");
			String id = br.readLine().replaceAll(" ", "").toLowerCase();
			System.out.print("비밀번호를 입력하세요 : ");
			String pwd = br.readLine().replaceAll(" ", "");;
			if(loginmap.containsKey(id) ) {
				if(loginmap.get(id).equals(pwd)) {
					System.out.println("회원님 방가방가");
					break;
				} else {
					System.out.println("비밀번호가 틀립니다");
					System.out.println();
				}
					
			} else {
				System.out.println("해당 ID 정보가 없습니다");
				System.out.println();
			}
			
			
		}
		
		
		
	}

}
