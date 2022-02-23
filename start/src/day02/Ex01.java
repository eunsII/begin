package day02;

import java.util.*;
public class Ex01 {
	/*
		참고 ]
			키보드로 입력된 문자를 읽어오는 방법
				Scanner sc = new Scanner(System.in);
				
				사이에 입력 안내 메세지를 출력해주는 것이 좋다.
				
				String str = sc.nextLine();
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력
		System.out.println("좋아하는 가수는? : ");
		String str = sc.nextLine();
		System.out.println("당신이 입력한 가수는 [ " + str + " ] 입니다.");
		
		sc.close();
	}
}
