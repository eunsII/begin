package day09;

public class Test01 {
	int no = 10;
	
	// abc라는 이름의 함수
	static void abc(int no) {
		
	}
	
	public static void main(String[] args) {
		abc(10);
	}
	
	
	void xyz() { // 뭔가 기능이 필요한 경우 함수를 제작한다.
		int no = 10;
		abc(no);
		
		// 1,  "숫자 : " ==> "숫자 : 1" 
//		add("abc : ", 10); // 순서가 달라서 안된다.
		add(10, "abc : ");
	}
	
	public String add(int no , String str) {
		String result = str + no;
		return result;
	}
}
