package org.jsp.beanApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
		
		// SPRING OBJECT CREATION //
		Student s1=(Student) ctx.getBean("std");
		System.out.println(s1.hashCode());
		
		Student s2=(Student) ctx.getBean("std");
		System.out.println(s2.hashCode());
		
		// JAVA OBJECT CREATION //
		Student st1=new Student();
		System.out.println(st1.hashCode());
		
		Student st2=new Student();
		System.out.println(st2.hashCode());
	}
}
