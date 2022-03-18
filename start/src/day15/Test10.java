package day15;

import java.util.*;
public class Test10 {

	public Test10() {
		// ArrayList 타입의 list 에 1 ~ 25 사이의 정수 10를 랜덤하게 만들어서 채워주세요.
		// 리스트 만들고
		ArrayList list = new ArrayList();
		
		for(int i = 0 ; i < 10 ; i++ ) {
			list.add((int)(Math.random()*25 + 1));
		}
		// 출력
		System.out.println("1. 정렬 전 : ");
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.print((int)(list.get(i)) + " | ");
		}
		System.out.println();
		
		// 내림차순 정렬
		Collections.sort(list, new DownSort());
		System.out.println("2. 내림차순 정렬 후 : ");
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.print((int)(list.get(i)) + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test10();
	}

}

class DownSort implements Comparator {
/*
	정렬 방식을 변경하기 위해서는 Comparator를 상속 받은 클래스를 만들어야 한다.
	
	이 클래스는 Object 클래스를 상속받아서 만들어졌기 때문에
	이 클래스 내부에 equals()가 이미 존재하고 있다.
	
	정렬을 할 경우에는 Comparator에게 물려받은 compare() 함수를 오버라이드해서
	정렬방식을 직접 정해서 적용시킬 수 있게된다.
	
	이때 이 함수의 반환값은 정수를 반환하도록 되어있는데
	값의 크기는 중요하지 않고
	부호가 중요하다.
	
	이때 부호가 음수 이면 두 개의 위치를 바꾸지 않고
	양수이면 두개의 위치 바꾸게 된다.
 */
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		// 입력된 데이터를 원래 형태로 강제형변환한다.
		int no1 = (int) o1;
		int no2 = (int) o2;
		
		result = no1 - no2;
		
		return -result;
	}
}
