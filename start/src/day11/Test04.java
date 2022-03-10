package day11;

/*
	삼각형 클래스와 사각형 클래스를 각각 객체로 만들어서 
	내용을 출력해보자.
 */

import static java.lang.Math.*;

public class Test04 {
	public Test04() {
		Samgak sam = new Samgak((int)(random()*21 + 5), (int)(random()*21 + 5));
		Sagak nemo = new Sagak((int)(random()*21 + 5), (int)(random()*21 + 5));
		
		System.out.printf("밑변이 %3d 이고 높이가 %3d 이고 넓이가 %6.2f 인 삼각형\n", 
											sam.getWidth(), sam.getHeight(), sam.getArea());
		System.out.printf("가로가 %3d 이고 세로가 %3d 이고 넓이가 %6.2f 인 사각형\n", 
											nemo.getWidth(), nemo.getHeight(), nemo.getArea());
		
		Figure f1 = sam; 
		Figure f2 = nemo;
		// ==>  이경우 삼각형, 사각형에 있는 getWidth(), getHeight() 는 Figure의 멤버로는 존재하지 않으므로
		// 		이렇게 Figure 타입의 변수에 삼각, 사각의 객체를 담는 경우는
		//		두 함수를 호출 할 수 없다.
		System.out.printf("넓이가 %6.2f 인 삼각형\n", f1.getArea() );
		System.out.printf("넓이가 %6.2f 인 사각형\n", f2.getArea() );
		// 결론 ] ==> 상위 클래스 타입의 변수에 하위 클래스의 인스턴스를 담는 경우
		//				상위 클래스에 없는 멤버는 사용할 수 없다.
		
	}
	public static void main(String[] args) {
		new Test04();
	}

}
