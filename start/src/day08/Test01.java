package day08;

/*
	0 - 9 사이의 숫자를 100 개 발생시켜서
	각각의 숫자가 몇번씩 발생했는지를 알아보자.
	
	방법 ]
		각숫자의 횟수를 기억할 배열을 만들고
		각 숫자가 발생할 때마다 1씩 누적시켜준다.
 */
public class Test01 {

	public static void main(String[] args) {
		// 할일
		// 1. 배열만들고
		int[] numCount = new int[10]; // 각 방에는 초기값으로 0으로 셋팅이 되어있다.
		/*
			이 배열에 위치값이 
				0인 위치에는 0이 발생하면 1을 누적시킨다.
				1인 위치에는 1이 발생하면 1을 누적시킨다.
				...
		 */
		// 반복작업
		for(int i = 0 ; i < 100 ; i++ ) {
			// 2. 랜덤하게 숫자를 발생시키고
			int no = (int) (Math.random()*10);
			// 이렇게 위에서 발생된 숫자는 위에 만든 numCount배열의 위치값으로 사용하고
			// 그 위치값의 숫자를 1을 증가시켜주면 된다.
			
			// 3. 발생된 숫자의 카운트를 +1 해주고
			numCount[no] += 1;
		}
		
		// 4. 결과를 출력한다.
		
		// 숫자로 출력
		for(int i = 0 ; i < numCount.length ; i++ ) {
			int no = i; // 숫자
			int count = numCount[i]; // 발생한 횟수
			
			// 출력
			System.out.println(no + " : " + count);
		}
		
		// 발생한 횟수를 특수문자를 이용해서 그래프 형태로 출력
		for(int i = 0 ; i < numCount.length ; i++ ) {
			int count = numCount[i];
			
			// 숫자 출력
			System.out.print(i + " : ");
			
			// count 횟수만큼 특수문자를 출력해야 하므로 반복문으로 처리한다.
			for(int j = 0 ; j < count ; j++ ) {
				// ♣ 출력 
				System.out.print("♣");
			}
			System.out.println();
		}
		
		/*
			'A' + 0	==> 'A'
			'A' + 1 ==> 'B'
			...
			'A' + 9 ==> 'J'
		 */
	}

}
