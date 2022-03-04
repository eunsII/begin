package day08;

import java.util.Arrays;

/*
	블랙핑크 멤버들의 이름을 기억할 배열을 만들고
	이름을 입력해서
	출력하세요.
 */
public class Test06 {

	public static void main(String[] args) {
		// 이름을 기억할 배열을 만들고
		String[] blackpink;
//		System.out.println(Arrays.toString(blackpink)); ***** 아직 변수만 준비한 상태
		blackpink = new String[4]; // 문자열 데이터를 기억할 공간만 확보한 상태, 각 방은 null 상태...
		 // 이름 입력
		blackpink[0] = "제니";
		blackpink[1] = "리사";
		blackpink[2] = "로제";
		blackpink[3] = "지수";
		
		// 출력
		for(int i = 0 ; i < blackpink.length ; i++ ) {
			System.out.println(blackpink[i]);
		}
	}

}
