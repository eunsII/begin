package day09;

public class Test06 {
	int num;
	
	public Test06() {
		setNum();
	}
	public static void main(String[] args) {
		new Test06();
		
	}
	
	public void setNum() {
		int no = (int)(Math.random()*10 + 1);
		num = no;
		
//		return no;
	}
}
