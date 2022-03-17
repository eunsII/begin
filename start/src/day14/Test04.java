package day14;

import java.util.*;

/*
	Test05 를 확인한 후 이 클래스를 확인하세요.
	
-----------------------------------------------------------------------------------------------
	Test03에서 만든 문자열을 줄바꿈 기호를 기준으로 분리해서
	배열에 담아보자.
	
	참고 ]
		배열을 만들때 필요한 것
			1. 타입
			2. 갯수
 */
public class Test04 {

	public Test04() {
		// 1. StringBuffer 객체를 만들고
		StringBuffer buff = new StringBuffer();
		// 2. 반복해서 결합작업을 하고
		buff.append("Hey boy\n");
		buff.append("Make 'em whistle like a missile, bomb, bomb\n");
		buff.append("Every time I show up, blow up, uh\n");
		buff.append("Make 'em whistle like a missile, bomb, bomb\n");
		buff.append("Every time I show up, blow up, uh\n");
		
		// 3. 문자열로 변환이 필요한 순간에 변환해준다.
		String song = buff.toString();
		
		// 줄바꿈기호를 기준으로 분리한다.
		StringTokenizer token = new StringTokenizer(song, "\n");
		
		/*
			잘려진 데이터를 배열에 기억할 예정이므로
			전체 갈려진 갯수를 알아낸다.
		 */
		int len = token.countTokens(); // 분리한 데이터의 갯수를 반환해주는 함수
		
		// 분리된 데이터를 기억할 배열 만들고
		String[] norea = new String[len];
		
		// 하나씩 꺼내서 배열에 담아준다.
		for(int i = 0 ; token.hasMoreTokens() ; i++ ) {
			// 데이터꺼내고
			String tmp = token.nextToken();
			// 꺼낸데이터 배열에 담고
			norea[i] = tmp;
		}
		
		// 배열 내용 출력
		for(String s : norea) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
