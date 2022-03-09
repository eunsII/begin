package day10.pink;

/**
 * 블랙핑크 멤버 한명의 정보를 기억할 클래스
 * @author	전은석
 * @since	2022.03.09
 * @version v.1.0
 *
 */
public class Member {
	
	private String name, addr, tel, mail, birth;
	private int age;
	private char gen;
	
	public Member() {}
	
	/**
	 * 	이 클래스가 객체가 될때 데이터를 입력받아서 객체로 만들 수 있는 생성자
	 */
	public Member(String name, String addr, String tel, String mail, String birth, int age, char gen) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.mail = mail;
		this.birth = birth;
		this.age = age;
		this.gen = gen;
	}
	
	// 이름을 기억시키는 함수
	public void setName(String name) {
		this.name = name;
	}
	
	// 기억된 이름을 반환해주는 함수
	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "name=" + name + ", addr=" + addr + ", tel=" + tel + ", mail=" + mail + ", birth=" + birth
				+ ", age=" + age + ", gen=" + gen ;
	}
	
}
