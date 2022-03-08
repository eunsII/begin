package day10;

public class Test06 {
	public Test06() {
		System.out.println(getSum(1, 2));
		System.out.println(getSum(1, 2, 3, 4, 5));
		System.out.println(getSum(1, 2, 3,4,5,6,7,8,9));
	}
	public static void main(String[] args) {
		new Test06();
	}
	
	public int getSum(int ... num) { // 가변인자...
		int sum = 0 ; 
		for(int n : num) {
			sum += n;
		}
		return sum;
	}
}
