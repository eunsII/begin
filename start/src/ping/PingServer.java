package ping;

import java.util.*;

public class PingServer {
	private boolean bool = true;
	private PingThread ping;
	private Scanner sc;
	public PingServer() {
		ping = new PingThread();
		
		sc = new Scanner(System.in);
		
		loop:
		while(true) {
			// 메세지 출력
			System.out.println();
			System.out.println("*** 핑서버프로그램 ***\n서버시작 : start\n서버중단 : quit\n명령을 입력하세요.");
			String str = sc.nextLine();
			
			switch(str) {
			case "start":
				if(bool) {
					ping.start();
					bool = false;
					try {
						Thread.sleep(200);
					} catch(Exception e) {}
					break;
				}
				System.out.println("\n*** 이미 서버가 실행중입니다! ***");
				break;
			case "quit":
				ping.setStart(false);
				try {
					ping.allClose();
				} catch (Exception e) {}
				break loop;
			}
		}
	}

	public static void main(String[] args) {
		new PingServer();
	}

}
