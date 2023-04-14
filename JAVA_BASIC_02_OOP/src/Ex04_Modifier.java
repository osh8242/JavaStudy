import kr.or.kosa.Mouse;
import kr.or.kosa.Notebook;

public class Ex04_Modifier {

	public static void main(String[] args) {
		/*
		Notebook notebook = new Notebook();
		notebook.color = "blue";
		notebook.year = -2023;
		*/
		
		Notebook notebook = new Notebook();
		notebook.setColor("blue");
		notebook.setYear(-1000);
		notebook.noteBookInfo();
		System.out.println(notebook.getYear());
		System.out.println(notebook.getColor());
		//------------------------------------------
		Notebook mynote = new Notebook();
		Mouse mymouse = new Mouse();
		
		// 마우스가 필요해 마우스를 노트북에 연결해주어~
		mynote.handleMouse(mymouse); // 마우스의 주소값을 저장
		
		
		
		
		
		
		
	}

}
