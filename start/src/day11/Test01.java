package day11;

public class Test01 {
	int no1 = 10; // ==> 명시적 초기화
	
	
	
	int no2;
//	no2 = 100; // ==> 클래스블럭 내에서는 일반명령이 오면 절대로 안된다.
	{ // 초기화 블럭을 이용한 초기화
		no1 = 1;
		no2 = 100;
	}
	
	public Test01() {
		System.out.println(no1);
	}
	public static void main(String[] args) {
		new Test01();
	}

}
