package day16;

/*
	전화번호를 관리하는 프로그램을 작성할 예정이다.
	추가될 친구들은
		그룹, 이름, 전화번호
	로 입력할 예정이다.
	
	전화번호부 프로그램을 작성하세요.
	==> 
		친구, 	제니, 010-1111-1111
				리사, 010-2222-2222
				로제, 010-3333-3333
		회사
		웬수
		
		동호회
				둘리, 010-9876-5432
		
 */
import java.util.*;

public class Test06 {
	// 전체 그룹을 관리하는 맵
	HashMap groupMap = new HashMap();
	
	// 새로운 그룹을 만드는 함수
	public void makeGroup(String name) {
		// 그룹 이름을 알려주면 그 그룹을 만들어주는 함수
		if(!groupMap.containsKey(name)) {
			// 지금 만들고자 하는 그룹이 존재하지 않으면...
			// ==> 새롭게 그룹을 만들어 줘야 한다.
			groupMap.put(name, new HashMap());
		}
	}
	
	// 친구를 등록하는 함수
	public void setFriend(String group, String name, String tel) {
		// 등록할 친구가 등록될 그룹과 친구이름 전화번호를 알려주면 등록해주는 함수
		
		// 만약 등록하는 그룹이 맵에 존재하지 않으면
		// 새롭게 그룹을 만들어서 추가해줘야 한다.
		makeGroup(group);
		
		// 이 친구를 등록할 그룹의 해당 맵을 알아낸다.
		HashMap tmp = (HashMap)groupMap.get(group);
		// 이 친구를 맵에 등록한다.
		tmp.put(name, tel);
	}
	
	// 한사람만 꺼내는 함수
	public void getPerson(String group, String name) {
		// 특정 그룹의 특정 사람을 꺼내달라고 하면
		
		// 1. 꺼내야 하는 그룹을 알아내고
		HashMap tmp = (HashMap) groupMap.get(group);
		// 2. 그 그룹에서 친구의 정보를 꺼낸다.
		String tel = (String) tmp.get(name);
		
		// 출력
		System.out.println(name + " : " + tel);
	}
	
	// 특정 그룹의 전체를 알아내는 함수
	public void getGroup(String group) {
		// 할일
		// 1. 꺼낼 그룹의 맵을 알아낸다.
		HashMap tmp = (HashMap) groupMap.get(group);
		// 그룹내에 몇명이 누가 들어있는 알 수 없으므로
		// 키값만 꺼내와서 
		Set set = tmp.keySet();
		// 꺼내온 키값으로 데이터를 꺼낸다.
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			String key = (String) itor.next();
			String value = (String)tmp.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
	}
	
	public Test06() {
		setFriend("친구", "제니", "010-1111-1111");
		setFriend("친구", "로제", "010-2222-2222");
		setFriend("친구", "리사", "010-3333-3333");
		setFriend("친구", "지수", "010-4444-4444");
		setFriend("웬수", "정은", "010-9999-9999");
		
		getGroup("친구");
		getGroup("웬수");
		
		getPerson("친구", "제니");
	}

	public static void main(String[] args) {
		new Test06();
	}

}
