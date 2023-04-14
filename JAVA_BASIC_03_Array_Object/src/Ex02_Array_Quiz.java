import javax.net.ssl.SSLEngine;

public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		//국문과 학생들의 기말고사 시험점수입니다
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0]; //max < 79
		int min = score[0]; //min < 79
		/*
		  [제어문]을 통해서 max 라는 변수에 시험점수중에 최대값을 담고
		  min 변수에 시험점수중에 최소값을 담으세요
		  출력결과 : max >> 97 , min >> 54 
		  단) for문을 한번만 사용하세요 (처음하시는 분 두번)
		*/
		for(int i=0; i<score.length; i++) {
			max = (max < score[i]) ? score[i] : max;
			min = (min > score[i]) ? score[i] : min;
		}
		System.out.printf("max: %d min: %d \n",max, min); // 확인) max: 97 min: 54 
		
		
		int[] numbers = new int[10];
		//10개의 방의 값을 1 ~ 10까지로 초기화하고 출력하세요
		for (int j = 0; j < numbers.length; j++) {
			numbers[j]=j+1;
			System.out.print(numbers[j] + " ");
		}
		
		System.out.println();
		//어느 학생의 기말고사 시험점수 (5과목)
		int[] jumsu = {100,55,90,60,78};
		int sum = 0;
		float avg = 0f;
				
		//1. 총과목의 수
		//2. 과목의 합
		//3. 과목의 평균
		//단 2,3문제는 하나의 for으로 해결 (for문 안에서 해결)
		for(int i = 0 ; i < jumsu.length ; i++) {
			sum+=jumsu[i];
			if(i == jumsu.length -1) { //마직막 방이라면
				avg = sum/(float)jumsu.length;
			}
		}
		System.out.printf("총 과목수:[%d] ,총점:[%d] ,평균:[%f]\n",jumsu.length,sum,avg);
		
		System.out.println(lengthOfNum(11111)+"자리");
	}
	
	public static int lengthOfNum (int n){
        int answer = 1;

        while (n/10!=0){
            n /= 10;
            answer++;
        }
        
        return answer;
    }

}