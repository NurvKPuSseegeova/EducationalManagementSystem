package com.tangzhenyao.entity;

public class teacher {
	private int Tid;
	private String Tno;
	private String Cno;
	private String name;
	private String Tpassword;
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTno() {
		return Tno;
	}
	public void setTno(String tno) {
		Tno = tno;
	}
	public String getCno() {
		return Cno;
	}
	public void setCno(String cno) {
		Cno = cno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTpassword() {
		return Tpassword;
	}
	public void setTpassword(String tpassword) {
		Tpassword = tpassword;
	}
	@Override
	public String toString() {
		return "teacher [Tid=" + Tid + ", Tno=" + Tno + ", Cno=" + Cno + ", name=" + name + ", Tpassword=" + Tpassword
				+ "]";
	}
	public teacher(int tid, String tno, String cno, String name, String tpassword) {
		super();
		Tid = tid;
		Tno = tno;
		Cno = cno;
		this.name = name;
		Tpassword = tpassword;
	}

}
