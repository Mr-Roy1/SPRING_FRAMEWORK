package org.jsp.setterInjectionApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cfx=new ClassPathXmlApplicationContext("Spring.xml");
		ICar i1=(ICar) cfx.getBean("bm");
		i1.drive();
		ICar i2=(ICar) cfx.getBean("ad");
		i2.drive();
	}
}
