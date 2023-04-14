import java.io.File;

/*
파일, 폴더를 다루는 클래스 학습
C# : 파일(File), 폴더(Directory)를 다루는 방법이 다름
Java : 파일 클래스 하나로 파일과 폴더 둘다 다룬다
	(파일의 생성과 삭제, 폴더의 생성과 삭제)
	>>a.txt 생성가능, 수정가능, 삭제가능, 읽기가능
	>>폴더 생성가능, 수정가능, 삭제가능, 읽기가능
	
--경로
1.절대경로 ex) C:\\temp\\a.txt
2.상대경로 ex) [현재작업경로]\\
	
 */


public class Ex07_File {

	public static void main(String[] args) {
		String path = "D:\\Temp\\file.txt";
		File f = new File(path);
		
		//File 클래스는 다양한 정보취득
		System.out.println("파일존재여부 (파일,폴더) : " + f.exists());
		System.out.println("너 폴더니? :" +f.isDirectory());
		System.out.println("너 파일2니? :" +f.isFile());
		System.out.println("파일명 : " + f.getName());
		System.out.println("절대경로 : " + f.getAbsolutePath());
		System.out.println("파일의 크기 : " + f.length()+"byte");
		System.out.println("부모경로 : " + f.getParent());
		
	}

}
