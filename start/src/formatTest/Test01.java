package formatTest;

import java.text.*;

public class Test01 {

	public Test01() {
		// DecimalFormat
		double no = 1234.5678;
		// 소수이하 두째자리까지만 보여주고 정수부는 세자리마다 , 를 붙여서 출력해보자.
		
		// 폼 만들고
		DecimalFormat form1 = new DecimalFormat("0,000,000.00");
		DecimalFormat form2 = new DecimalFormat("#,###,###.##");
		
		// 문자열 만들고
		String str1 = form1.format(no);
		String str2 = form2.format(no);
		
		// 출력
		System.out.println("0 : " + str1);
		System.out.println("# : " + str2);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
