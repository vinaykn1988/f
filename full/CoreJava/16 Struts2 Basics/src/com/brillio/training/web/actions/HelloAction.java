package com.brillio.training.web.actions;

public class HelloAction {

	private String name;
	private String city;
	
	public HelloAction() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String sayHello(){
		
		if(name.equals("")){
		return "failure";	// path to the view (result)
	}
		return "success";  // path to the view (result)
	}
}
