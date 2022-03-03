package day07;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		/*
			정수 6개를 관리할 배열 arr 을 만들고
			1 ~ 6까지 채워서 
			한개씩 꺼내서 출력하세요.
		 */
		
		// 배열변수 선언
		/*
			배열 변수의 선언 형식
				데이터타입[]	변수;
		 */
		int[]	arr;
		// 배열변수 초기화
		arr = new int[6];
		
		//  출력
		// 참고 ] 배열의 길이를 알아내는 방법 : 배열.length
		int len = arr.length;
		for(int i = 0 ; i < len ; i++ ) {
			//  배열에 기억된 데이터 꺼내는 방법
			// 		배열변수[위치값]
			int no = arr[i];
			
			System.out.println(no);
			/*
				Heap 에 만들어지는 기본데이터타입 변수들은 모두
				자동 초기화기 된다.
					boolean	: false
					char	: 아스키코드값 0에 해당하는 문자
					byte	:	0
					short	:	0
					int		:	0
					long	:	0
					float	:	0.0f
					double	:	0.0
			 */
		}
		
		// 블랙핑크 멤버의 이름을 기억할 배열을 만들어서 출력하세요.
		// 블랙핑크는 4명으로 구성되어있습니다.
		//		제니, 리사, 로제, 지수
		
		String[] blackpink = new String[4];
		
		// 출력
		for(int i = 0 ; i < blackpink.length ; i++ ) {
			// int len = blackpink.length
			System.out.println(blackpink[i]);
		}
		
		// 멤버이름 추가
		blackpink[0] = "제니";
		blackpink[1] = "리사";
		blackpink[2] = "로제";
		blackpink[3] = "지수";
		
		// 출력 - 내용확인용
		System.out.println(Arrays.toString(blackpink));
		
		// 데이터를 하나씩 꺼내서 출력
		for(int i = 0 ; i < blackpink.length /* <=== int len = blackpink.length; */; i++ ) {
			/*
				참고 ]
					여러개의 데이터를 관리하는 데이터타입들은
					데이터 한개를 꺼냈을 때의 그 데이터의 타입을 먼저 생각해봐야 한다.
			 */
			
			// i번째의 멤버의 이름을 꺼내서 변수에 기억
			String name = blackpink[i];
			
			// 변수에 기억된 데이터를 출력
			System.out.println(name);
		}
		
		// 둘리 멤버를 추가해서 출력하세요.
		/*
			참고 ]
				배열은 한번 만들어지면 크기와 타입을 수정할 수 없다.
				따라서 데이터의 갯수가 수정이 필요하면
				배열을 다시 만들어서 변수에 기억시켜야 한다.
		 */
		
		// 배열을 다시만들고
		String[] tmp = new String[5];
		for(int i = 0 ; i < 4 ; i++ ) {
			tmp[i] = blackpink[i];
		}
		// 이렇게 하면 다섯번째 방은 아직 비어있다.
		tmp[4] = "둘리";
		
		blackpink = tmp;
		
		//  하나씩 꺼내서 출력
		// 배열과 같은 데이터는 향상된 for 명령(forEach 명령)이 데이를 꺼내서 사용하는데 편하다.
		for(String name : blackpink) {
			// 의미 ] blackpink의 데이터를 순차적으로 하나씩 꺼내서 name 변수에 기억시키세요.
			
			// 출력
			System.out.print(name + " ");
		}
		System.out.println();
		
	/*
		// 향상된 for 명령 사용
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("제니");
		list.add("리사");
		list.add("로제");
		list.add("지수");
		
		// 출력
		for(String name : list) {
			System.out.print(name + " | ");
		}
	*/
		
		
	}

}
