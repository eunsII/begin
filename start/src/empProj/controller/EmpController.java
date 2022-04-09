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
		System.out.println("*** 모든사원 정보조회");
		for(EmpVO e : list) {
			System.out.printf("%5d | %10s | %10s | %24s\n", e.getEno(), e.getEname(), e.getJob(), e.getSdate());
		}
		System.out.println();
		
		// 20부서를 입력해서 부서원들의 정보를 조회
		System.out.println("*** 20번 부서원 정보조회");
		ArrayList<EmpVO> dlist = eDao.getDnoInfo(20);
		for(EmpVO evo : dlist) {
			System.out.printf("| %5d | %10s | %10s | %24s | %6d | %2d | %10s | %8s |\n", 
								evo.getEno(), evo.getEname(), evo.getJob(), evo.getSdate(), 
								evo.getSal(), evo.getDno(), evo.getDname(), evo.getLoc());
		}
		System.out.println();
		
		// SALESMAN 직급을 가진 사원들의 정보 조회
		System.out.println("*** SALESMAN 직급 정보조회");
		ArrayList<EmpVO> jlist = eDao.getJobInfo("SALESMAN");
		for(EmpVO evo : jlist) {
			System.out.printf("| %5d | %10s | %10s | %24s | %6d | %2d | %7s |\n", 
					evo.getEno(), evo.getEname(), evo.getJob(), 
					evo.getSdate(), evo.getSal(), evo.getGrade(), evo.getScomm());
		}
		
	}

	public static void main(String[] args) {
		new EmpController();
	}

}
