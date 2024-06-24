//Entity class for StudentEntry 

package com.main;
import java.io.Serializable;



import javax.persistence.Column;
import javax .persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity  
 @Table (name="stu")
public class Student implements Serializable 
{
	
	private static final long serialVersionUID = 1L;
	@Id 
	@Column(name="rollno")
	private int rollno;
	@Column (name="name")
	private String name;
	@Column (name="batch")
	private String batch;
	@Column(name="marks")
	private int marks;
	@Column(name="joiningdate")
	private String joiningdate;
	
	public Student() 
	{
		super();
	}

	public Student(int rollno, String name, String batch, int marks, String joiningdate)
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.batch = batch;
		this.marks = marks;
		this.joiningdate = joiningdate;
	}
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", batch=" + batch + ", marks=" + marks
				+ ", joiningdate=" + joiningdate + "]";
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}

