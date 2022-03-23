package day18;

import java.io.*;
/*
	이 클래스가 직렬화 되기 위해서는(이 클래스 채로 데이터를 넘길려고 하면)
	직렬화 가능한 클래스가 되어야 한다.
		방법 ]
			implements Serializable
			
	이 때 전달되는 데이터는 
	멤버중 변수의 내용만 전달이 된다.
	따라서 데이터를 사용하려고 하면
	똑같은 클래스를 받는 쪽에서도 가지고 있어야 한다.
 */

public class Friend implements Serializable {
	private String name, tel, mail, addr, blood;
	private int age;
	private float height;
	private char gen;
	private boolean rh; // + : true, - : false
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}	
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public boolean isRh() {
		return rh;
	}
	public void setRh(boolean rh) {
		this.rh = rh;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", tel=" + tel + ", mail=" + mail + ", addr=" + addr + ", blood=" + blood
				+ ", age=" + age + ", height=" + height + ", gen=" + gen + ", rh=" + rh + "]";
	}
}
