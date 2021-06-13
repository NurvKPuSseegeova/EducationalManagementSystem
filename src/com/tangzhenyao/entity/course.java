package com.tangzhenyao.entity;

public class course {
	private int Cid;
	private String Con;
	private int Cno;
	private String Cname;
	private String grade;
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCon() {
		return Con;
	}
	public void setCon(String con) {
		Con = con;
	}
	public int getCno() {
		return Cno;
	}
	public void setCno(int cno) {
		Cno = cno;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "course [Cid=" + Cid + ", Con=" + Con + ", Cno=" + Cno + ", Cname=" + Cname + ", grade=" + grade + "]";
	}
	public course(int cid, String con, int cno, String cname, String grade) {
		super();
		Cid = cid;
		Con = con;
		Cno = cno;
		Cname = cname;
		this.grade = grade;
	}

}
