package org.jsp.ormApp.controller;

import javax.sql.DataSource;

import org.jsp.ormApp.dto.Employee;
import org.jsp.ormApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class EmployeeController {
	
	//LocalSessionFactoryBean  //for id=sessionFactory in xml file
	//DriverManagerDataSource   //for id=dataSource in xml file
	//DispatcherServlet  -->  // for fully qualified class name //
	//InternalResourceViewResolver  -->  //for class path in spring-servlet.xml file //
	
	@Autowired
	EmployeeService service;
	@RequestMapping(value="/btm",method=RequestMethod.POST)
	public String accessEmployee(@ModelAttribute Employee emp,ModelMap map) {
		
		Employee retmap=null;
		System.out.println("Inside EmployeeController Class");
		if(emp!=null && !emp.getFirstname().isEmpty()
				&& !emp.getLastname().isEmpty()
				&& !emp.getEmailid().isEmpty()
				&& !emp.getPassword().isEmpty()) {
			
			System.out.println("Pass Employee Object from EmployeeController to EmployeeService Class");
			retmap=service.registerEmployee(emp);
			System.out.println("Returned Employee object to Employee Controller Class");
		}
		
		if(retmap!=null) {
			map.addAttribute("nmg", emp.getFirstname()+" "+emp.getLastname());
			return "Success";
		}
		else {
			map.addAttribute("err", "Registration Unsuccessfull");
			return "Error";
		}
	}
}
