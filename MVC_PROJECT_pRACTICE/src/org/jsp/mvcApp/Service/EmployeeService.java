package org.jsp.mvcApp.Service;

import java.util.Random;

import org.jsp.mvcApp.DAO.EmployeeDAO;
import org.jsp.mvcApp.dto.Employee;

public class EmployeeService {
	
	public Employee registerEmployee(Employee emp) {
		System.out.println("Inside EmployeeService class");
		//Business logic to generate emp_id
		if(emp!=null) {
			Random rd=new Random();
			int id=rd.nextInt();
			String emp_id="IBM-"+id;
			//setemp_id to Employee Object
			emp.setEmp_id(emp_id);
		}
		System.out.println("Pass Employee object to EmployeeDAo class");
		EmployeeDAO dao=new EmployeeDAO();
		Employee retemployee=dao.saveEmployee(emp);
		System.out.println("returned Employee object from EmployeeDAO to EmployeeService");
		return retemployee;
		
	}

}
