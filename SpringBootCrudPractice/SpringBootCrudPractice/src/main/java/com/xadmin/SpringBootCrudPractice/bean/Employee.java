package com.xadmin.SpringBootCrudPractice.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	private int empID;
	private String name;
	private String company;
	
	
	
	public Employee() {
		super();
	}
	public Employee(int empID, String name, String company) {
		super();
		this.empID = empID;
		this.name = name;
		this.company = company;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	

}
