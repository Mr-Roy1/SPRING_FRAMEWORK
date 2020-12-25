package org.jsp.dempApp;


import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) throws IOException {
//		Resource res=new ClassPathResource("Spring.xml");
//		System.out.println(res.getFile());
//		BeanFactory bef=new XmlBeanFactory(res);
//		HelloWorld hw=(HelloWorld) bef.getBean("hlw");
//		hw.displayMessage();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		// SPRING OBJECT CREATION //
		HelloWorld hw=(HelloWorld)context.getBean("hlw");
		System.out.println(hw.hashCode());
		
		HelloWorld hw1=(HelloWorld)context.getBean("hlw");
		System.out.println(hw1.hashCode());
		
		// JAVA OBJECT CREATION //
		HelloWorld hj=new HelloWorld();
		System.out.println(hj.hashCode());
		
		HelloWorld hj1=new HelloWorld();
		System.out.println(hj1.hashCode());
		
	}
}
