package day04;

public class Test03 {
	public static void main(String[] args) {
		int no = 20;
		
		int result = 20 >> 2; // 2의 2승으로 나누는 결과
		
		System.out.println("result : " + result);
		
		result = result << 3; // 2의 3승을 곱한 값
		System.out.println("result : " + result);
		
		System.out.println(">> 1 : " + (-64 >> 1));
		System.out.println(">>> 1 : " + (-64 >>> 1));
	}
}
