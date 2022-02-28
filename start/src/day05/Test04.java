package day05;
/*
	나이를 입력받아서
		유년기
		10대	: 10 ~ 19
		20대
		30대
		40대 	: 40 ~ 49
		장년층
	으로 구분해서 출력하세요.
 */

import java.util.*;

public class Test04 {

	public static void main(String[] args) {
		// 조건이 여러가지인 경우는 if ~ else if  구문으로 처리하는 것이 편하다.
		
		// 할일]
		// 1. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력하고
		System.out.print("나이 입력 : ");
		// 3. 입력받아 변수에 기억시키고
		int age = sc.nextInt();
		// 4. 판별해서 결과 기억하고
		// 결과 변수 만들고
		String sage = "장년층";
		
		if(age < 10) {
			sage ="유년기";
		} else if(age < 20) { // age >= 10 & age < 20 라는 의미
			sage ="10대";
		} else if(age < 30) {
			sage ="20대";
		} else if(age < 40) {
			sage ="30대";
		} else if(age < 50) {
			sage ="40대";
		} else {
			sage = "장년층";
		}
		
		// 5. 결과 출력하고
		System.out.println("입력나이 " + age + " 는 " + sage + " 입니다." );
	}

}
