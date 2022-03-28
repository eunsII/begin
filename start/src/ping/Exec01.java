package ping;

import java.io.IOException;
import java.util.*;

public class Exec01 {
	private PingServ ping;
	private Scanner sc;
	private boolean bool = true;
	public Exec01() {
		ping = new PingServ();
		
		sc = new Scanner(System.in);
		while(bool) {
			// 메세지 출력
			System.out.println("*** 핑서버프로그램 ***\n서버기동 : start\n서버중단 : quit\n명령을 입력하세요.");
			String str = sc.nextLine();
			
			switch(str) {
			case "start":
				if(!ping.isAlive()) {
					ping.start();
				}
				break;
			case "quit":
				bool = false;
				ping.setStart(false);
				try {
					ping.getServer().close();
				} catch (IOException e) {}
				
				break;
			}
		}
		System.out.println("*** 프로그램 종료 ***");
	}

	public static void main(String[] args) {
		new Exec01();
	}

}
