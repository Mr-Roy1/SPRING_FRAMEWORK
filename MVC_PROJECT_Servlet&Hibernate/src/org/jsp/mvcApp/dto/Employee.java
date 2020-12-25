package org.jsp.mvcApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Employee")
public class Employee {         //dto class // dto- data transfer object //
	@Id
	@GeneratedValue(generator = "mygen")
	@GenericGenerator(name="mygen", strategy="increment")
	private int id;
	private String emp_id;
	private String firstname;
	private String lastname;
	@Column(unique=true)
	private String emailid;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employee Details[id= "+id+", emp_id= "+emp_id+", first name= "+firstname+", last name= "+lastname+", email id= "+emailid+", password= "+password+"]";
	}

}
