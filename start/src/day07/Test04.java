package day07;

import java.util.Arrays;

/*
	5과목의 점수를 기억할 배열을 만들고
	과목 점수를 입력해서
	총점과 평균을 구하고 출력하세요.
	배열에 담긴 점수도 같이 출력하세요. 
 */
public class Test04 {

	public static void main(String[] args) {
		// 과목점수 배열
		int[] subj = new int[5];
		
		// 과목점수를 랜덤하게 만들어서 입력한다.
		for(int i = 0 ; i < subj.length ; i++ ) {
			// 랜덤하게 만든 점수를 각과목방에 입력한다.
			/*
				int score = (int)(Math.random() * (100 - 60 + 1) + 60);
				subj[i] = score;
			 */
			
			subj[i] = (int)(Math.random() * (100 - 60 + 1) + 60); // 60 ~ 100 사이의 정수
		}
		
		// 총점을 계산한다.
		int total = 0;
		for(int i = 0 ; i < subj.length ; i++ ) {
			int score = subj[i];
			
			// 총점에 과목점수를 누적시킨다.
//			total = total + score;
			total += score;
		}
		
		// 평균 계산
		double avg = total / (double)(subj.length);
		
		// 출력
		System.out.println("각 과목 점수 : " + Arrays.toString(subj));
		System.out.println("과목 총 점수 : " + total);
		System.out.println("과목평균 점수 : " + avg);
	}

}
