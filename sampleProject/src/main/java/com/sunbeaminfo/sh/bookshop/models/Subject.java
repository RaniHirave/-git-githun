package com.sunbeaminfo.sh.bookshop.models;

public class Subject {
	private String subject;
	public Subject() {
		this("");
	}
	public Subject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return String.format("Subject [subject=%s]", subject);
	}
	
}
