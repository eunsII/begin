package day15;

/*
	파라미터로 전달된 문자열
		http://www.blackpink.org/member/?id=euns&pw=12345&tel=01031759042
	중에서 넘겨진 데이터만 잘라서 출력하세요.
	
 */

import java.util.*;

public class Test01 {

	public Test01() {
		String url = "http://www.blackpink.org/member/?id=euns&pw=12345&tel=01031759042";
		// 위 문자열에서 데이터부분만 추출하려면 
		// ? 기호의 위치값을 알아낸후 그 바로다음 위치에서부터 끝까지 잘라내면된다.
		
		int idx = url.indexOf('?');
		String param = url.substring(idx + 1); // ==> "id=euns&pw=12345&tel=01031759042"

		System.out.println(param);
		
		// 만들어진 문자열을 & 를 기준으로 잘라내서 배열에 담아보자.
		StringTokenizer token = new StringTokenizer(param, "&");
		// 잘려진 갯수 알아내고
		int cnt = token.countTokens();
		// 문자열 배열을 만든다.
		String[] tmp = new String[cnt];
		// 배열에 잘려진 내용을 순차적으로 채운다.
		/*
		int i = 0;
		while(token.hasMoreTokens()) {
			tmp[i++] = token.nextToken();
//			i++;
		}
		*/
		for(int i = 0 ; token.hasMoreTokens() /* i < cnt */ ; i++ ) {
			tmp[i] = token.nextToken(); // 이 명령을 실행하는 순간 버퍼메모리에서 꺼낸 데이터는 삭제하게 된다.
		}
		/*
			반복문에서 조건식의 의미는 반복회수의 컨트롤에 의미가 있다.
		 */
		
		System.out.println(Arrays.toString(tmp));
		String[][] data = new String[cnt][2];
		for(int i = 0 ; i < tmp.length ; i++ ) {
			String str = tmp[i];
			StringTokenizer tk = new StringTokenizer(str, "=");
			
			data[i][0] = tk.nextToken();
			data[i][1] = tk.nextToken();
		}
		
		// 결과 출력
		for(String[] arr : data) {
			/*
			for(String s : arr) {
				System.out.print(s + " : ");
			}
			System.out.println();
			 */
			System.out.println(arr[0] + " : " + arr[1]);
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
