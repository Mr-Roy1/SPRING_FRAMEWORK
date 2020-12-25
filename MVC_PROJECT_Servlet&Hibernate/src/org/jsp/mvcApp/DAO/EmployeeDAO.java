package org.jsp.mvcApp.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsp.mvcApp.dto.Employee;

public class EmployeeDAO {
	
	public Employee saveEmployee(Employee emp) {
		System.out.println("Inside EmployeeDAO class");
		int primarykey = 0;
		Transaction tran=null;
	    try {
		if(emp!=null) {
			Configuration conf = new Configuration();
			conf.configure();
			SessionFactory sef = conf.buildSessionFactory();
			Session ses = sef.openSession();
			 tran = ses.beginTransaction();
			primarykey=(int) ses.save(emp);
			System.out.println("Employee object saved into DataBase");
			tran.commit();
			ses.close();
		}
		}catch(HibernateException e) {
			tran.rollback();
			System.out.println("Operations rolled back!!");
			return null;
		}
	    if(primarykey!=0) {
	    	System.out.println("Return Employee object back from DataBase");
	    	return emp;
	    }
	    else {
	    	return null;
	    }
	}
}
