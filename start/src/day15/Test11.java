package day15;

/*
	5 ~ 25 사이의 랜덤한 정수를 반지름으로 하는 원을 기억할 클래스를 만들고
	원 10개를 리스트에 채워서
	넓이가 넓은 원부터 내림차순으로 정렬해서
	내용을 출력하세요.
 */

import java.util.*;

public class Test11 {

	public Test11() {
		ArrayList list = new ArrayList();
		
		// 데이터 추가
		for(int i = 0 ; i < 10 ; i++ ) {
			Won w = new Won((int)(Math.random()*21 + 5));
			// 리스트에 만들어진 원을 각 방에 채워준다.
			list.add(w); // 이 순간 Won 데이터는 Object 타입으로 자동 형변환이 되서 기억된다.
		}
		
		System.out.println("1. 내림차순 정렬 전 ");
		// 출력
		for(Object o : list) {
			// 이때 꺼낸 데이터 o는 원래는 Won 객체를 입력한 것이다.
			// 따라서 원래 데이터로 강제 형변환한다.
			Won w = (Won) o;
			System.out.println(w);
		}
		System.out.println();
		// 정렬하기
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				
				// 원래 데이터로 강제 형변환해주고 <== 리스트에는 Won 타입의 데이터가 채워져 있으므로...
				Won w1 = (Won) o1;
				Won w2 = (Won) o2;
				
				double area1 = w1.getArea();
				double area2 = w2.getArea();
				
				// 반환값은 크기는 중요하지 않고 부호가 중요하므로
				result = ((area1 - area2) <= 0) ? -1 : 1;
				
				return -result;
			}
		});
		
		// 출력
		System.out.println("2. 내림차순 정렬 후 ");
		for(Object o : list) {
			// 이때 꺼낸 데이터 o는 원래는 Won 객체를 입력한 것이다.
			// 따라서 원래 데이터로 강제 형변환한다.
			Won w = (Won) o;
			System.out.println(w);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test11();
	}
}
