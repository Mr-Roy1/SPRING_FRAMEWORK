package org.jsp.ormApp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jsp.ormApp.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory sef;
	public Employee saveEmployee(Employee emp) {
		System.out.println("Inside EmployeeeDao Class");
		Transaction tran=null;
		int primarykey=0;
	try {
		if(emp!=null) {
			Session ses=sef.openSession();
			tran=ses.beginTransaction();
			primarykey=(int) ses.save(emp);
			System.out.println("Saved Employee object to DataBase");
			tran.commit();
			ses.close();
		}
	}catch(HibernateException e) {
		tran.rollback();
		System.out.println("Operations rolled Back");
		return null;
	}
	if(primarykey!=0) {
		System.out.println("Return Employee object from DataBase back to EmployeeService Class");
		return emp;
	}
	else {
		return null;
	 }
	}
}