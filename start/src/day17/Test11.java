package day17;

/*
	블랙핑크 휘파람을 파일에 저장해보자.
 */

import java.io.*;

public class Test11 {

	public Test11() {
		// 스트림 준비
		// PrintStream 을 사용해보자.
		PrintStream ps = null;
		try {
			ps = new PrintStream("src/day17/result/휘파람.txt");
			// 직접 파일에 연결된 스트림을 만드는 보조스트림이다.
			
			// 내용을 써준다.
			ps.println("\t\t\t휘파람");
			ps.println("\t\t\t\t\t블랙핑크");
			ps.println();
			ps.println("Hey boy");
			ps.println("Make 'em whistle like a missile, bomb, bomb");
			ps.println("Every time I show up, blow up, uh");
			ps.println("Make 'em whistle like a missile, bomb, bomb");
			ps.println("Every time I show up, blow up, uh");
			ps.println("넌 너무 아름다워");
			ps.println("널 잊을 수가 없어");
			ps.println("그 눈빛이 아직 나를");
			ps.println("이렇게 설레게 해 boom boom");
			ps.println("오직 너와 같이 하고파");
			ps.println("낮에도 이 밤에도");
			ps.println("이렇게 너를 원해 mmh mmh");
			ps.println("Yeah, 모든 남자들이 날 매일 check out");
			ps.println("대부분이 날 가질 수 있다 착각");
			ps.println("절대 많은 걸 원치 않아 맘을 원해 난 (uh)");
			ps.println("넌 심장을 도려내 보여봐");
			ps.println("아주 씩씩하게 때론 chic chic 하게");
			ps.println("So hot, so hot, 내가 어쩔 줄 모르게 해");
			ps.println("나지막이 불러줘");
			ps.println("내 귓가에 도는 휘파람처럼");
			ps.println("이대로 지나치지 마요");
			ps.println("너도 나처럼 날 잊을 수가 없다면, whoa");
			ps.println("널 향한 이 마음은 fire");
			ps.println("내 심장이 빠르게 뛰잖아");
			ps.println("점점 가까이 들리잖아");
			ps.println("휘파람");
			ps.println("Uh, 휘 파람, 파람, 파람 (can you hear that?)");
			ps.println("휘 파라파라 파라 밤");
			ps.println("휘파람");
			ps.println("Uh, 휘 파람, 파람, 파람 (can you hear that?)");
			ps.println("휘 파라파라 파라 밤");
			ps.println("Hold up, 아무 말 하지 마");
			ps.println("Just whistle to my heart");
			ps.println("그 소리가 지금 나를");
			ps.println("이렇게 설레게 해 boom boom");
			ps.println("생각은 지루해");
			ps.println("느낌이 shhh");
			ps.println("Every day, all day");
			ps.println("내 곁에만 있어줘, zoom zoom");
			ps.println("Uh, 언제나 난 stylin'");
			ps.println("도도하지만 네 앞에선 darlin'");
			ps.println("뜨거워지잖아 like a desert island");
			ps.println("너 알아갈수록 울려대는 마음속");
			ps.println("그만 내빼 넘어와라");
			ps.println("내게 boy 이젠 checkmate");
			ps.println("게임은 내가 win (uh huh)");
			ps.println("난 널 택해 안아줘 더");
			ps.println("세게 누가 널 가로 채 가기 전에 내가, uh");
			ps.println("이대로 지나치지 마요");
			ps.println("너도 나처럼 날 잊을 수가 없다면, whoa");
			ps.println("널 향한 이 마음은 fire");
			ps.println("내 심장이 빠르게 뛰잖아");
			ps.println("점점 가까이 들리잖아");
			ps.println("휘파람");
			ps.println("Uh, 휘 파람, 파람, 파람 (can you hear that?)");
			ps.println("휘 파라파라 파라 밤");
			ps.println("휘파람");
			ps.println("Uh, 휘 파람, 파람, 파람 (can you hear that?)");
			ps.println("휘 파라파라 파라 밤");
			ps.println("This beat got me feelin' like");
			ps.println("바람처럼 스쳐가는 흔한 인연이 아니길");
			ps.println("많은 말은 필요 없어");
			ps.println("지금 너의 곁에 나를 데려가 줘, ooh, ooh, ooh!");
			ps.println("Make 'em whistle like a missile, bomb, bomb");
			ps.println("Every time I show up, blow up, uh");
			ps.println("Make 'em whistle like a missile, bomb, bomb");
			ps.println("Every time I show up, blow up, uh");
			
			ps.flush();
			/*
				내부적으로 Buffered 의 기능을 가지고 있으므로
				반드시 내보내기가 끝나면 버퍼를 비워줘야 한다.
			 */
			
			System.out.println("***** 휘파람 저장 성공 *****");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
