package com.deloitte.Emp.inher;

import javax.persistence.Entity;

@Entity
public class SystemEngineer extends EmpInheritance {
	
	
	private String lang;
	private String devProfile;
	
	public SystemEngineer() {}
	
	public SystemEngineer( String lang, String devProfile) {
	
		this.lang = lang;
		this.devProfile = devProfile;
	}



	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getDevProfile() {
		return devProfile;
	}

	public void setDevProfile(String devProfile) {
		this.devProfile = devProfile;
	}
	
	
	
	
	
	
	
	

}
