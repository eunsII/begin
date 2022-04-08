package empProj.controller;

import java.util.*;

import empProj.dao.*;
import empProj.vo.*;

public class EmpController {
	private EmpDao eDao;
	
	public EmpController() {
		eDao = new EmpDao();
		
		// 모든 사원의 정보를 조회
		ArrayList<EmpVO> list = eDao.getAll();
		for(EmpVO e : list) {
			System.out.println(e);
		}
		
		// 20부서를 입력해서 부서원들의 정보를 조회
		
		
		// SALESMAN 직급을 가진 사원들의 정보 조회
		
	}

	public static void main(String[] args) {
		new EmpController();
	}

}
