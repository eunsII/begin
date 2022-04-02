package ping;

import java.io.*;
import java.net.*;

public class PingThread extends Thread {
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
			System.out.println("### server start ###");
			doResponse();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close(server);
		}
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("| ### server stop ### |");
		System.out.println("-----------------------");
	}
	
	// 클라이언트가 접속하면 메세지 받아서 응답해주는 함수
	public void doResponse() {
		while(isStart) {
			Socket socket = null;
			InputStream in = null;
			OutputStream out = null;
			
			try {
				socket = server.accept();
				
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println("\n" + ip + " - connected!");
				
				byte[] buff = new byte[10240];
				in = socket.getInputStream();
				out = socket.getOutputStream();
				
				int len = in.read(buff);
				String msg = new String(buff, 0, len);
				System.out.println(ip + " : " + msg);
				
				buff = new String("re ] " + msg).getBytes();
				out.write(buff);
			} catch(SocketException e) {
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				close(out);
				close(in);
				close(socket);
			}
		}
		
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
