package day09;

/*
	5개의 숫자를 배열로 입력받아 더하는 프로그램을 작성하세요.
	
	단, 입력, 계산, 출력은 함수로 처리하세요.
 */
public class Test03 {
	
	public Test03() {
		// 다섯개의 정수를 관리하는 배열
		int[] no = getArr(); // # 1 출력
		
		// 결과 출력
		toPrint(no); // # 3 --> 배열 내용 출력 --> "배열의 총합 : " 출력 --> # 2 --> 합계 출력
	}

	public static void main(String[] args) {
		System.out.println("## 0");
		new Test03();
		System.out.println("## 999");
	}
	
	// 함수가 실행되면 5개의 정수를 관리하는 배열을 완성해서 반환시켜주는 함수
	public int[] getArr() {
		// 반환값 변수
		int[] arr = new int[5];
		
		// 1 ~ 99 사이의 랜덤한 숫자를 만들어서 채워준다.
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = (int) (Math.random() * 99 + 1);
		}
		System.out.println("# 1");
		// 반환값 반환
		return arr;
	}
	
	// 정수 배열을 입력받아서 모든 정수의 합을 구해서 반환해주는 함수
	public int addAll(int[] arr) {
		// 반환값 변수
		int sum = 0 ;
		
		// 배열에 기억된 숫자를 하나씩 꺼내서 더해주고
		for(int i = 0 ; i < arr.length ; i++ ) {
			sum = sum + arr[i]; // sum += arr[i];
		}
		System.out.println("# 2");
		// 반환값 반환해주고
		return sum;
	}
	
	// 배열을 입력받아서 결과를 출력해주는 함수
	public void toPrint(int[] num) {
		System.out.println("# 3");
		// 배열 내용 출력하고
		System.out.print("입력된 배열 : ");
		for(int n : num) {
			System.out.print(n + ", ");
		}
		// 줄바꿈
		System.out.println();
		
		// 합계 출력
		System.out.print("배열의 총합 : ");
		
		int total = addAll(num);
		System.out.print(total);
		
//		System.out.print(addAll(num));
	}
}
