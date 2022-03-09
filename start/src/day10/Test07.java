package day10;

public class Test07 {
	
	Semo01[] sam;
	public Test07() {
		// 삼각형 배열 셋팅해주는 함수 호출
		setSam();
		
		// 출력
		for(int i = 0 ; i < 5 ; i++ ) {
			System.out.printf("이 삼각형은 밑변이 %3d 이고 높이가 %3d 이고 넓이가 %6.2f 입니다.", 
								sam[i].getWidth(), sam[i].getHeight(), sam[i].getArea());
			System.out.println();
		}
	}
	
	// 삼각형 배열 셋팅해주는 함수
	public void setSam() {
		sam = new Semo01[5];
		
		for(int i = 0 ; i < 5 ; i++ ) {
			int width = (int)(Math.random()*21 + 5);
			int height = (int)(Math.random()*21 + 5);
			sam[i] = new Semo01(width, height);
		}
	}
	
	
	public static void main(String[] args) {
		new Test07();
	}

}
