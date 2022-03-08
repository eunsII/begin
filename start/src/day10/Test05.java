package day10;

public class Test05 {

	public static void main(String[] args) {
		new Test05();
		/*
			이 경우 이 클래스의 기본 생성자는
			자바가상머신이 비어있는 내용으로 만들어서
			호출할 수 있게 된다.
			만약 생성자를 한개라도 만들면
			자바가상머신은 기본생성자를 만드는 작업을 하지 않는다.
		 */
		
//		Test05_01 t1 = new Test05_01();
		// 정수를 입력받는 형태의 생성자를 정의 해놨기 때문에
		// 기본생성자를 자바가상머신이 만들지 않는다.
		Test05_01 t1 = new Test05_01(100);
	}

}

class Test05_01 {
//	public Test05_01() {}	// ==> 되도록이면 내용이 비어있더라도 기본생성자는 만들어 두는게 좋다.
	public Test05_01(int no) {
		System.out.println(no);
	}
}
