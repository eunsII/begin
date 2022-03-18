package day15;


import java.util.*;

public class Test15 {
/*
	삼각형의 정보를 기억하는 Semo 클래스를 만들고
	15개의 삼각형을 높이가 큰 삼각형부터 정렬되어서 저장되도록
	TreeSet을 만들고
	내용을 출력하세요.
	
	이 예제에서는 Semlo 클래스를 정렬가능한 클래스로 만들어서 저장하는 2번 방식으로 해결하기로 한다.
 */
	public Test15() {
		TreeSet set = new TreeSet();
		while(true) {
			Semo s = new Semo((int)(Math.random()*31 + 5), (int)(Math.random()*31 + 5));
			
			set.add(s);
			
			// 15개가 채워졌는지 확인한다.
			if(set.size() == 15) {
				break;
			}
		}
		
		// 출력
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Test15();
	}

}
