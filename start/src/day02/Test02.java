package day02;

public class Test02 {
	public static void main(String[] args) {
		// 문자열 변수를 만드는 방법
		
		// 1. 데이터를 직접 입력해서 만드는 방법
		String name1 = "홍길동";
		// 2. 클래스를 new 시켜서 만드는 방법
		String name2 = new String("홍길동");
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("name1 == name2 : " + (name1 == name2 ));
	}
}
