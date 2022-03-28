package ping;

import java.io.*;
import java.net.*;

public class PingServ extends Thread {
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

	public void run() {
		try {
			server = new ServerSocket(7777);
			System.out.println("### server start ###");
			
			while(isStart) {
				socket = server.accept();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println(ip + " ] connected!");
				
				in = socket.getInputStream();
				out = socket.getOutputStream();
				
				byte[] buff = new byte[10240];
				int len = in.read(buff);
				String msg = new String(buff, 0, len);
				System.out.println("server : " + msg);
				
				buff = new String("re ] " + msg).getBytes();
				out.write(buff);
			}
		} catch(Exception e) {
//			e.printStackTrace();
		} finally {
			try {
				server.close();
				socket.close();
				out.close();
				in.close();
			} catch (Exception e) {}
		}
		System.out.println("### server stop ###");
	}
}
