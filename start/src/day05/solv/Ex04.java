package day05.solv;

/*
	문제 4 ]
		전기요금을 계산해주는 프로그램을 작성하세요.
		
		전기요금표
			
						코드		기본요금		사용요금
			가정용		1			3800			245
			산업용		2			2400			157
			교육용		3			2900			169
			상업용		4			3200			174
			
			
		전기요금은 
			기본요금 + 사용량 * 사용요금
			
		사용자 코드와 사용량을 입력하면
		전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		// 할일
		// 1. 입력도구를 준비한다.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 2. 용도 입력메세지 출력한다.
			System.out.print("* 사용용도 코드를 입력하세요!\n\t가정용\t1\n\t산업용\t2\n\t교육용\t3\n\t상업용\t4\n\t종료\t0\n입력코드 : ");
			/*
				사용용도 코드를 입력하세요!
					가정용		1
					산업용		2
					교육용		3
					상업용		4
			 */
			// 3. 입력받아서 변수 기억시킨다.
			int code = sc.nextInt();
			/*
				블럭킹함수(Blocking Method)
					: 특정상황이 될때까지 그 함수에서 실행을 멈추고 기다리는 함수
			 */
			
			if(code == 0) {
				System.out.println("프로그램을 종료합니다.");
				// 이 경우는 프로그램을 즉시 종료해야 하므로
				break;
			}
	//		System.out.print("입력코드 : " + code);
			// 2 - 1. 사용량 입력메세지 출력한다.
			System.out.print("사용량 입력 : ");
			// 3 - 1. 입력받아서 변수 기억시킨다.
			int sayong = sc.nextInt();
			
			// 4. 용도에 맞게 계산해서 변수에 기억시키고
			String yd = "가정용";
			int money = 0;
			
			switch(code) {
			case 1:
				yd = "가정용";
				money = 3800 + 245 * sayong;
//				System.out.println("입력된 코드는 가정용으로 사용량은 " + 
//										sayong + " 이고\n전기요금은 " + (3800 + 245 * sayong) + " 원 입니다." );
				break;
			case 2:
				yd = "산업용";
				money = 2400 + 157 * sayong;
//				System.out.println("입력된 코드는 산업용으로 사용량은 " + 
//						sayong + " 이고\n전기요금은 " + (2400 + 157 * sayong) + " 원 입니다." );
				break;
			case 3:
				yd = "교육용";
				money = 2900 + 169 * sayong;
//				System.out.println("입력된 코드는 교육용으로 사용량은 " + 
//						sayong + " 이고\n전기요금은 " + (2900 + 169 * sayong) + " 원 입니다." );
				break;
			case 4:
				yd = "상업용";
				money = 3200 + 174 * sayong;
//				System.out.println("입력된 코드는 상업용으로 사용량은 " + 
//						sayong + " 이고\n전기요금은 " + (3200 + 174 * sayong) + " 원 입니다." );
				break;
			}
			
			// 5. 결과 출력하고
			System.out.println("입력된 코드는 " + yd + "으로 사용량은 " + 
									sayong + " 이고\n전기요금은 " + money + " 원 입니다." );
			System.out.println("--------------------------------------------------");
			System.out.println();
		}
	}

}
