package com.tangzhenyao.entity;

public class Student {
	private int Sid;
	private int Sno;
	private String Sname;
	private String Password;
	private String Major;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sno=" + Sno + ", Sname=" + Sname + ", Password=" + Password + ", Major="
				+ Major + "]";
	}
	public Student(int sid, int sno, String sname, String password, String major) {
		super();
		Sid = sid;
		Sno = sno;
		Sname = sname;
		Password = password;
		Major = major;
	}

}
