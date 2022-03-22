package day17;

/*
	Test09에서 저장한 dataoutput.txt 파일을 읽어보자.
 */

import java.io.*;

public class Test10 {

	public Test10() {
		/*
			DataOutputStream 으로 저장한 파일은 반드시
			DataInputStream 으로 읽어야하고
			읽는 순서도 같아야 한다.
		 */
		// 타겟스트림 준비
		FileInputStream fin = null;
		// 필터스트림 준비
		DataInputStream din = null;
		try {
			fin = new FileInputStream("src/day17/result/dataoutput.txt");
			din = new DataInputStream(fin);
			// 저장할 때 이름, 나이, 신장, 성별, 전화, 메일, 혈액형, rh 순으로 입력을 했으니
			// 꺼내올때도 같은 순서대로 꺼내와야 한다.
			String name = din.readUTF();
			int age = din.readInt();
			float height = din.readFloat();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();
			char blood = din.readChar();
			boolean rh = din.readBoolean();
			
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("신장 : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("혈액형 : " + blood);
			System.out.println("RH : " + (rh ? "+" : "-"));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
				fin.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test10();
	}

}
