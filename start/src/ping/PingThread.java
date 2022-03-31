package ping;

import java.io.*;
import java.net.*;

public class PingThread extends Thread {
	private boolean isStart = true;
	private ServerSocket server;
	private Socket socket;
	private InputStream in;
	private OutputStream out;
	
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
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	public InputStream getIn() {
		return in;
	}
	public void setIn(InputStream in) {
		this.in = in;
	}
	public OutputStream getOut() {
		return out;
	}
	public void setOut(OutputStream out) {
		this.out = out;
	}
	
	@Override
	public void run() {
		try {
			server = new ServerSocket(7777);
			System.out.println("### server start ###");
			doResponse();
		} catch(SocketException e) {
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			allClose();
			System.out.println();
			System.out.println("-----------------------");
			System.out.println("| ### server stop ### |");
			System.out.println("-----------------------");
		}
	}
	
	// 클라이언트가 접속하면 메세지 받아서 응답해주는 함수
	public void doResponse() throws SocketException, Exception {
		while(isStart) {
			socket = server.accept();
			
			String ip = socket.getInetAddress().getHostAddress();
			System.out.println("\n" + ip + " - connected!");
			
			in = socket.getInputStream();
			out = socket.getOutputStream();
			
			byte[] buff = new byte[10240];
			int len = in.read(buff);
			String msg = new String(buff, 0, len);
			System.out.println(ip + " : " + msg);
			
			buff = new String("re ] " + msg).getBytes();
			out.write(buff);
		}
	}
	
	// 열려있는 자원 모두 반환해주는 함수
	public void allClose() {
		close(out);
		close(in);
		close(socket);
		close(server);
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
