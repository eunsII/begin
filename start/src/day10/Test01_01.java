package day10;

public class Test01_01 {
	/*
		Test01 클래스의 변수에 접근해서 데이터를 읽어보자.
	 */
	private int num1, num2, num3, num4;
	
	// Test01의 변수내용 읽어와서 전역변수에 셋팅해주는 함수
	public void getNo() {
		// Test01의 멤버를 사용하려면 먼저 Heap 영역에 클래스의 내용을 복사해둬야한다.
		// 그 작업은 new 라는 명령을 통해서 이루어진다.
		Test01 t1 = new Test01();
		
//		num1 = t1.no1;	// no1의 접근지정자는 Test01 클래스 내에서만 사용할 수 있도록 private로 지정되어있다.
		num2 = t1.no2;	// Test01 클래스와 같은 패키지(폴더) 에 있으므로 접근지정자가 생략된 경우 이상은 모두 사용할 수 있다.
		num3 = t1.no3; // 같은 패키지 내이기 때문에 사용가능하다.
		num4 = t1.no4;	// no4의 접근지정자는 모든 곳에서 접근가능하도록 public 으로 지정되어있다.
	}
}
