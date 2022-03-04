package day08;

public class Test10 {

	public static void main(String[] args) {
		int[] no = new int[10];
		
		no = new int[]{1, 2, 3};
		
		int[][] num = new int[5][];
		
		int[] no1 = new int[3];
		int[] no2 = new int[5];
		int[] no3 = new int[10];
		int[] no4 = new int[7];
		int[] no5 = new int[50];
		
		num[0] = no1;
		num[1] = no2;
		num[2] = no3;
		num[3] = no4;
		num[4] = no5;
		
		
		int[][] num1 = {{1,2}, {3, 4, 5}, {6, 7, 8, 9}};
		
		for(int i = 0 ; i < num1.length ; i++ ) {
			for(int n : num1[i]) {
				System.out.print(n + ", ");
			}
			System.out.println();
		}
	}

}
