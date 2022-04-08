package formatTest;

/*
	학생의 점수를 입력받아서
	학점을 출력하는 프로그램을 작성하세요.
		
		100			- A
		90 ~ 99		- A
		80 ~ 89		- B
		70 ~ 79		- C
		60 ~ 69		- D
		0 ~ 59		- F
		
		int score = jumsoo / 10;
		
		switch(score){
		case 10:
			A
			break;
		case 9:
			A
			break;
		case 8:
			B
			break;
		case 7:
			C
			break;
		case 6:
			D
			break;
		default:
		}
			
 */

import java.text.*;
public class Test02 {

	public Test02() {
		double[] limits = {0, 60, 70, 80, 90};
		/*
			limits 를 만들때 주의 사항
				반드시 오름차순으로 정렬해서 만들어야 한다.
				의미는
					0 ~ 59 사이는 하나의 문자로 바꾸고
					60 ~ 69 사이는 하나의 문자로 바꾸고
					...
					90 ~ 	하나의 문자로 바꿔라...
		 */
		
		String[] formats = {"F", "D", "C", "B", "A"};
		// formats 을 만든때 주의사항
		// 		limits의 개수와 동일하게 만들어야 한다.
		
		ChoiceFormat form = new ChoiceFormat(limits, formats);
		
		// 랜덤하게 점수를 발생시켜서 그 점수의 학점을 출력해보자.
		int score = (int)(Math.random()*101);
		
		// 학점 추출
		String grade = form.format(score);
		
		// 출력
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
