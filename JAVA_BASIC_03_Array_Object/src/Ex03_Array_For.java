
public class Ex03_Array_For {

	public static void main(String[] args) {
		/*
		Today Point
		for문 >> 향상된 for문, 개선된 for문
		JAVA 		: for ([type] [변수명] : [배열 or Collection]) { [실행블럭] }
		C# 			: for ([type] [변수명] in [배열 or Collection]) { [실행블럭] }
		JavaScript  : for ([type] [변수명] in [배열 or Collection]) { [실행블럭] }
		
		 */
		
		
		int[] arr = {5,6,7,8,9};
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		//개선된 for문
		for(int value : arr) {
			System.out.println(value);
		}
		
		String[] strArr = {"A", "B", "C", "D", "FFFFFFF"};
		for (String str : strArr) {
			System.out.println(str);
		}
		
	}

}
