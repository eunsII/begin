package empProj.controller;

import java.util.*;

import empProj.dao.*;
import empProj.vo.*;

public class JEmpCont {
	private JEmpDao jDao;
	
	public JEmpCont() {
		jDao = new JEmpDao();
		// jemp 테이블이 없는 경우에는 만들고
		// 이미 있는 경우에는 건뛰도록 하자.
		
		int cnt = jDao.tabCnt();
		if(cnt == 0) {
			addTable();
		} else if(cnt == 1) {
			System.out.println("*** 테이블이 잘 준비되어있습니다.");
		}
		
		// 제니 데이터를 추가해보자. 이름, 직급, 부서번호
		String name = "JENNIE";
		String job = "MANAGER";
		int dno = 40;
		// vo 만들고
		EmpVO eVO = new EmpVO();
		// 데이터 채우고
		eVO.setEname(name);
		eVO.setJob(job);
		eVO.setDno(dno);
		
		// 데이터베이스작업 함수 호출...
		int result = jDao.insertJemp(eVO);
		if(result == 1) {
			System.out.println("*** " + name + " 사원의 데이터 입력에 성공했습니다.");
		} else {
			System.out.println("###### " + name + " 사원의 추가에 실패했습니다.");
		}
		
		// 추가된 사원의 정보를 조회해서 출력하세요.
	}

	// emp 테이블을 복사해서 jemp 테이블을 만드세요.
	public void addTable() {
		// 할일
		// dao 의 함수 호출만 해주면 된다.
		jDao.addJEmp();
	}
	
	public static void main(String[] args) {
		new JEmpCont();
	}

}
