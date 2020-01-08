package com.deloitte.Emp.inher;

import javax.persistence.Entity;


@Entity
@namedQuery
public class DC extends EmpInheritance{
	
	
	private String testTech;
	private String testProfile;
	
	
	public DC() {}
	public DC(String testTech, String testProfile) {
		
		this.testTech = testTech;
		this.testProfile = testProfile;
	}
	
	public String getTestTech() {
		return testTech;
	}
	public void setTestTech(String testTech) {
		this.testTech = testTech;
	}
	public String getTestProfile() {
		return testProfile;
	}
	public void setTestProfile(String testProfile) {
		this.testProfile = testProfile;
	}
	
	
	
	

}
