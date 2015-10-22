package com.brillio.training.test;

public class MarksData {

	private String subject;
	private int marks;
	
	public MarksData() {
	}

	public MarksData(String subject, int marks) {
		this.subject = subject;
		this.marks = marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
}
