package day13;

/*
	강제 예외 던지기
	==> 자바는 예외로 인정하지 않지만
		프로그램 목적상 예외로 처리해야 되는 경우 처리하는 방법
 */

import java.util.*;
public class Test13 {

	/*
		사용자가 나이를 입력하면 입력된 나이를 출력하는 프로그램을 작성하세요.
		단, 나이를 음수로 입력하면 예외로 처리되게 하세요.
		==> 강제로 예외가 발생하게 하세요.
	 */
	public Test13() {
		Scanner sc = new Scanner(System.in);
		
		try {
			getAge(sc);
		} catch(Exception e) {
//			e.printStackTrace();
			System.out.println("Error ] 나이가 음수로 입력되었습니다.");
		}
	}
	
	public void getAge(Scanner sc) throws Exception {
		// 메세지 출력
		int age = 0;
		
		while(true) {
			System.out.print("* 나이 입력 : ");
			try {
				age = sc.nextInt();
				
				break;
			} catch(Exception e) {
				System.out.println("# 잘못된 입력입니다.");
			}
		}
		
		if(age < 0) {
			// 이 경우는 나이가 음수로 입력된 경우이므로
			// 강제로 예외를 발생시키기로 하자.
			throw new Exception();
		} else {
			System.out.println("입력된 나이는 " + age + " 입니다.");
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}
