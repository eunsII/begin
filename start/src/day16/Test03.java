package day16;

import java.util.*;

public class Test03 {
/*
	전화번호부를 만들어보자.
 */
	public Test03() {
		HashMap map = new HashMap();
		
		// 데이터추가
		map.put("제니", "010-1111-1111");
		map.put("리사", "010-2222-2222");
		map.put("로제", "010-3333-3333");
		map.put("지수", "010-4444-4444");
		
		// 출력
		System.out.println("로제 : " + map.get("로제"));
		System.out.println();
		// 키값만 모두 추출
		Set keys = map.keySet();
		for(Object key : keys) {
			Object value = map.get(key);
			System.out.println(key + " - " + value);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
