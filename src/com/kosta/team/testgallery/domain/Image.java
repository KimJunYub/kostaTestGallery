package com.kosta.team.testgallery.domain;

import java.sql.Date;

public class Image {
	
	private String id;
	private String title;
	private Date date;
	private String memo;
	
	public Image() {}

	public Image(String id, String title, Date date, String memo) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.memo = memo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setName(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	

}
