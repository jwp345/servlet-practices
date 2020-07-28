package com.bit2020.guestbook.vo;

import java.sql.Date;

public class GuestbookVo {
	private long no;
	private String Name;
	private String Password;
	private String Text;
	private Date Date;
	
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", Name=" + Name + ", Password=" + Password + ", Text=" + Text + "]";
	}
	
}
