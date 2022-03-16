package day13;

public class Test12 {

	public Test12() {
		String sno = "12삼";
		
		int no = 0;
//		no = Integer.parseInt(sno);
		
		/*
			sno 를 정수로 변환하는데 예외가 발생하면
			-999로 변환하세요.
		 */
		try {
			no = Integer.parseInt(sno);
		} catch(Exception e) {
//			e.printStackTrace();
			no = -999;
		}
		
		System.out.println("no : " + no);
	}

	public static void main(String[] args) {
		new Test12();
	}

}
