package day11;

public class Test07 {
	public Test07() {
		System.out.println("### 1. Grand01 new ##########################");
		new Grand01();
		System.out.println();
		System.out.println("### 2. Father01 new ##########################");
		new Father01();
		System.out.println();
		System.out.println("### 3. Son01 new ##########################");
		new Son01();
		System.out.println();
	}
	public static void main(String[] args) {
		new Test07();
	}

}

class Grand01 {
	public Grand01() {
		System.out.println("#  Grand01 생성자");
	}
}

class Father01 extends Grand01 {
	public Father01() {
		System.out.println("*** Father01 생성자 ***");
	}
}

class Son01 extends Father01 {
	public Son01() {
//		super(); // 상위클래스의 기본 생성자가 자동 호출된다.
		System.out.println("$$$$$$$$$$$$$$$ Son01 생성자 $$$$$$$$$$$$$$$$$$$");
	}
}
