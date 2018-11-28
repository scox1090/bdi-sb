package com.example.demo.vo;


public class JapanVO {

	public int jpnum;
	public String jpdesc;
	public String jpname;
	public int getJpnum() {
		return jpnum;
	}
	public void setJpnum(int jpnum) {
		this.jpnum = jpnum;
	}
	public String getJpdesc() {
		return jpdesc;
	}
	public void setJpdesc(String jpdesc) {
		this.jpdesc = jpdesc;
	}
	public String getJpname() {
		return jpname;
	}
	public void setJpname(String jpname) {
		this.jpname = jpname;
	}
	@Override
	public String toString() {
		return "JapanVO [jpnum=" + jpnum + ", jpdesc=" + jpdesc + ", jpname=" + jpname + "]";
	}
	
}
