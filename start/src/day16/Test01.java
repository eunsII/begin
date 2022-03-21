package day16;

/*
	Set계열의 특징
		1. 입력순서 보장하지 않는다. <== 자기나름의 정렬규칙을 가지고 정렬해서 보관한다.
		2. 중복데이터 입력을 허용하지 않는다.
 */

import java.util.*;

public class Test01 {
/*
	Nemo 클래스를 만들고 가로가 같은 네모면 같은 네모로 처리되도록 하세요.
 */
	public Test01() {
		Nemo n1 = new Nemo(5, 3);
		Nemo n2 = new Nemo(5, 5);
		Nemo n3 = new Nemo(5, 6);
		Nemo n4 = new Nemo(5, 7);
		
		// HashSet을 만든다.
		HashSet set = new HashSet();
		// 위에 만든 네모 두개를 넣어본다.
		set.add(n1);
		set.add(n2);
		set.add(n3);
		set.add(n4);
		
		for(Object o : new ArrayList(set)) {
			System.out.println(o); 
			// 출력이 목적이면 최종적으로 오버라이드된 Nemo의 toString()가 호출되므로 강제형변환은 필요하지 않다.
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}
