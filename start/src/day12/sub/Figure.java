package day12.sub;

public interface Figure {
//	int area = 10; // 변수를 선언하면 자동적으로 이 변수는 static final 변수가 되므로 초기화도 해줘야 한다.
	void setArea();
	/*
		인터페이스 소속의 함수는
		자동적으로
			public abstract 
		가 붙게되고
		추상함수만 올 수 있다.
	 */
	void toPrint();
}
