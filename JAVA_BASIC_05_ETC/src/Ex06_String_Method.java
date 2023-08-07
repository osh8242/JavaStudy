import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr);
		
		boolean bo = str.contains("ello");
		System.out.println(bo);
		
		String str2 = "a b c d"; //공백도 문자이므로 7글자이다
		System.out.println(str2.length());
		
		String filename = "hello java world";
		System.out.println(filename.indexOf("e"));
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("헬로우"));
		// 값이 없으면 -1 리턴 .... 배열에 원하는 단어가 있다
		// 신문사설 원하는 검색할 수 있음
		// indexOf 해가지고 -1이 아니면 있다는 의미이다!!!!
		if(filename.indexOf("wo")!=-1) {
			System.out.println("wo 단어가 하나이상 있습니다");
		}
		
		System.out.println(filename.lastIndexOf("a")); // 결과 : 9
		
		// String에서 필수적으로 암기해야하는 함수
		//length(), indexOf(), substring(), replace(), split()
		
		// substring 오버로딩함수
		String result = "superman";
		System.out.println(result.substring(2)); //시작 인덱스 하나만
		System.out.println(result.substring(2,3)); // 시작 인덱스 하나와 종료 인덱스 하나
		//beginIndex the beginning index, inclusive
		//endIndex the ending index, exclusive.
		
		System.out.println(result.substring(0,0)); // 아무것도 안나옴
		
		//Quiz
		String filename2 = "home.jpg";
		//여기서 파일명과 확장자를 분리해서 출력
		int index = filename2.indexOf(".");
		System.out.println("파일명 : "+filename2.substring(0,index));
		System.out.println("확장자 : "+filename2.substring(index+1));
		
		//replace
		String str3 = "ABCDADJHGIUSEHIUY#%IIQFSGDFGIF";
		String result3 = str3.replace("\\D", "");
		System.out.println(result3);
		
		result3 = str3.replaceAll("A", "a");
		System.out.println(result3);
		
		//ETC
		System.out.println(str3.charAt(0)); // 해당인덱스의 문자 반환
		System.out.println(str3.endsWith("GIF")); //문자열 끝이 GIF와 같은지 트루펄스 반환
		System.out.println(result3.equalsIgnoreCase("aBCDaDJHGIUSEHIUY#%IIQFSGDFGIF")); // 대소문자 구분없이 같은지 비교
		
		//Today Point
		String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		String[] nameArray = str4.split(",");
		for (String s : nameArray) {
			System.out.println(s);
		}
		
		//정규표현식 일단 내일할게요,,
		 String str5="슈퍼맨.팬티.노랑색.우하하.우하하";
		 String[] namearray2 = str5.split(".");
		 //String[] namearray2 = str5.split("\\."); 
		
		for(String s : namearray2) {
			System.out.println(s);
		}
		
		/*
		IP 주소를 .(dot) 기준으로 나누는 예제입니다.
	    구분자를 지정하는 파라미터는 정규표현식이라서 .만 넣으면 원하시는대로 나오지 않습니다.
		정규표현식의 예약어라서 .(dot) 앞에 역슬래시(\)를 2개 넣어야 인식됩니다.
		*/
		String ipAddress = "110.20.0.255";
		String[] ips = ipAddress.split("\\.");
		for (int i = 0; i < ips.length; i++) {
			System.out.println("ips[" + i + "] = " + ips[i]);
		}
	
		// 출력
		//ips[0] = 110
		//ips[1] = 20
		//ips[2] = 0
		//ips[3] = 255	
			
		//정규표현식 (문자들을 조합해서 규칙을 만들고 : 그 규칙하고 데이터 비교해서 판단)
		//우편번호 : {\d3}-{\d3} >> 12-123 (false) , 123*123(false) , 111-111(true)
		//https://cafe.naver.com/erpzone/220
			
		//정규 표현식(java , javascript , Oracle , C#) 표준 
		//핸드폰 , 차량번호 , 도메인주소 , 이메일 정규표현으로 구현 >> 입력한 데이터 유효성 검증  	
	
		//참고 ....StringTokenizer
		 String str6 = "a/b,c-d.f";
		 StringTokenizer sto = new StringTokenizer(str6 , "/,-.");
		 while(sto.hasMoreElements()) {
			 System.out.println(sto.nextToken());
		 }	
		
		//
		//참고
		//String str6 = "a/b,c-d.f";
		sto = new StringTokenizer(str6, "/,-,.");
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		//넌센스
		String str7 = "홍         길          동";
		//저장하면 >> 공백을 제거해서 >> DB에 "홍길동" 으로 저장하고 싶음
		System.out.println(str7.replace(" ", ""));
		
		String str8 = "           홍길동            ";
		System.out.println(str8.trim());
		
		//여러개의 함수를 연결해서 사용할 수도 있다. Method Chain
		String str9 = "    홍    길   동    ";
		System.out.println(str8.trim().replace(" ", ""));
		
		//hint
		int sum = 0;
		String[] numArr = {"1","2","3","4"};
		for (String s : numArr) {
			sum += Integer.parseInt(s);		
		}
		System.out.println(sum);
		
		 String jumin="123456-1234567";
		 int sum1 = 0;
		 jumin = jumin.replace("-", "");
		 for (int i = 0 ; i < jumin.length() ; i++) {
			 sum1 += Integer.parseInt(jumin.substring(i,i+1));
		 }
		 System.out.println(sum1);
		 
		 
		 
		 
		 
		 
	}

}
