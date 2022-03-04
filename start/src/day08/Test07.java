package day08;

/*
	문자열 다섯개를 기억할 배열을 만들고
	보기를 입력해 놓고
	문제와 같이 화면에 출력하고
	
	사용자가 정답을 입력하도록 해서
	답안이 맞았는지 확인하는 프로그램을 작성하세요.
 */

import java.util.*;

public class Test07 {

	public static void main(String[] args) {
		// 문제 변수
		String quest = "다음중 블랙핑크의 멤버가 아닌 사람은?";
		// 보기변수
		String[] ans = new String[5];
		// 보기입력
		ans[0] = "제니";
		ans[1] = "둘리";
		ans[2] = "리사";
		ans[3] = "로제";
		ans[4] = "지수";
		
		// 정답 위치값 변수
		int dap = 1;
		System.out.println();
		
		// 문제가 와성이 됬으므로 
		System.out.println(quest);
		// 보기 출력
		for(int i = 0 ; i < ans.length ; i++ ) {
			System.out.println("\t" + (i + 1) + " ) " + ans[i]);
		}
		
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력메세지
		System.out.print("선택번호 : ");
		// 입력받아서 변수에 기억
		int no = sc.nextInt() - 1;
		
		// 정답과 비교해서 결과출력
		String result = no == dap ? "정답" : "오답";
		
		// 결과 출력
		System.out.println("선택한 멤버 " + ans[no] + " 는 " + result + " 입니다.");
	}

}
