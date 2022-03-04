package day08;

/*
	문자와 출현수를 기억한 배열들 10개를 관리하는 배열을 만들고
	'A' - 'J' 를 랜덤하게 100번 반복해서 만들고
	배열에 카운트를 기억시켜서
	결과를 출력하세요.
 */
public class Test12 {
	
	public static void main(String[] args) {
		int[][] munja = new int[10][2]; // 문자 열개의 데이터 2개 를 관리할 배열
		
		// 문자를 입력해본다.
		/*
		munja[0][0] = 'A';
		munja[1][0] = 'B';
		munja[2][0] = 'C';
		
		'A' + 0 ==> 'A'
		'A' + 1 ==> 'B'
		*/
		for(int i = 0 ; i < munja.length ; i++ ) {
			munja[i][0] = 'A' + i;
		}
		
		// 랜덤하게 문자를 100번 발생시켜서 카운트를 올려준다.
		
		/*
			
			char ch = 'A';
			'A' ==> munja[ch - 'A'][1] += 1;
		 */
		for(int i = 0 ; i < 100 ; i++ ) {
			char ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			
			int idx = ch - 'A';
			/*
			int oldCount = munja[idx][1];
			int newCount = oldCount + 1;
			
			munja[idx][1] = newCount;
			*/
			munja[idx][1] += 1;
		}
		
		// print
		for(int i = 0 ; i < munja.length ; i++ ) {
			
			int[] arr = munja[i];
			
			char ch = (char) arr[0] ; // 문자의 아스키 코드값을 꺼내서 문자로 강제 형변환
			int count = arr[1]; // 카운트 수
			
			// 타이틀 출력
			System.out.print(ch + " : ");
			
			for(int j = 0 ; j < count ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
