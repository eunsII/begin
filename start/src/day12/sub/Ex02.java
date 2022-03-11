package day12.sub;

/*
	랜덤하게 3 ~ 5 정수를 발생시켜서
		3 이 나오면 삼각형
		4 가 나오면 사각형
		5 가 나오면 원
	의 형태로 10의 도형을 만들어서 
	하나의 변수로 관리하고
	각 도형의 내용을 출력하세요.
	
	단, 인터페이스의 구현은 무명 내부 클래스로 한다.
*/

// 무명 내부 클래스로 처리하는 방법
public class Ex02 {
	Figure[] f;
	public Ex02() {
		setFigure();
		
		for(Figure fig: f) {
			fig.toPrint();
		}
	}
	
	public void setFigure() {
		f = new Figure[10];
		
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = (int)(Math.random()*3 + 3);
			switch(no) {
			case 3:
				f[i] = new Figure() {
					int width = (int)(Math.random()*21 + 5);
					int height = (int)(Math.random()*21 + 5);
					double area;
					
					@Override
					public void setArea() {
						area = width * height * 0.5;
					}

					@Override
					public void toPrint() {
						setArea();
						System.out.printf("이 삼각형은 밑변이 %3d 이고 높이가 %3d 이고 면적이 %6.2f 입니다.", width, height, area);
						System.out.println();
					}
				};
				break;
			case 4:
				f[i] = new Figure() {
					int width = (int)(Math.random()*21 + 5);
					int height = (int)(Math.random()*21 + 5);
					int area;
					@Override
					public void setArea() {
						area = width * height;
					}
					
					@Override
					public void toPrint() {
						setArea();
						System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 면적이 %6d 입니다.", width, height, area);
						System.out.println();
					}
				};
				break;
			case 5:
				f[i] = new Figure() {
					int rad = (int)(Math.random()*21 + 5);
					double arround, area;

					@Override
					public void setArea() {
						area = rad * rad * Math.PI;
					}
					
					public void setArround() {
						arround = 2 * rad * Math.PI;
					}
					
					@Override
					public void toPrint() {
						setArea();
						setArround();
						System.out.printf("이 원은 반지름이 %3d 이고 둘레가 %6.2f 이고 면적이 %6.2f 입니다.", rad, arround, area);
						System.out.println();
					}
				};
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		new Ex02();
	}

}
