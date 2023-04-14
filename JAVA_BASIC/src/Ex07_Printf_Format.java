import java.util.Scanner;

public class Ex07_Printf_Format {
	public static void main(String[] args) {
		// System.out.println();
		// C# : Console.WriteLine();
		System.out.println('a'); //출력 후 줄바꿈 (엔터)
		System.out.println();
		System.out.println('b');
		
		int num=1000;
		System.out.println(num);
		System.out.println("num 값은 "+ num + "입니다");
		//형식 Format
		System.out.printf("num 값은 %d입니다", num);
		System.out.println();
		System.out.printf("num 값은 [%d] 입니다 또 [%d]도 있어요 \n", num, 12345);
		/*
		형식문자열
		%f : 실수
		%s : 문자열
		%d : 10진수 형식의 정수
		%c : 문자
		\t : tab
		\n : 줄바꿈(linefeed)
		 */
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f 변수값은 %f입니다\n",f);
		
		//cmd 모드 (console 창에서) 사용자가 입력한 값을 read할 수 있다!!!!!!!!!!!
		//설계도 == 클래스 == 타입은 사용하고 싶다면 반드시 heap에 올려서 사용해야합니다
		// heap에 올리는 방법 : new xx();
		Scanner sc = new Scanner(System.in);
//		String value = sc.nextLine(); //기다리면서 엔터를 입력할 때가지의 값을 입력으로 받음
//		System.out.println(value);
		/*
//		int number = sc.nextInt();
//		System.out.println(number);
		
		float fnum = sc.nextFloat();
		
		권장사항...
		되도록이면 nextInt, nextFloat 보다는 모든 데이터를 netLine으로(문자열로)
		읽어서 parseInt나 parseFloat 등으로 바꾸는게 좋음..;;
		Point) String -> 숫자로
		ex)
		String str = sc.nextLine();
		int idata = Integer.parseInt(data);
		
		Integer.parseInt("10000000000");
		Float.parsefloat("3.14");
		
		*/
		
//		System.out.print("숫자를 입력하세요 : ");
//		int number = Integer.parseInt(sc.nextLine());
//		System.out.printf("입력한 숫자는 : %d", number);

		
		
		
		
		
		
	}
}
