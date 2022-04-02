package ping;

import java.util.*;

public class PingServer {
	private PingThread ping;
	private Scanner sc;
	
	public PingServer() {
		sc = new Scanner(System.in);
		ping = new PingThread();
		
		loop:
		while(true) {
			// 메세지 출력
			System.out.println();
			System.out.println("*** 핑서버프로그램 ***\n서버시작 : start\n서버중단 : quit\n명령을 입력하세요.");
			String str = sc.nextLine();
			
			switch(str) {
			case "start":
				if(!ping.isAlive()) {
					ping.start();
					try {
						Thread.sleep(200);
					} catch(Exception e) {}
					break;
				}
				System.out.println("\n*** 이미 서버가 실행중입니다! ***");
				break;
			case "quit":
				ping.setStart(false);
				ping.close(ping.getServer());
				break loop;
			}
		}
	}

	public static void main(String[] args) {
		new PingServer();
	}

}
