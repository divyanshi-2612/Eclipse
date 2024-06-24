package com.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emp 
{
	@Id
	private int eno;
	private String name;
	private int salary;
	@OneToOne(cascade=CascadeType.ALL)
	
	//(cascade=CascadeType.ALL) Type 2
	Laptop laptop;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Emp(int eno, String name, int salary, Laptop laptop)
	{
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
		this.laptop = laptop;
	}
	public Emp() 
	{
		super();
		
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", name=" + name + ", salary=" + salary + ", laptop=" + laptop + "]";
	}
	
	

}
