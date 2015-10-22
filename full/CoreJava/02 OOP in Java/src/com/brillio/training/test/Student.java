package com.brillio.training.test;

public class Student {

	private int rollNumber;
	private String name;
	private final int N = 3;
	private MarksData[] marksData = new MarksData[N];
	
	public Student() {
	}

	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
		
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MarksData[] getMarksData() {
		return marksData;
	}

	public void setMarksData(MarksData[] marks) {
		marksData = marks;
	}
	
	public String getGrade(){
		
		int m = (int)(this.marksData[0].getMarks() + this.marksData[1].getMarks() + this.marksData[2].getMarks())/3;
		
		if (0<=m && m<=40){
			return "D";
		}
		else if(40<=m && m<=50) {
			return "C";
		}
		else if(51<=m && m<=60) {
			return "B";
		}
		else if(61<=m && m<=70) {
			return "B+";
		}
		else if(71<=m && m<=80) {
			return "A";
		}
		else if(m>80) {
			return "A+";
		}
		
		return null;
	}
}
	
	
	
