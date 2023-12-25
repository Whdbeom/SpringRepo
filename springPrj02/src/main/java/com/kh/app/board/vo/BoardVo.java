package com.kh.app.board.vo;

public class BoardVo {

	private String no;
	private String content;
	private String title;
	private String enrollDate;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public BoardVo(String no, String content, String title, String enrollDate) {
		super();
		this.no = no;
		this.content = content;
		this.title = title;
		this.enrollDate = enrollDate;
	}
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", content=" + content + ", title=" + title + ", enrollDate=" + enrollDate + "]";
	}
	
	
	
	
}
