package day18;

public class Test09 {

	public Test09() {
		/*
			스레드 프로그램을 실행해보자.
			
			1. 스레드 프로그램은 반드시 New Born 상태로 만들어야 한다.
				
				New Born 상태란?
				실행 가능한 프로그램으로 만든다는 의미
				==> 자바에서는 new 시키는 것이다.
		 */
		
		MyThread01 sohyun = new MyThread01(); // New Born 상태
		MyThread02 seora = new MyThread02(); // New Born 상태
		// 두개의 스레드가 New Born 상태가 되었다.
		
		// 이것을 실행하기 위해서는 스레드 프로그램이 Runnable 상태로 전위되면 된다.
		
		// New Born  상태의 스레드프로그램을 Runnable 상태로 전위 시키는 명령은 start() 명령이다.
		sohyun.start();
		seora.start();
		System.out.println("=========== 생성자 쪽 종료 ==============");
	}

	public static void main(String[] args) {
		new Test09();
		System.out.println("################ 메인함수 종료 ##################");
	}

}

/*
 	원래는 스레드 프로르램 역시 다른 파일에 클래스를 만들어야 하는데
 	지금은 간단한 테스트이므로 하나의 클래스 내에서 만들도록 한다.
 	두개의 스레드 프로그램을 만들어 보자.
 */

class MyThread01 extends Thread {
	// 이 클래스 내에는 변수나 다른 함수들을 만들수 있지만
	// 여기서는 테스트만 해보기로 한다.
	@Override
	public void run() {
		// 나는 이 프로그램에서 박소연씨가 코딩을 1000개를 하도록 하게 할 것이다.
		for(int i = 0; i < 1000 ; i++ ) {
			System.out.println("### 박소연씨가 코딩을 합니다! : " + (i+1 + " 회차"));
		}
	}
}

class MyThread02 extends Thread {
	@Override
	public void run() {
		// 한서라씨가 스트레칭을 1000번 합니다.
		for(int i = 0 ; i < 1000 ; i++ ) {
			System.out.println("\t\t\t*** 한서라씨가 " + (i + 1) + " 번째 스트레칭을 합니다.");
		}
	}
}
