package empProj.controller;

import java.util.*;

import empProj.view.*;

public class EmpController02 {
	private EmpView view;
	
	public EmpController02() {
		view = new EmpView();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 메세지 출력하고
			System.out.print("부서번호로 조회 : dno\n직급으로 조회 : job\n모든사원조회 : all\n프로그램 종료 : exit\n명령 입력 : ");
			String str = sc.nextLine();
			System.out.println();
			
			switch(str) {
			case "dno":
				view.dnoInfoPrint(sc);
				break;
			case "job":
				view.jobInfoPrint(sc);
				break;
			case "all":
				view.allPrint();
				break;
			case "exit":
				sc.close();
				System.out.println("*** 프로그램을 종료합니다. ***");
				return;
			default:
				System.out.println("# 잘못입력하셨습니다.\n");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new EmpController02();
	}

}
