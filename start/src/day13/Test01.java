package day13;

import day12.sub.*;

/*
	day12.sub 패키지의 Figure 인터페이스를 구현한 사각형을 무명 내부클래스를 만들어서 사용해보자.
 */
public class Test01 {
	int width = (int)(Math.random()*21 + 5);
	int height = (int)(Math.random()*21 + 5);
	double area;
	
	Figure fig, fig1;
	
	public Test01() {
		
//		int width = (int)(Math.random()*21 + 5);
//		int height = (int)(Math.random()*21 + 5);
		// 사각형
		fig = new Figure() {
			@Override
			public void setArea() {
				area = width * height;
			}

			@Override
			public void toPrint() {
				setArea();
				System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 면적이 %6.2f 입니다.", 
										width, height, area);
				System.out.println();
			}
		};
		
		// 삼각형
		fig1 = new Figure() {
//			int width = (int)(Math.random()*21 + 5);
//			int height = (int)(Math.random()*21 + 5);
//			double area;
			@Override
			public void setArea() {
				area = width * height * 0.5;
			}
			
			@Override
			public void toPrint() {
				setArea();
				System.out.printf("이 삼각형은 밑변가 %3d 이고 높이가 %3d 이고 면적이 %6.2f 입니다.", 
						width, height, area);
				System.out.println();
			}
			
		};
	}
	
	public static void main(String[] args) {
		Test01 t1 = new Test01();
		
		// 사각형 면적 구하고
		//t1.fig.setArea();
		// 사각형 내용 출력
		t1.fig.toPrint();
		// 삼가형 내용 출력
		t1.fig1.toPrint();
		
		System.out.println("사각형 가로 : " + t1.width);
	}

}
