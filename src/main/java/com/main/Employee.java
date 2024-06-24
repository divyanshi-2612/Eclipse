package com.main;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Entity 
@Table (name="employee")
public class Employee
{
	@Id
	private int eno;
	private String ename;
	private int salary;
	public int getEno() {
		return eno;
	}
	
	public Employee () 
	{
		
	}
	
	
	public Employee(int eno, String ename, int salary) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
