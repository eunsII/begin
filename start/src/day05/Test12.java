package day05;

public class Test12 {

	public static void main(String[] args) {
		// 구구단을 출력하세요.
		
		for(int i = 2 ; i <= 9 ; i++ ) {
			
			for(int j = 1; j <= 9 ; j++ ) {
				System.out.print(i + " x " + j + " = " + (i * j) +"\t");
			}
			System.out.println();
		}
	}

}
