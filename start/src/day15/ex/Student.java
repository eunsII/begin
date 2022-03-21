package day15.ex;

public class Student implements Comparable {
	private String name;
	private int ban, no, java, db, web, spring, total;
	private double avg;
	
	public Student() {}
	public Student(String name, int ban, int no, int java, int db, int web, int spring) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.java = java;
		this.db = db;
		this.web = web;
		this.spring = spring;
		setTotal(java + db + web + spring);
		setAvg(total / 4.0);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public int compareTo(Object o) {
		int result = 0;
		
		result = ban - ((Student) o).getBan();
		
		if(result == 0) {
			result = no - ((Student) o).getNo();
		}
		
		return result;
	}
	
	
}
