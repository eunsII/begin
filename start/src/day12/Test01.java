package day12;

public class Test01 {
	public Test01() {
		Father f1 = new Son();
		
//		Son s1 = new Father();
		
		Father f2 = new Father();
		Son s1 = (Son) f2; // 실행시 오류가 난다.
	}
	public static void main(String[] args) {
		new Test01();
	}
}

class Father {
	void abc() {
		System.out.println("########### father ##############");
	}
}

class Son extends Father {
	void abc() {
		System.out.println("*********** Son ************");
	}
}
