package day15;

import java.util.*;

public class Test05 {

	public Test05() {
		
		Vector vec = new Vector(10, 5);
		int cap = vec.capacity();	// 현재 확보한 공간 수를 알려주는 함수
		System.out.println("처음 공간 : " + cap);
		for(int i = 0 ; i < 16 ; i++ ) {
			// 데이터를 채운다.
			vec.add(i + 1);
		}
		
		cap = vec.capacity();
		System.out.println("확보한 공간 : " + cap);
		
		System.out.println("------------------------------------------------");
		
		Vector v2 = new Vector();
		int cap1 = v2.capacity();
		System.out.println("1. v2.capacity : " + cap1);
		
		for(int i = 0 ; i < 21 ; i++ ) {
			v2.add(i+ 1);
		}
		cap1 = v2.capacity();
		System.out.println("2. v2.capacity : " + cap1);
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
