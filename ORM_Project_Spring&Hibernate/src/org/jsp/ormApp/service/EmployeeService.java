package org.jsp.ormApp.service;

import java.util.Random;

import org.jsp.ormApp.dao.EmployeeDao;
import org.jsp.ormApp.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	public Employee registerEmployee(Employee emp) {
		if(emp!=null) {
			System.out.println("Inside EmployeeService Class");
			// Business Logic to Generate emp_id //
			Random rd=new Random();
			int id=rd.nextInt();
			String emp_id="HCL-"+id;
			// Set the emp_id to Employee Object //
			emp.setEmp_id(emp_id);
		}
		System.out.println("pass Employee Object from EmployeeServie to EmployeeDao");
		Employee retemployee=dao.saveEmployee(emp);
		System.out.println("Return Employee Object from EmployeeService to EmployeeController");
		return retemployee;
	}
}
