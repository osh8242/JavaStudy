import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDos {

	static String defaultPath = "D:\\temp" + File.separator;
	static String path = defaultPath;
	static long totalSize = 0;
    static List<File> foundFiles = new ArrayList<>();


	public static void main(String[] args) {

		System.out.println("Bitamp Microsoft Windows DOS 명령어 [Version 1.1]");
		System.out.println("2020 Bitcamp. All rights reserved");
		System.out.println("명령어 목록을 보려면 '?'를 입력하세요\n");

		Scanner sc = new Scanner(System.in);
n
		String[] input = null;

		while (true) {
			System.out.print(path + ">");
			input = sc.nextLine().trim().split(" "); // input배열에 띄어쓰기 기준으로 각 방에 저장, 첫 번째 방 전에 공란 방지

			if (input[0].equalsIgnoreCase("exit")) { // 오직 exit로만 Dos 종료 가능
				System.out.println("Exit");
				System.exit(0);
				return;
			}

			switch (input[0].toLowerCase()) {
			case "?":
				showGuide();
				break;
			case "size":
				getTotalSize(new File(path));
				System.out.println(totalSize+"byte");
				totalSize = 0;
				break;
			case "find":
	            findDirectory(input[1]);
	            foundFiles.clear();
	            break;
			case "ren":
			case "rename":
				renameDirectory(input);
				break;
	         case "erase":
	        	eraseFile(input[1]);
	        	break;			
	        default:

			}
		}
	} // main
	
	private static void showGuide() {
		System.out.println("지원하는 명령어 :");
		System.out.println("size \t// 해당 폴더 내의 모든 파일(하위 폴더 포함)의 크기를 알려줍니다.");
		System.out.println("find [검색어] \t// 해당 폴더 내에 해당 검색어를 가진 파일 목록을 알려줍니다.");
		System.out.println("rename [원본파일명] [바꿀파일명] \t// 파일 이름을 바꿉니다.");
		System.out.println("erase [파일명] \t//해당 파일를 완전히 삭제합니다.(복구불가)");
		
	}
	
	private static void getTotalSize(File dir) {
		File f = new File(dir.getAbsolutePath());
		File[] files = f.listFiles();
		List<Integer> subDir = new ArrayList<>();
		for (int i = 0 ; i < files.length ; i++) {
			if (files[i].isDirectory()) {
				subDir.add(i);
			} else {
				totalSize += files[i].length();
			}			
		}

		for(int i = 0 ; i < subDir.size() ; i++) {
			getTotalSize(files[subDir.get(i)]);
		}
	}
	
	public static void findDirectory(String input) {
	      List<File> foundFiles = find(new File(path), input);

	      if (foundFiles.isEmpty()) {
	         System.out.println("파일을 찾을 수 없습니다.");
	      } else {
	         System.out.println("검색된 파일 목록:");
	         for (File file : foundFiles) {
	            System.out.println(file.getAbsolutePath());
	         }
	      }
	   }

	   public static List<File> find(File directory, String input) {      
	      File[] files = directory.listFiles();
	
	      for (File file : files) {         
	         if (file.isFile() && file.getName().contains(input)) {
	            foundFiles.add(file);
	         } else if (file.isDirectory()) {
	            find(file, input);
	         }
	      }
	      return foundFiles;
	   }
	   
	   static void renameDirectory(String[] input) {
	      File beforeRen = new File(path + input[1] );//input[1] : 기존 파일명
	      if(beforeRen.exists()) {
	         File afterRen = new File(path + input[2] );//input[2] : 바꿀 파일명
	         if(afterRen.exists()) {
	            System.out.println("이미 존재하는 파일명입니다.");
	         }else {            
	            beforeRen.renameTo(afterRen);
	            if(!afterRen.exists()) {
	            System.out.println("error!");
	            }
	         }
	      }else {
	         System.out.println("존재하지 않는 파일입니다.");
	      }
	   }
	   
	   public static void eraseFile(String fileName) {
	       String filePath = path + File.separator + fileName;

	       File file = new File(filePath);

	       if (file.exists()) {
	           if (file.delete()) {
	               System.out.println("파일이 삭제되었습니다.");
	           } else {
	               System.out.println("파일을 삭제하는데 실패하였습니다.");
	           }
	       } else {
	           System.out.println("해당 파일이 존재하지 않습니다.");
	       }
	   }

	
	
}// class