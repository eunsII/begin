package day17;

import java.io.*;
/*
	1. result 패키지에 폴더를 강제로 만들어보자.
	
	2. 계층화된 폴더를 강제로 만들어보자.
	
	3. 만들어진 파일중 하나를 삭제한다.(폴더도 파일로 간주되므로 삭제가능하다.)
	
	4. 만들어진 파일중 하나를  다른이름으로 변경시켜보자.
 */
public class Test04 {

	public Test04() {
		// 만들고 싶은 폴더(폴더가 위치에 없어도 상관없다.) 파일로 만든다.
		
		/*
		// 1.
		File file = new File("src/day17/result/abc");
		String msg = file.mkdir() ? "폴더 생성 성공" : "폴더 생성 실패";
		
		// 2.
		File file = new File("src/day17/result/a/b/c/d");
		String msg = file.mkdirs() ? "폴더 생성 성공" : "폴더 생성 실패" ;
		
		// 결과 출력
		System.out.println("### 결과 : " + msg);
		
		// 3. 2번에서 만든 d 폴더를 삭제한다.
		File file = new File("src/day17/result/a/b/c/d");
		String msg = file.delete() ? "삭제 성공" : "삭제 실패";
		System.out.println("### 결과 : " + msg);
		 */
		
		// 4. 변경작업
		// 	4-1 현재 파일과 바꿀이름의 파일을 두 다 File로 만든다.
		
		File oldF = new File("src/day17/result/a/b/c");
		File newF = new File("src/day17/result/a/b/renameTest");
		// 4-2 바꾸면 된다. 사용함수 renameTo()
		String msg = oldF.renameTo(newF) ? "변경 성공" : "변경 실패";
		System.out.println("### 결과 : " + msg);
	}

	public static void main(String[] args) {
		new Test04();
	}

}
