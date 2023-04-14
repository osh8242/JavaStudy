import kr.or.kosa.dto.Emp;

public class Ex05_Object_Array_Quiz {

	public static void main(String[] args) {
		/*
		1번 문제
		사원 3명을 만드세요
		단, Array를 사용하세요
		사원의 정보
		1000, 홍길동
		2000, 김유신
		3000, 유관순
		 */
		Emp[] empArray = new Emp[] {
				new Emp(1000, "홍길동"), new Emp(2000, "김유신"), new Emp(3000, "유관순")
				};
		
		
		
		/*
		2번 문제
		개선된 for문으로 사번, 이름을 모두 출력하세요
		 */
		for (Emp address : empArray) {
			address.empInfoPrint();
		}
		
		
	}

}
