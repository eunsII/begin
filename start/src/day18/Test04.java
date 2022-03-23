package day18;

import java.io.*;

/*
	버퍼리더를 사용해서 휘파람.txt 파일을 읽어보자.
 */
public class Test04 {

	public Test04() {
		// 타겟(기본)스트림
		FileReader fr = null;
		// 필터(보조)스트림
		BufferedReader br = null;
		try {
			// 스트림 연결하고
			fr = new FileReader("src/day18/result/blackpink.txt");
			br = new BufferedReader(fr);
			
			// 읽은 데이터 기억할 배열 만들고
//			char[] buff = new char[1024];
			// 몇번 읽어야 할지 모르므로
			while(true) {
				String line = br.readLine(); //  줄단위로 한행씩 읽는 함수. 주의 ] 줄바꿈기호는 읽지않는다.
				
				if(line == null ) {
					// 읽은 데이터가 없는 경우...
					break;
				}
				
				System.out.println(line);
				/*
					println() 함수는 내용을 출력한 후 줄을 바꾸는 명령이다.
					이미 readLine()에서 한 행을 읽은 후
					줄바꿈기호를 버렸기 때문에
					읽은 내용을 그대로 출력하는 경우
					자동으로 줄이 바뀌지 않는다.
					따라서 강제로 줄바꿈 작업을 해줘야 한다.
				 */
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
