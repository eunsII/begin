package day10;

/*
	블랙핑크 친구들의 정보를 기억시키고 출력하세요.
 */
public class Test02 {
	public Test02() {
		// 제니 객체
		Friend f1 = new Friend();
//		f1.name = "제니"; // 이 변수는 접근지정자가 private 이므로 다른 클래스에서는 접근할 수 없다.
		// 제니 정보 셋팅
		f1.setName("제니");
		f1.setAddr("ygM");
		f1.setBirth("1996/03/08");
		f1.setMail("jennie@githrd.com");
		f1.setTel("010-1111-1111");
		f1.setAge(27);
		f1.setGen('F');
		
		// 출력
		/*
		System.out.println("제니의 이름 : " + f1.getName());
		System.out.println("제니의 주소 : " + f1.getAddr());
		System.out.println("제니의 생일 : " + f1.getBirth());
		System.out.println("제니의 메일 : " + f1.getMail());
		System.out.println("제니의 전화 : " + f1.getTel());
		System.out.println("제니의 나이 : " + f1.getAge());
		System.out.println("제니의 성별 : " + f1.getGen());
		*/
		System.out.println(f1.toString());
		System.out.println(f1);
		
		// 로제 객체
		Friend f2 = new Friend();
		
		// 리사 객체
		Friend f3 = new Friend();
		
		
		// 지수 객체
		Friend f4 = new Friend();
		
	}
	public static void main(String[] args) {
		new Test02();
	}

}
