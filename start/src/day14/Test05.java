package day14;

/*
	
	문자열 데이터
		
		"제니,리사,로제,지수"
	를 , 를 기준으로 분리해서 출력해보자.
 */

import java.util.*;

public class Test05 {

	public Test05() {
		String member = "제니,리사,로제,지수";
		
		// , 를 기준으로 자른다.
		StringTokenizer token = new StringTokenizer(member, ",");
		/*
			이렇게 객체가 만들어지면 
			잘려진 결과는 버퍼메모리(임시메모리공간)에 기억이되고
			하나씩 꺼내서 사용해야 하는데
			주의사항은
			한번꺼낸데이터는 꺼내는 즉시 메모리에서 사라진다.
			따라서 결과를 사용해야 한다면 
			변수나 배열등에 기억시켜놓아야 한다.
		 */
		
		int len = token.countTokens(); // 잘려진 데이터의 갯수를 반환해주는 함수
		
		// 데이터를 기억할 배열
		String[] pink = new String[len];
		
		// 인덱스 변수 만들고
		int idx = 0;
		
		// 하나씩 꺼내서 출력한다.
		while(token.hasMoreTokens()) {
			// token.hasMoreTokens() : 임시메모리에 꺼낼 문자열이 있는 여부를 논리값으로 반환해준다.
			// token.hasMoreElements()	: 임시메모리에 꺼낼 객체가 있는지 여부를 논리값으로 반환해준다.
			
			// 한번꺼낸 데이터는 사라진다. 다시 접근해서 사용할 수 없다.
			// 여기서는 출력만 할 예정이므로 꺼내서 출력만 하자.
			
//			String black = (String)(token.nextElement()); // nextElement() 함수의 반환값은 Object 타입으로 반환해준다.
			String black = token.nextToken();
			
			// 배열에 기억
			pink[idx] = black;
			// 인덱스 증가
			idx++;
			
			// 출력
			System.out.println(black);
			/*
//			int no = null;
			Integer no = null;
			*/
		}
		
		System.out.println("-------------------------------------");
		// 꺼낸 데이터를 다시 꺼낼수는 없다.
		while(token.hasMoreTokens()) {
			String black = token.nextToken();
			
			// 출력
			System.out.println(black);
		}
		
		// 배열의 내용 출력
		for(String name : pink) {
			System.out.print(name + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test05();
	}

}
