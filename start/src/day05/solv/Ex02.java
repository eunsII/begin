package day05.solv;

/*
	Ex02 ]
		'A' 부터 문자를 10개를 만들어서 출력하세요. 
 */
public class Ex02 {

	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++ ) {
			char ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
			
			System.out.print(ch + " ");
		}
		System.out.println();
		
		
		int i = 0 ;
		for( i = 0 ; i < 10; i++ ) {
			char ch = 'A';
			System.out.print((char)(ch + i) + " ");
		}
		System.out.println();
		System.out.println("### i : " + i);
		
		for( i = 0 ; i < 10; i++ ) {
			System.out.print((char)('A' + i) + " ");
		}
	}

}
