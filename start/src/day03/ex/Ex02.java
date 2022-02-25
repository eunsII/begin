package day03.ex;


/*
	문제 2 ]
		하나의 숫자를 입력받은 후(원의 반지름)
		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
		
		참고 ]
			원의 넓이 : 반지름 * 반지름 * 3.14
			원의 둘레 : 2 * 반지름 * 3.14
 */
import java.util.*; 
// 이렇게 사용할 클래스의 경로를 지정하면 
// java.util 패키지 하위에 바로속한 클래스만 사용할 준비를 하게된다.
// 이 예제의 경우는 Scanner 를 사용할 예정인데 직접 * 대신 Scanner 로 명시해도 된다.

// 적용순서는 * 보다는 클래스 이름을 명시하는 방법을 우선 적용시킨다.

/*
		A - abcd.txt
			efg.txt
		
		B	- abcd.txt
			  xyz.txt
 */


public class Ex02 {
	public static void main(String[] args) {
		// 할일
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력받기전에 메세지 출력
		System.out.print("반지름 : ");
		// 입력받는다. 변수에 기억
		int rad = sc.nextInt();
		// 계산하고
		double pi = 3.14;
		// 원의 넓이 계산 :  숫자데이터의 연산은 항상 큰 데이터 타입으로 결과가 나온다.
		double area = rad * rad * pi;
		
		// 원의 둘레 계산
		double arround = 2 * rad * pi;
		
		// 출력하고
		System.out.println("반지름 : " + rad);
		System.out.println("넓  이 : " + area);
		System.out.println("둘  레 : " + arround);
		
		
		/*
			참고 ]
				형변환에서 큰 타입의 데이터를 작은타입으로 변환하면
				남는 부분은 버린다.
		 */
		
		int intArea = (int) area;
		int intDulae = (int) arround;
		System.out.println(intArea);
		System.out.println(intDulae);
	}
}
