package ping;

import java.io.*;
import java.net.*;

public class PingServer {
	ServerSocket server;
	
	public PingServer() {
		try {
			server = new ServerSocket(7777);
			
			while(true) {
				System.out.println("서버 접속 대기");
				
				// 클라이언트에게 접속 허용
				Socket socket = server.accept();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println("### " + ip + " ] 접속완료!");
				
				// 데이터 입출력 준비
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				
				// 데이터 받고
				byte[] buff = new byte[10240];
				int len = in.read(buff);
				// 문자열 변환
				String msg = new String(buff, 0, len);
				// 출력
				System.out.println(ip + " : " + msg);
				
				// 응답 메세지
				// 데이터 만들고
				String remsg = msg + " - server";
				// 서버메세지 전송
				byte[] buff1 = remsg.getBytes();
				out.write(buff1);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
