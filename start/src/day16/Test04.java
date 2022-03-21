package day16;

import java.util.*;

public class Test04 {
/*
	4명의 학생들의 점수를 맵에 담아서 관리하자.
 */
	public Test04() {
		ArrayList names = new ArrayList();
		names.add("제니");
		names.add("로제");
		names.add("리사");
		names.add("지수");
		
		HashMap map = new HashMap();
		
		for(int i = 0 ; i < 4 ; i++ ) {
			Object key = names.get(i);
			Student std = new Student((String) key, 
					(int)(Math.random()*41 + 60),
					(int)(Math.random()*41 + 60),
					(int)(Math.random()*41 + 60),
					(int)(Math.random()*41 + 60)
					);
			map.put(key, std);
		}
		
		// 출력
		// 키값을 모두 뽑아낸다.
		Set keys = map.keySet();
		ArrayList list = new ArrayList(keys);
		
		for(Object key : list) {
			Object value = map.get(key);
			// 출력
			System.out.println("*** " + key + " ***\n" + value);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
