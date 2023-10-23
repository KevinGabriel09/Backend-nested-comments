package com.discusion.foroPrueba.models;

import java.util.List;



public class Foro {

	private String id;
	private String text;
	private List<Foro> replies;
	
	
	public Foro() {
		super();
	}


	public Foro(String id, String text, List<Foro> replies) {
		super();
		this.id = id;
		this.text = text;
		this.replies = replies;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public List<Foro> getReplies() {
		return replies;
	}


	public void setReplies(List<Foro> replies) {
		this.replies = replies;
	}
	
}
