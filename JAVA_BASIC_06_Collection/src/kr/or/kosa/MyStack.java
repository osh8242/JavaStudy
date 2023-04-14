package kr.or.kosa;

public class MyStack {
	
	private Object[] stackarr;
	private int top;
	
	public MyStack(int maxsize) {
		this.stackarr  = new Object[maxsize];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return top==-1?true:false;
	}
	
	public boolean isfull() {		
		return (top==(stackarr.length-1))?true:false;
	}
	
	public void push(Object i) {
		if(!isfull()) {
			stackarr[++top] = i;
		} else {
			System.out.println("stack에 더이상 넣을 수 없습니다.");
			System.out.println("push에 실패한 값 : "+i.toString());
		}
	}
	
	public Object pop() {
		if(!isEmpty()) {
			Object temp = stackarr[top];
			stackarr[top--] = null;
			return temp;
		} else {
			System.out.println("stack이 비어있어 pop을 수행할 수 없습니다");
			return false;
		}
		
	}
}
