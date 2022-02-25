package day03.ex;

/*
	1년은 365.2426 일이다
	이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력하세요.
	
	힌트 ]
		365.2426일은 단위가 일 단위이다.
		하루는 24시간이다.
		따라서 0.5일은 12시간을 의미한다.
 */
public class Ex04 {
	public static void main(String[] args) {
		// 할일
		// 데이터 변수에 기억
		double total = 365.2426;
		// 누적계산될 변수 만들고
		double tmp = total;
		// 날수 구하고 --> 누적 변수에 계산해서 업데이트
		int day = (int) tmp;
		tmp = tmp - day;
		// tmp -= day;
		
		// 0.2426 을 초로 변환한다.
		// 1 * 24 ==> 하루의 시간
		// 0.5 * 24 ==> 하루의 절반 시간
		// 0.1 * 24 ==> 0.1일의 시간
		int tsec = (int) (0.2426 * 24 * 60 * 60);
		
		// 시간 구하고 --> 누적 변수에 계산해서 업데이트
		int hour = tsec / 60 / 60 ;
		
		tsec = tsec % (60 * 60);
		// tsec %= 3600;
		
		// 분 구하고  --> 누적 변수에 계산해서 업데이트
		int min = tsec / 60;
		tsec = tsec % 60;
		
		// 초 구하고
		int sec = tsec;
		
		// 출력하고
		System.out.println("1 년은 " + total + " 일이고");
		System.out.println("이것은 " + day + " 일");
		System.out.println("       " + hour + " 시간");
		System.out.println("       " + min + " 분");
		System.out.println("       " + sec + " 초 이다.");
	}
}
