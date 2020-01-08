package com.deloitte.Emp.inher;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Inheritance {
	
	@Id
	private int empId;
	private String ename;
	
	public Inheritance() {}
	public Inheritance(int empId, String ename) {
		super();
		this.empId = empId;
		this.ename = ename;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	

}




