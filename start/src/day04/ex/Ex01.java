package day04.ex;

/*
	문제 1 ]
		1  ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
		그수들중 가장 큰 수만 출력하는 프로그램을 작성하세요.
		
		단, 3항 연산자를 사용해서 처리하세요.
 */
public class Ex01 {
	
	public static void main(String[] args) {
		// 랜덤한 정수 3개 발생시킨다.
		int no1 = (int)(Math.random() * (25 - 1 + 1) + 1); // Math.random() * 25 + 1
		//보너스문제 : -100 ~ 100 사이의 정수를 랜덤하게 발생시켜보세요.
		int no2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 판별해서 변수에 담는다.
		int max = (no1 > no2) ? ( // no1 > no2 라는 전제하에서 실행
					(no1 > no3) ? no1 : no3
				) : ( // no2 > no1 라는 전제하에서 실행
					(no2 > no3) ? no2 : no3
				);
					
		// 출력한다.
		System.out.println("입력한 세 정수 \n\t" + no1 + ", " + no2 + ", " + no3 + "\n 중 제일 큰수는 " + max + "입니다.");
		
		/*
			참고 ]
				문자열을 표현할 때 문자열 안에 " 기호를 출력하는 방법
				==> 
					\"
				이때 사용한 \ 를 이스케이프문자 라고 부른다.
				
				많이 사용하는 문자들
					
					\"	- 문자열내에 " 를 표현한다.
					\n	- 한줄 내림기호
					\r	- 캐리지리턴
					\t	- tab 을 표현
					\b	- backspace
		 */
	}
}
