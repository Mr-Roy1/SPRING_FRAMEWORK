package org.jsp.mvcApp.service;

import java.util.Random;

import org.jsp.mvcApp.DAO.EmployeeDAO;
import org.jsp.mvcApp.dto.Employee;

public class EmployeeService {
	
	public Employee registerEmployee(Employee emp) {
		System.out.println("Inside Employee Service Class");
		// Business Logic to Generate emp_id //
		if(emp!=null) {
			Random rd=new Random();  // it is responsible to generate random no. of type int //
			int id=rd.nextInt();
			String emp_id="TCS- "+id;
			// Set emp_id to Employee Object  //
			emp.setEmp_id(emp_id);
		}
		System.out.println("Pass Employee object to EmployeeDAO class");
		EmployeeDAO dao=new EmployeeDAO();
		Employee retemployee = dao.saveEmployee(emp);
		System.out.println("returned Employee object from EmployeeDAO to EmployeeService");
		return retemployee;
	}
}
