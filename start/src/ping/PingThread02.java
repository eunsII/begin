package ping;

import java.io.*;
import java.net.*;

public class PingThread02 extends Thread {
	private boolean isStart = true;
	private ServerSocket server;
	
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public ServerSocket getServer() {
		return server;
	}
	public void setServer(ServerSocket server) {
		this.server = server;
	}
	
	@Override
	public void run() {
		try {
			server = new ServerSocket(7777);
			System.out.println();
			System.out.println("◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼");
			System.out.println("***  Server  Start  ***");
			System.out.println("◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼");
			doResponse();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close(server);
		}

	}
	
	// 클라이언트가 접속하면 메세지 받아서 응답해주는 함수
	public void doResponse() {
		Socket s = null;
		InputStream is = null;
		OutputStream os = null;
		while(isStart) {
			try (
					Socket socket = server.accept();
					InputStream in = socket.getInputStream();
					InputStreamReader ir = new InputStreamReader(in);
					BufferedReader br = new BufferedReader(ir);
					OutputStream out = socket.getOutputStream();
					/*
						Closable 인터페이스를 구현하는 클래스는
						try 블럭에서 지역변수를 만들수 있고
						try 블럭이 끝나면 자동으로 닫히게 된다.
						
						이 예제와 같은 자바 구분을 
						try - with - resource
						구문이라 한다.
						------------------------------------------------
						이 클래스에서 소켓과 스트림은
						한명의 클라이언트에 한해서 사용되어지는 객체들이다.
						이때 변수를 전역으로 만들게 되면
						객체를 닫게 되더라도 Heap 영역에 만들어진 객체들은 남게되므로
						이 블럭안에서만 사용하는 것이 좋겠다.
					 */
			){
				// 객체 확인 작업용
				s = socket;
				is = in;
				os = out;
				
				String ip = socket.getInetAddress().getHostAddress();
				byte[] buff = new byte[10240];
				/*
				
				int len = in.read(buff);
				String msg = new String(buff, 0, len);
				*/
				String msg = br.readLine();
				
				execMsg(ip, msg);
				
				buff = new String("re ] " + msg).getBytes();
				out.write(buff);
			} catch(SocketException e) {
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			// 객체 확인 출력
			System.out.println("︎****************\n◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎");
			System.out.println();
			System.out.println("s : " + s);
			try {
				byte[] b = new byte[1024];
				int len = s.getInputStream().read(b);
				System.out.println("s.getInputStream().read() : " + new String(b, 0, len));
				/*
					try 블럭이 끝나면서 소켓이 닫혀졌으므로 에러가 발생한다.
				 */
			} catch (IOException e) {
				System.out.println("### 소켓 에러!");
//				e.printStackTrace();
			}
			System.out.println("is : " + is);
			System.out.println("os : " + os);
		}
	}
	
	// 메세지 출력함수
	public void execMsg(String ip, String msg) {
		System.out.println("︎****************\n◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(ip + " - connected!");
		System.out.println(ip + " : " + msg);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println();
		execMsg();
	}
	
	// 메인 명령 입력함수
	public void execMsg() {
		System.out.println("◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎◻︎");
		System.out.println("*** 핑서버 프로그램 ***");
		System.out.println("-----------------------");
		if(!this.isAlive()) {
			System.out.println("서버시작 : start");
			System.out.println("프로그램 종료 : quit");
		} else {
			System.out.println("서버중단 : quit");
		}
		System.out.println("명령을 입력하세요.");
		System.out.println("=======================");
		System.out.print("입력 : ");
	}
	// 사용하지 않는 자원 반환해주는 함수
	public void close(Object o) {
		try {
			if(o instanceof Socket) {
				((Socket) o).close();
			} else if(o instanceof ServerSocket) {
				((ServerSocket) o).close();
			} else if(o instanceof InputStream) {
				((InputStream) o).close();
			} else if(o instanceof OutputStream) {
				((OutputStream) o).close();
			}
		} catch(Exception e) {}
	}
}
