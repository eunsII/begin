package day19;

import java.io.*;
import java.net.*;

/*
	서버에 접속한 후
	특정 데이터를 서버에 보내면
	서버가 다시 응답하는 데이터를 받는 프로그램을 만들어보자.
 */
public class PingClient01 {

	public PingClient01() {
		/*
			상대방과 통신을 하기 위해서는 통신 도구가 필요하다.
			이 통신 도구의 역할을 하는 클래스가 Socket 이다.
		 */
		Socket socket = null;
		InputStream in = null;
		OutputStream out = null;
		try {
			// Socket 을 만들면 자동적으로 상대방과 접속이 이루어진다.
			socket = new Socket("192.168.0.131", 7777);
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new PingClient01();
	}

}
