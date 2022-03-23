package day18;

import java.io.*;

/*
	1. 버퍼리더라이터를 사용해서 파일을 복사해보자.
	2. PrintWriter 를 이용해서 blackpink.txt 파일을 복사해보자.
 */

public class Test05 {

	public Test05() {
		// 타겟(기본)스트림 준비
		FileReader fr = null;
		FileWriter fw = null;
		// 보조(필터)스트림 준비
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		// PrintWriter
		PrintWriter pw = null;
		
		try {
			// 읽는 쪽 스트림
			// 스트림 연결하고
			fr = new FileReader("src/day18/result/blackpink.txt");
			// 필터스트림
			br = new BufferedReader(fr);
			
			// 쓰는쪽 스트림
			/*
			fw = new FileWriter("src/day18/result/blackpink_01.txt");
			bw = new BufferedWriter(fw);
			*/
			pw = new PrintWriter("src/day18/result/blackpink_02.txt");
			
			// 몇번을 반복해야할지 모르므로
			while(true) {
				// 읽어온다.
				String str = br.readLine();
				
				if(str == null) {
					// 읽어온 데이터가 없는 경우
					break;
				}
				
				/*
				bw.write(str + "\r\n"); 
				// 읽어올때 줄바꿈 기호를 버렸기 때문에 쓸때는 추가해준다.
				
				// 버퍼가 다 채워지지 않은 경우는 강제로 비워준다.]
				bw.flush();
				*/
				pw.println(str);
				
				pw.flush();
			}
			
			System.out.println("### 복사 성공 ###");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
