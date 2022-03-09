package day10.pink;

/**
 * 블랙핑크의 멤버를 모두 배열로 기억하고 출력
 * @author	전은석
 * @since	2022/03/09
 * @version v.1.0
 * @see		Member.Member() 생성자 참고
 * 			Black.getMemb() 배열 반환해주는 메소드 참고
 *
 */

public class Black {
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] naee;
	char gen ;
	String addrs ;
	
	
	public Black() {
		setData();
		
		Member[] memb = getMemb();
		
		toPrint(memb);
	}
	
	public static void main(String[] args) {
		new Black();
	}

	// Friend 배열 내용 출력해주는 함수
	public void toPrint(Member[] b) {
		for(int i = 0 ; i < b.length ; i++ ) {
			// 이때 배열의 각방에 기억된 객체들의 멤버변수는 접근이 불가능하므로
			// 접근할 수 있는 함수를 호출해서 처리해야 한다.
			String name = b[i].getName();
			String addr = b[i].getAddr();
			String tel = b[i].getTel();
			String mail = b[i].getMail();
			String birth = b[i].getBirth();
			int age = b[i].getAge();
			char gen = b[i].getGen();
			
			System.out.println("이름 : " + name);
			System.out.println("주소 : " + addr);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("생일 : " + birth);
			System.out.println("나이 : " + age);
			System.out.println("성별 : " + ((gen == 'M') ? "남자" : "여자"));
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
	
	// 준비된 데이터를 Friend[] 타입의 데이터로 만들어서 반환해주는 함수
	public Member[] getMemb() {
		// 이 함수는 Friend[] 배열을 만들고
		Member[] anne = new Member[4]; // 아직 각 방에 Friend 타입의 객체는 들어있지 않고 기억할 공간만 확보한 상태
		
		// 각 방에 Friend 객체들을 채워넣는다.
		for(int i = 0 ; i < 4 ; i++ ) {
			// 4명분 데이터가 입력되어야 하므로
			// Friend 객체를 4개를 만들어서 각 방에 집어넣는다.
			// 이때 필요한 정보도 입력해서 셋팅이 되도록 한다.
			anne[i] = new Member(names[i], addrs, tels[i], email[i], birthday[i], naee[i], gen);
			
		}
		
		// 채원채의 배열을 반환해준다.
		return anne;
	}
	
	// 각 데이터를 초기화 시켜주는 함수
	public void setData() {
		names = new String[] {"제니", "리사", "로제", "지수"};
		tels = new String[] {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-1234-5678"};
		email = new String[] {
				"jennie@githrd.com", "lisa@githrd.com", "rose@githrd.com", "jisoo@githrd.com"
		};
		birthday = new String[] {
				"1996/03/08", "1996/04/05", "1998/05/05", "1997/07/07"
		};
		naee = new int[] {27, 28, 26, 27};
		
		gen = 'F';
		addrs = "ygM";
	}
	
}
