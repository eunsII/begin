package day09;


/*
	두 수를 이용해서 더하는 프로그램을 작성하세요.
	
	단, 입력, 계산, 출력을 함수로 만들어서 처리하세요.
		랜덤하게 숫자를 발생시키는 것도 함수로 처리
 */
public class Test02 {
	public Test02() {
		// 기본생성자
		// 생성자함수는 반환값 타입을 기술하면 안된다.
//		abc();
		
		// 함수는 자신이 저절도 실행되는 경우는 없다.
		// 랜덤한 두 정수 만들고
		int no1 = makeInt();
		int no2 = makeInt();
		
		// 두 수 계산하고
		int result = calc(no1, no2);
		
		// 출력하고
		System.out.print("1. 정수 두개 입력 : ");
		toPrint(no1, no2);
		System.out.print("2. 정수 세개 입력 : ");
		toPrint(no1, no2, result);
	}
	
	public static void main(String[] args) {
		new Test02();
	}
	
	public void abc() {
		System.out.println("abc 함수 호출...");
	}
	
	// 1 ~ 100 사이의 랜덤한 정수를 발생시켜서 반환해주는 함수
	public int makeInt() {
		// 속성은 필요할 경우에만 기술한다.
		
		// 반환값 변수
		int no = 0;
		
		// 랜덤하게 정수만들어서 변수에 채우고
		no = (int)(Math.random() * 100 + 1);
		
		// 반환값 내보내고...
		return no;
	}
	
	// 두수를 입력받아서 계산해주는 함수
	public int calc(int no1, int no2) {
		// 매개변수는 여러개가 입력되면 , 단위로 나열한다.
		
		// 반환값 변수
		int result = 0;
		
		// 이 함수를 실행할 때 입력된 두 정수는
		// no1, no2 변수에 기억될 것이다.
		// 이 변수에 기억된 데이터를 계산하면 된다.
		result = no1 + no2;
		
		// 반환값 내보내고...
		return result; 
		// ==> 	1. 실행중이 이 함수를 즉시 종료하세요. 
		// 		2. 결과값이 있으면 결과값을 내보내고 함수를 종료하세요.
	}
	
	// 두수를 입력해주면 두수의 계산결과를 출력해주는 함수
	public void toPrint(int no1, int no2) {
		// 결과값 변수
		
		int num1 = no1;
		int num2 = no2;
		
		int result = calc(num1, num2);
		
		// 출력
		System.out.println("두 정수 " + num1 + " 과 " + num2 + " 의 합은 " + result + " 입니다.");
//		return; 
		// 이 명령을 기술하지 않아도 실행내용을 모두 실행했으므로 이 함수가 자동 종료가 될 것이다. 
		// 따라서 생략해도 똑같은 효과가 된다.
	}
	
	
	// 두수와 결과를 입력해주면 계산결과를 출력해주는 함수
	public String toPrint(int no1, int no2, int no3) {
		// 참고 ] 
		// 		매개변수리스트에 정의된 변수는 이 함수 블럭에서만 사용할 수 있는 지역변수이다.
		
		// 함수의 오버로딩(함수의 중첩)
		/*
			함수의 오버로딩
				같은 이름으로 함수를 한 클래스내에 추가하는 방법
				
				원칙 ]
					0. 함수에 오버로딩 하려는 함수가 있어야 한다.
					1. 함수이름이 같아야 한다.
					2. 매개변수리스트가 달라야 한다.
						(매개변수리스트의 타입, 순서, 갯수 중 하나이상이 달라야한다.)
					3. 반환값타입과는 무관하다.
					
					
						참고 ]
							void abc(int a, int b){}
							void abc(int b, int a){} ==> X : 매개변수리스트의 형태는 데이터의 타입으로 판별한다.
		 */
		
		// 출력
		System.out.println("두 정수 " + no1 + " 과 " + no2 + " 의 합은 "+ no3 + " 입니다.");
		
		return null;
	}
}
