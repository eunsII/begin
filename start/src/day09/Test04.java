package day09;

import java.util.Arrays;

/*
	5학생의 3과목 점수를 배열에 입력한 후 
	총점을 구하는 프로그램을 작성하세요.
	
	단, 점수입력, 계산, 출력은 함수로 처리하세요.
 */
public class Test04 {
	
	public Test04() {
		int[][] stud = new int[5][4];
		
		// 점수 만들고
		setArr(stud);
		// 총점 구하고
		for(int i = 0 ; i < stud.length ; i++ ) {
//			setTotal(stud[i]);
			int[] no = stud[i];
			setTotal(no);
		}
		// 내용 출력하고
		toPrint(stud);
		
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		setTotal(num);
		System.out.println(Arrays.toString(num));
	}
	
	public static void main(String[] args) {
		new Test04();
	}
	
	// 배열을 입력해서 실행하면 점수를 채워주는 함수
	public void setArr(int[][] score) {
		for(int i = 0 ; i < score.length ; i++ ) {
			// 학생수만큼 반복
			
			for(int j = 0 ; j < score[i].length - 1 ; j++ ) {
				// 과목 점수 만들고
				score[i][j] = (int)(Math.random() * 41 + 60);
				
			}
		}
		
		// 이 함수의 경우는 입력된 주소의 내용을 변경하는 것이므로
		// 결국 배열을 반환해주지 않아도 된다.
	}
	
	// 한 학생의 점수 배열을 입력하면 총점을 계산해서 셋팅해주는 함수
	public void setTotal(int[] score) {
		int sum = 0 ;
		// 입력된 점수를 누적해서 더해주고 
		for(int i = 0 ; i < score.length - 1; i++ ) {
			sum += score[i];
		}
		// 총점 방에 누적된 점수 입력
//		score[3] = sum;
		score[score.length - 1] = sum;
	}
	
	// 출력하는 함수
	public void toPrint(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++ ) {
			// 한 학생의 점수들 뽑고
			System.out.print((char)('A' + i) + " 학생 : ");
			for(int j = 0 ; j < arr[i].length ; j++ ) {
				// 각 과목 점수 추출해서
				System.out.printf("%4d ", arr[i][j]);
			}
			// 줄바꿈
			System.out.println();
		}
	}
}
