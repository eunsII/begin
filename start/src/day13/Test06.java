package day13;

public class Test06 {

	public Test06() {
		int no1 = 25;
		int no2 = 0 ;
		int result = 0;
		
		try {
			result = no1 / no2;
		} catch(ArithmeticException e) {
			System.out.println("정수를 0으로 나누어서 발생한 예외...!");
		} catch(RuntimeException e) {
			System.out.println("RuntimeException 소속 예외...!");
		} catch(Exception e) {
			System.out.println("RuntimeException 소속 이외의 모든 예외...!");
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
