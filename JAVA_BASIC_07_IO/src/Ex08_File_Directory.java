import java.io.File;

public class Ex08_File_Directory {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		if(args.length != 1) { //방법을 ...
			System.out.println("사용법 : java 파일명 [디렉토리명]");
			System.out.println();
			System.exit(0);
		}
		
		//java Ex08_File_Dir C:\\temp\\
		
		File f = new File(args[0]); //File("D:\\Temp")
		if(!f.exists() || !f.isDirectory()) {
			//파일자체가 존재하지 않거나, 폴더가 아니라면
			System.out.println("유효하지 않은 경로입니다");
			System.exit(0);
		}
		
		//실제 존재하는 경로이고..폴더라면
		File[] files = f.listFiles();
		//[1.][2.][3.][a.txt][file.txt][new.txt][직박구리]\
		for(int i = 0 ; i < files.length ; i++) {
			String name = files[i].getName();
			System.out.println(files[i].isDirectory()?"[DIR]"+name:name);
		}
		
		
	}

}
