package empProj.vo;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpVO {
	private int eno, mgr, dno, sal, comm;
	private String ename, job, sname, sdate, scomm;
	private Date hdate;
	private Time htime;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public String getScomm() {
		return scomm;
	}
	public void setScomm(String scomm) {
		this.scomm = scomm;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 MM월 dd일 ");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		sdate = form1.format(hdate) + form2.format(htime);
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public Date getHdate() {
		return hdate;
	}
	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}
	public Time getHtime() {
		return htime;
	}
	public void setHtime(Time htime) {
		this.htime = htime;
	}
	@Override
	public String toString() {
		return "EmpVO [eno=" + eno + ", mgr=" + mgr + ", dno=" + dno + ", sal=" + sal + ", comm=" + comm + ", ename="
				+ ename + ", job=" + job + ", sname=" + sname + ", sdate=" + sdate + ", scomm=" + scomm + ", hdate="
				+ hdate + ", htime=" + htime + "]";
	}
	
}
