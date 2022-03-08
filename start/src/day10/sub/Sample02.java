package day10.sub;

import day10.Test01;

public class Sample02 extends Test01 {
	public int no4 = 300;
	public Sample02() {
//		System.out.println("no1 : " + no1);	// 같은 클래스 내에서만 사용할 수 있는 변수
//		System.out.println("no2 : " + no2);	// 접근지정자가 생략된 경우이므로 같은패키지가 아니면 사용불가
		System.out.println("no3 : " + no3); 
			// 접근지정자가 protected 이고 이 경우는 같은 패키지 내거나 상속받은 클래스 내에서는 사용가능
		System.out.println("no4 : " + no4);
		
		noPrint();
		
	}
	
	
	@Override
	public void noPrint() {
		super.noPrint();
		System.out.println("#############################");
	}
	
	
	public static void main(String[] args) {
		new Sample02();
		
		/*
			아 그렇구나 하고 넘어가세요...
			나중에 나옵니다.
				
				상속관계에 있는 경우는
				상위 클래스 타입의 변수로 하위 클래스 타입의 인스턴스를 기억시킬 수 있다.
				
				이때
				변수의 경우는 변수쪽의 데이터를 사용하게 되고
				함수의 경우는 인스턴스쪽 함수를 사용하게 된다.
		 */
		Sample02 s1 = new Sample02();
		
		Test01 t1 = s1;
		
		System.out.println("t1.no3 : " + t1.no4);
		t1.noPrint();
	}
}
