package day03.ex;

/*
	84232원을 지불할려고 한다.
	우리나라 화폐단위로 이금액을 지불하려면 
	각 단위가 몇개씩 필요한지 계산해서 출력하세요.
	
	화폐단위
		50000권
		10000권
		5000권
		1000권
		500권
		100
		50
		10
		1
	
 */
public class Ex03 {
	public static void main(String[] args) {
		int total = 84232;
		
		int tmp = total;
		
		// 5만원권
		int oman = tmp / 50000;
		// 5만원권 제외한 금액 기억
//		tmp = tmp % 50000;
		tmp %= 50000; // tmp를 50000으로 나눈 나머지를 tmp에 대입하세요.
		
		// 1만원권
		int man = tmp / 10000;
		// 1만원권 제외금액 기억
//		tmp = tmp % 10000;
		tmp %= 10000;
		
		// 5000원권
		int ochun = tmp / 5000;
		
		tmp = tmp % 5000;
		
		// 1000원권
		int chun = tmp / 1000;
		tmp = tmp % 1000;
		
		// 500원권
		int obeak = tmp / 500;
		tmp = tmp % 500;
		
		// 100원권
		int beak = tmp / 100;
		tmp = tmp % 100;
		
		// 50
		int oship = tmp / 50;
		tmp = tmp % 50;
		
		// 10
		int ship = tmp / 10;
		
		// 1
		int il = tmp % 10;
		
		// 결과출력
		
		System.out.printf("%8s%3d%-4s%n", "총금액 ", total, " 원은 ");
		System.out.printf("%11s%3d%-4s%n", "오만원권 : ", oman, " 장");
		System.out.printf("%12s%3d%-4s%n", "만원권 : ", man, " 장");
		System.out.printf("%11s%3d%-4s%n", "오천원권 : ", ochun, " 장");
		System.out.printf("%12s%3d%-4s%n", "천원권 : ", chun, " 장");
		System.out.printf("%11s%3d%-4s%n", "오백원권 : ", obeak, " 장");
		System.out.printf("%12s%3d%-4s%n", "백원권 : ", beak, " 장");
		System.out.printf("%11s%3d%-4s%n", "오십원권 : ", oship, " 장");
		System.out.printf("%12s%3d%-4s%n", "십원권 : ", ship, " 장");
		System.out.printf("%12s%3d%-4s%n", "일원권 : ", il, " 장");
	}
}
