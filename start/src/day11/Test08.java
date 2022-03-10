package day11;

import static java.lang.Math.*;
public class Test08 {
	public Test08() {
		Object[][] obj = new Object[3][5];
		
		
		Semo01[] semo = new Semo01[5];
		for(int i = 0 ; i < semo.length ; i++ ) {
			semo[i] = new Semo01((int)(random()* 21 + 5), (int)(random()* 21 + 5));
		}
		
		Nemo01[] nemo = new Nemo01[5];
		for(int i = 0 ; i < nemo.length ; i++ ) {
			nemo[i] = new Nemo01((int)(random()* 21 + 5), (int)(random()* 21 + 5));
		}
		
		Circle01[] won = new Circle01[5];
		for(int i = 0 ; i < won.length ; i++ ) {
			won[i] = new Circle01((int)(random()* 21 + 5));
		}
		
		obj[0] = semo;
		obj[1] = nemo;
		obj[2] = won;
		
		
		Object o = new Semo01();
		Object o2 = new Nemo01();
		Object o3 = new Circle01();
	}
	public static void main(String[] args) {
		new Test08();
	}

}
