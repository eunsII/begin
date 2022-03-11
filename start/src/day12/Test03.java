package day12;

public class Test03 {
	public Test03() {
		// getData()를 다섯번 호출해서
		// 반환값의 숫자에 회수 * 10 을 더해서
		// 그 결과를 출력하세요.
		
		// getData() 의 결과에 따라서 반환값을 강제형변환 시켜줘야 한다.
		for(int i = 0 ; i < 5 ; i++ ) {
			
			Object o = getData();
			
			int result = 0;
			
			if(o instanceof Integer) {
				result = ((Integer)o) + (i * 10); // wrapper 클래스에서 기본형 타입으로 형변환 : unboxxing
													// 반대는 Boxxing
			} else if(o instanceof String) {
				String str = (String) o;
				result = Integer.parseInt(str) + (i * 10);
			}
			
			// 출력
			System.out.println((i + 1) + " 번째 결과 : " + result);
		}
	}
	public static void main(String[] args) {
		new Test03();
	}
	
	public Object getData() {
		//  0 - 1 랜덤하게 숫자를 발생시켜서
		// 		0 ---> 정수 100
		//		1 ---> 문자열 "100"
		// 반환해주는 함수
		int no = (int)(Math.random()*2);
		
		Object obj = null;
		
		if(no == 0) {
			obj =  100; // int --> Integer --> Object
		} else if(no == 1) {
			obj =  "100";	// String --> Object
		}
		
		return obj;
	}
}


