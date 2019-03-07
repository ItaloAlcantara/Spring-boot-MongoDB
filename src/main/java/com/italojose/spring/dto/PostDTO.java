package com.italojose.spring.dto;

import java.io.Serializable;
import java.util.Date;

import com.italojose.spring.domain.Post;

public class PostDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String body;
	private Date date;
	
	public PostDTO() {
		
	}
	
	public PostDTO(Post post) {
		
		id = post.getId();
		date = post.getDate();
		body = post.getBody();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
