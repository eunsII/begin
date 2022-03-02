package day05.solv;

/*
	문제 11 ]
		2x + 4y = 10 의 방정식의 결과를 출력하세요.
		단, x, y는 모두 
			0 <= x, y <= 10
		사이의 숫자이다.
 */
public class Ex11 {

	public static void main(String[] args) {
		for(int x = 0 ; x <= 10 ; x++ ) {
			
			for(int y = 0 ; y <= 10 ; y++ ) {
				if((2 * x + 4 * y) == 10) {
					System.out.println("x : " + x + " | y : " + y + " 일때 성립한다.");
				}
			}
		}
	}

}
