package empProj.view;

import java.util.*;

import empProj.dao.*;
import empProj.vo.*;

public class EmpView {
	private EmpDao eDao;
	public EmpView() {
		eDao = new EmpDao();
	}
	
	// 모든 사원 리스트 출력해주는 함수
	public void allPrint() {
		ArrayList<EmpVO> list = eDao.getAll();
		
		System.out.println("*** 모든사원 정보조회");
		System.out.println("==================================================================");
		System.out.println("| 사원번호 |  사원이름  |   직  급   |        입   사   일       |");
		System.out.println("------------------------------------------------------------------");
		for(EmpVO e : list) {
			System.out.printf("|%7d   | %10s | %10s | %22s |\n", e.getEno(), e.getEname(), e.getJob(), e.getSdate());
		}
		System.out.println("==================================================================");
		System.out.println();
		
	}
	
	// 부서리스트 출력함수
	public void deptPrint() {
		ArrayList<EmpVO> list = eDao.getDeptList();
		
		// 출력
		for(EmpVO evo : list) {
			System.out.println(evo.getDno() + " - " + evo.getDname());
		}
		System.out.println();
	}
	
	// 부서번호 입력받기 전담처리함수
	public int getDno(Scanner sc) {
		int dno = 0;
		ArrayList<Integer> dnoList = eDao.getDnoList();
		while(true){
			deptPrint();
			System.out.print("부서번호를 입력하세요! 이전단계는 -1 을 입력하세요.\n부서번호 : ");
			String sno = sc.nextLine();
			System.out.println();
			try {
				dno = Integer.parseInt(sno);
				
				if(dno != -1 && !dnoList.contains(dno)) {
					System.out.println("# 없는 부서입니다. 다시입력하세요!\n");
					continue;
				}
			} catch(Exception e) {
				System.out.println("# 잘못된 입력입니다.\n");
				continue;
			}
			break;
		}
		
		return dno;
	}
	
	// 부서원 정보 출력해주는 함수
	public void dnoInfoPrint(Scanner sc) {
		while(true) {
			int dno = getDno(sc);
			
			if(dno == -1) {
				break;
			}
			
			ArrayList<EmpVO> list = eDao.getDnoInfo(dno);
			
			if(list.size() == 0) {
				System.out.println("*** 부서원이 없는 부서번호 입니다.\n");
				continue;
			}
			
			System.out.println("*** " + dno + "번 부서원 정보조회");
			System.out.println("==============================================================================================================");
			System.out.println("| 사원번호 |  사원이름  |   직  급   |        입   사   일       | 급  여 | 부서번호 |  부서이름  | 부서위치 |");
			System.out.println("--------------------------------------------------------------------------------------------------------------");
			for(EmpVO evo : list) {
				System.out.printf("|%7d   | %10s | %10s | %22s | %6d |    %2d    | %10s | %8s |\n", 
						evo.getEno(), evo.getEname(), evo.getJob(), evo.getSdate(), 
						evo.getSal(), evo.getDno(), evo.getDname(), evo.getLoc());
			}
			System.out.println("==============================================================================================================");
			System.out.println();
		}
	}
	
	// 모든 직급 출력해주는 함수
	public ArrayList<String> jobList() {
		ArrayList<String> list = eDao.getAllJob();
		System.out.print("| ");
		for(String job : list) {
			System.out.print(job + " | ");
		}
		System.out.println();
		System.out.println();
		
		return list;
	}
	
	// 직급 정보 출력해주는 함수
	public void jobInfoPrint(Scanner sc) {
		while(true) {
			ArrayList<String> jobList = jobList();
			System.out.print("조회할 직급을 입력하세요! 이전단계는 -1 을 입력하세요.\n입 력 :  ");
			String job = sc.nextLine();
			System.out.println();
			job = job.toUpperCase();
			if(job.equals("-1")) {
				break;
			} else if(!jobList.contains(job)) {
				System.out.println("# 없는 직급입니다. 다시 입력하세요!");
				System.out.println();
				continue;
			}
			
			ArrayList<EmpVO> list = eDao.getJobInfo(job);
			
			System.out.println("*** " + job + " 직급 정보조회");
			System.out.println("================================================================================================");
			System.out.println("| 사원번호 |  사원이름  |   직  급   |        입   사   일       | 급  여 | 급여등급 |  커미션 |");
			System.out.println("------------------------------------------------------------------------------------------------");
			for(EmpVO evo : list) {
				System.out.printf("|%7d   | %10s | %10s | %22s | %6d |    %2d    | %7s |\n", 
						evo.getEno(), evo.getEname(), evo.getJob(), 
						evo.getSdate(), evo.getSal(), evo.getGrade(), evo.getScomm());
			}
			System.out.println("================================================================================================");
			System.out.println();
		}
	}
	
}
