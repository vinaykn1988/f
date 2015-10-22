package com.brillio.training.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager extends Employee {

	private String currentProject;
	private Date projectStartDate;
	

	public Manager() {
	}


	public Manager(int id, String name, double salary, String currentProject, String inputDate) {
		super(id,name,salary);
		this.currentProject = currentProject;
		this.projectStartDate = stringToDate(inputDate);
	}


	public String getCurrentProject() {
		return currentProject;
	}


	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}


	public Date getProjectStartDate() {
		return projectStartDate;
	}


	public void setProjectStartDate(String inputDate) {
		this.projectStartDate = stringToDate(inputDate);
	}

	private static Date stringToDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			return null;
		}
	}
	
}
