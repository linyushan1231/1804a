package com.bw.bean;

public class Blog {

	private Integer bid;//	主键
	private String title;//	标题
	private String content;//	内容
	private String label;//	标签
	private Integer cid;//	博文分类
	private String cname;
	private String created;
	
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
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
	@Override
	public String toString() {
		return "Blog [bid=" + bid + ", title=" + title + ", content=" + content + ", label=" + label + ", cid=" + cid
				+ ", cname=" + cname + ", created=" + created + "]";
	}
}
