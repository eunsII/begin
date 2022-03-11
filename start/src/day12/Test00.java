package day12;

import java.util.Arrays;

public class Test00 {
	
	public Test00() {
		int no = 10;
		int[] arr = {1, 2, 3, 4, 5};
		
		arr = new int[] {1, 2, 3, 4, 5};
		
		no = addNo(no); // addNo(10);
		setArr(arr);
		
		System.out.println("no : " + no);
		System.out.println("arr : " + Arrays.toString(arr));
	}
	
	// no에 10 더해서 결과를 no에 기억시키는 기능...
	public int addNo(int no) {
		int sum = no + 10;
		return sum;
	}
	
	// arr 배열의 첫번째 방의 데이터에 10을 더해주는 기능
	public void setArr(int[] arr) {
		arr[0] = arr[0] + 10;
	}
	
	
	public static void main(String[] args) {
		new Test00();
	}

}
