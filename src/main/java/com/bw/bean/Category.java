package com.bw.bean;

public class Category {

	private Integer cid;
	private String cname;
	
	private Integer bcount;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getBcount() {
		return bcount;
	}

	public void setBcount(Integer bcount) {
		this.bcount = bcount;
	}

	public Category(Integer cid, String cname, Integer bcount) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.bcount = bcount;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", bcount=" + bcount + "]";
	}
}
