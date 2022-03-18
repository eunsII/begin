package day15;

import java.util.*;

public class Test02 {

	public Test02() {
		Random rd = new Random();
		System.out.println(rd.nextInt());
		
		Random rd1 = new Random(10);
		/*
			난수표에서 10번 위치부터 난수를 뽑아주세요...
			seed를 알려주면서 가져오기때문에 항상 나오는 순서가 동일하다.
		 */
		
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = rd1.nextInt(100); // 0 ~ 100 사이의 난수를 발생해주세요.
			
			// 출력
			System.out.print(no + " | ");
			// 13 | 80 | 93 | 90 | 46 | 56 | 97 | 88 | 81 | 14 |
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
