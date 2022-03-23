package day17;

/*
	키보드를 이용해서 문자를 입력받아보자.
 */

import java.io.*;
import java.util.*;

public class Test07 {

	public Test07() {
		/*
			참고 ]
				키보드 역시 입력장치로 외부장치이다.
				자주 사용하는 외부장치이므로
				이미 스트림을 준비한 변수가 존재한다.
				
				System.in
		 */
		System.out.print("입력해주세요! : ");
		try {
			/*
			int ch = 0;
			// 1. 한글자만 읽어보자.
			ch = System.in.read();
			// 출력
			System.out.println("입력한 문자 : " + (char) ch);
			
			// 2. 문장을 입력해서 읽어보자.
			// 여러문자를 기억할 변수를 준비한다.
			byte[] buff = new byte[256];
			// 배열을 만들때 입력한 숫자가 한번에 읽은 수 있는 데이터의 양을 결정한다.
			int len = System.in.read(buff); // len :  읽은 문자의 갯수를 반환해준다.
			// 읽은 데이터를 문자로 변환해서 출력
			String str = new String(buff, 0, len);
			// 출력
			System.out.println("입력 문장 : " + str);
			 */
			
			// 3. 주로 네트워크 처리를 할 때 많이 사용하는 방법
			byte[] buff = new byte[256];
			// 배열에 기본값을 'A'로 채워보자.
			Arrays.fill(buff, (byte)'A'); // ==> 배열의 모든 방에 'A'로 채워넣는다.
			int len = System.in.read(buff, 10, 100);
			// 준비된 배열인 buff에 11번째 방부터 읽은 내용을 기억하세요...
			// 최대 100까지만 읽어오세요..( 100글자만 읽어온다.)
			String str = new String(buff, 0, len + 10);
			System.out.println("입력한 내용 : " + str);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
