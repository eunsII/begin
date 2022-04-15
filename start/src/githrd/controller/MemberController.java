package githrd.controller;

import githrd.dao.*;

public class MemberController {
	private MemberDao mDao;
	
	public MemberController() {
		mDao = new MemberDao();
	}

	// 회원번호와 아이디를 조회해서 출력해주는 함수
	
	
	// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	
	
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
	
	
	// [ 선택 ] Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	
	
	public static void main(String[] args) {
		new MemberController();
	}

}
