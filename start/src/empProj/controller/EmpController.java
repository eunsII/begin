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
		allPrint(list);
		System.out.println();
		
		// 20부서를 입력해서 부서원들의 정보를 조회
		ArrayList<EmpVO> dlist = eDao.getDnoInfo(20);
		dnoInfoPrint(dlist);
		System.out.println();
		
		// SALESMAN 직급을 가진 사원들의 정보 조회
		ArrayList<EmpVO> jlist = eDao.getJobInfo("SALESMAN");
		jobInfoPrint(jlist);
		
	}
	
	// 모든 사원 리스트 출력해주는 함수
	public void allPrint(ArrayList<EmpVO> list) {
		System.out.println("*** 모든사원 정보조회");
		System.out.println("==================================================================");
		System.out.println("| 사원번호 |  사원이름  |   직  급   |        입   사   일       |");
		System.out.println("------------------------------------------------------------------");
		for(EmpVO e : list) {
			System.out.printf("|%7d   | %10s | %10s | %22s |\n", e.getEno(), e.getEname(), e.getJob(), e.getSdate());
		}
		System.out.println("==================================================================");
	}
	
	// 부서원 정보 출력해주는 함수
	public void dnoInfoPrint(ArrayList<EmpVO> list) {
		System.out.println("*** 20번 부서원 정보조회");
		System.out.println("==============================================================================================================");
		System.out.println("| 사원번호 |  사원이름  |   직  급   |        입   사   일       | 급  여 | 부서번호 |  부서이름  | 부서위치 |");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		for(EmpVO evo : list) {
			System.out.printf("|%7d   | %10s | %10s | %22s | %6d |    %2d    | %10s | %8s |\n", 
					evo.getEno(), evo.getEname(), evo.getJob(), evo.getSdate(), 
					evo.getSal(), evo.getDno(), evo.getDname(), evo.getLoc());
		}
		System.out.println("==============================================================================================================");
	}
	
	// 직급 정보 출력해주는 함수
	public void jobInfoPrint(ArrayList<EmpVO> list) {
		System.out.println("*** SALESMAN 직급 정보조회");
		System.out.println("================================================================================================");
		System.out.println("| 사원번호 |  사원이름  |   직  급   |        입   사   일       | 급  여 | 급여등급 |  커미션 |");
		System.out.println("------------------------------------------------------------------------------------------------");
		for(EmpVO evo : list) {
			System.out.printf("|%7d   | %10s | %10s | %22s | %6d |    %2d    | %7s |\n", 
					evo.getEno(), evo.getEname(), evo.getJob(), 
					evo.getSdate(), evo.getSal(), evo.getGrade(), evo.getScomm());
		}
		System.out.println("================================================================================================");
	}
	
	public static void main(String[] args) {
		new EmpController();
	}

}
