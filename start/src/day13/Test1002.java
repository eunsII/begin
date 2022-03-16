package day13;

public class Test1002 extends Test1001 {

	@Override
	public void abc() throws ArithmeticException {
		System.out.println("#######################");
		/*
			예외를 전이하는 함수의 오버라이드는
			예외처리를 같거나 좁은 방향으로 해줘야한다.
		 */
	}
}
