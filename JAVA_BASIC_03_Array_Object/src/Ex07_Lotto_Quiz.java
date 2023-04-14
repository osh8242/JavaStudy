import java.util.Arrays;

public class Ex07_Lotto_Quiz {

	public static void main(String[] args) {
		int[] nums = new int[6];
		for (int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random()*45)+1;
			for(int j = 0 ; j < i ; j++) {
				if(nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("6개 숫자 뽑기 : "+Arrays.toString(nums));
		

//		//선택정렬
//		for(int i = 0 ; i < nums.length-1 ; i++) {
//			for (int j = i+1 ; j < nums.length ; j++ ) {
//				if (nums[i] > nums[j]) {
//					int temp = nums[j];
//					nums[j] = nums[i];
//					nums[i] = temp;
//				}
//			}
//		}
		
		
		//버블정렬
		for(int i = nums.length-1 ; i >=1 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				if (nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println("오름차순 정렬 : "+Arrays.toString(nums));
		
	}

}
