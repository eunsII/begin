package ping;

import java.util.*;

public class PingServer {
	private PingThread ping;
	private Scanner sc;
	private boolean bool = true;
	public PingServer() {
		ping = new PingThread();
		
		sc = new Scanner(System.in);
		while(bool) {
			// 메세지 출력
			System.out.println();
			System.out.println("*** 핑서버프로그램 ***\n서버시작 : start\n서버중단 : quit\n명령을 입력하세요.");
			String str = sc.nextLine();
			
			switch(str) {
			case "start":
				if(ping.isStart()) {
					ping.start();
					try {
						Thread.sleep(200);
					} catch(Exception e) {}
					break;
				}
				System.out.println("\n*** 이미 서버가 실행중입니다! ***");
				break;
			case "quit":
				bool = false;
				ping.setStart(false);
				try {
					ping.allClose();
				} catch (Exception e) {}
				break;
			}
		}
	}

	public static void main(String[] args) {
		new PingServer();
	}

}
