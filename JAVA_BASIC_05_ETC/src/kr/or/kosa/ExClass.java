package kr.or.kosa;

import java.io.IOException;

/*
설계도
....
개발자 아니고 설게자 입장에서 ... 생각 ....
개발자가 어떤 상황에 대해서 반드시 예외를 처리해줬으면 하는 강제성

생성자나 함수를 만들었을 때 ... 반드시 예외처리를 하도록 강제 코드 생성

 */
public class ExClass {
	public ExClass(String path) throws IOException, NullPointerException{ //Overloading Constructor
		System.out.println("path : "+path);
	}

}
