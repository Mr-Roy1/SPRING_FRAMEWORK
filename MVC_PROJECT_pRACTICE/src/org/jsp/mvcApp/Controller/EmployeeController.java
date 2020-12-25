package org.jsp.mvcApp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.mvcApp.Service.EmployeeService;
import org.jsp.mvcApp.dto.Employee;

public class EmployeeController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Employee emp=null;
		Employee retemp=null;
		if(!req.getParameter("fn").isEmpty() 
				&& !req.getParameter("ln").isEmpty() 
				&& !req.getParameter("em").isEmpty() 
				&& !req.getParameter("pw").isEmpty()) {
			
			 emp=new Employee();
			emp.setFirstname(req.getParameter("fn"));
			emp.setLastname(req.getParameter("ln"));
			emp.setEmailid(req.getParameter("em"));
			emp.setPassword(req.getParameter("pw"));
			
			System.out.println("Pass Employee Object to EmployeeService class");
			EmployeeService empsrc=new EmployeeService();
			retemp=empsrc.registerEmployee(emp);
			System.out.println("returned Employee object back from EmployeeService to EmployeeController");
		}
		else {
			emp=null;
			System.out.println("Invalid Data");
		}
		//redirect ui or view part
		RequestDispatcher dispatcher=null;
		if(retemp!=null) {
			//add employee object into scope
			req.setAttribute("Username", retemp.getFirstname()+retemp.getLastname());
			dispatcher=req.getRequestDispatcher("Success.jsp");
		}
		else {
			dispatcher=req.getRequestDispatcher("Error.jsp");
		}
		dispatcher.forward(req, resp);
	}

}
