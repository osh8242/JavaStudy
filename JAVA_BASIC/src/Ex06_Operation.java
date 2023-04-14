
public class Ex06_Operation {

	public static void main(String[] args) {
		// 대입 연산자
		// +=, -=, *=, /=
		int sum = 10;
		sum += 1; // sum = sum+1;
		sum -= 1; // sum = sum-1;
		System.out.println("sum : " + sum);

		/*
		 * if (조건식) { }
		 * 
		 * if (조건식) { } else { }
		 * 
		 * if (조건식) { } else if { } else if { } .... else { }
		 * 
		 * 간단한 학점 계산기 만들기 학점 : A+, A0, B+, B0, C+, C0, D+, D0, .... F 판단기준 : 90이상 A(다시
		 * 95 기준+), 80이상 B(다시 85 기준+), 70이상 B(다시 75 기준+), 나머지 F
		 * 
		 */
		int score = (int) (Math.random() * 101);
		score = 94;
		String grade = ""; // A+, A-, B+, B-, C+, C-, F..
		if (score >= 90) {
			grade = "A";
			grade += (score >= 95) ? "+" : "-"; 
					
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("score : "+ score);
		System.out.println("grade : "+ grade);

	
	
		for( char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
		
		for (int i = 65; i <= 90 ; i++) {
			System.out.println((char)i);
		}
		System.out.println();
		
		for (int i  = 1 ; i <= 100 ; i++) {
			System.out.print(i+" "); //print() 줄바꿈 처리없이 출력
			if(i % 10 == 0) {
				System.out.println(); //println() 출력 후 \n
			}
		}
		
		//입사시험 (가장 많이 나오는 문제)
		//hint) 제어문 (반복문)에서 구구단
		for (int i = 2 ; i < 10 ; i++) {
			for (int j = 1 ; j <10 ; j++) {
				//System.out.print(i+"*"+j+"="+i*j+"\t");
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
	
	


