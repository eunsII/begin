package day15.ex;

/*
	학생 한명의 정보를 저장할 클래스를 제작하세요
	정보는
		학생이름, 반, 번호, 
		자바, 데이터베이스, 웹, 스프링 점수
		총점, 평균
	를 기억하게 하고
	
	10명의 학생을 TreeSet에 입력하고
	반 순서대로 정렬되도록 하세요.
	반이 같으면 번호순으로 정렬되도록 하세요.
	
 */

import java.util.*;

public class Ex03 {
	ArrayList names = new ArrayList();
	public Ex03() {
		setNames();
		
		
	}
	
	public void setNames() {
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		names.add("F");
		names.add("G");
		names.add("H");
		names.add("I");
		names.add("J");
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
