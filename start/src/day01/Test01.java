package day01;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("내가 만든 첫번째 자바 클래스!!!");
		
		Test01 t1 = new Test01();
		t1.abc(); // Test01 클래스에 있는 abc() 실행하세요.
		
		
	}
	
	public void abc() {}
	// 
	
	public static void xyz() {}
	
	// 실행은 CTRL + SHIFT + F11 키를 동시에 눌러서 실행한다.
	
	// static 멤버는 static 영역에 클래스가 실행되는 순간 먼저 올려진다.
}
