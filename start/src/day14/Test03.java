package day14;


public class Test03 {
/*
	Hey boy
	Make 'em whistle like a missile, bomb, bomb
	Every time I show up, blow up, uh
	Make 'em whistle like a missile, bomb, bomb
	Every time I show up, blow up, uh
	
	라는 문자열을 행단위로 결합해서 처리해보자.
 */
	public Test03() {
		// 문자열의 변화가 심한 문자열 데이터는 String 타입보다는 StringBuffer 로 결합작업을 하는것이 유리하다.
		
		// 1. StringBuffer 객체를 만들고
		StringBuffer buff = new StringBuffer();
		// 2. 반복해서 결합작업을 하고
		buff.append("Hey boy\n");
		buff.append("Make 'em whistle like a missile, bomb, bomb\n");
		buff.append("Every time I show up, blow up, uh\n");
		buff.append("Make 'em whistle like a missile, bomb, bomb\n");
		buff.append("Every time I show up, blow up, uh\n");
		
		// 3. 문자열로 변환이 필요한 순간에 변환해준다.
		String song = buff.toString();
		
		// 4. 출력
		System.out.println(song);
		
		/*
			이 클래스는 데이터베이스 작업을 할 때 
			질의명령을 만드는 작업에 많이 사용한다.
			
			예 ]
				
				SELECT
					mno, id, name, email, tel, gen
				FROM
					member
				WHERE
					isshow = 'Y'
					
				==> 
				StringBuffer buff = new StringBuffer();	
				
				buff.append("SELECT ");
				buff.append("	mno, id, name, email, tel, gen ");
				buff.append("FROM ");
				buff.append("	member ");
				buff.append("WHERE ");
				buff.append("	isshow = 'Y' ");
				
				buff.toString()를 호출해서 필요한 순간에 문자열로 반환해준다.
				
		 */
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
