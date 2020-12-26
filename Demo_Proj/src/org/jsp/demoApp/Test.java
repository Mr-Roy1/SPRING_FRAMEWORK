package org.jsp.demoApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("Spring.xml");
		BeanFactory bef=new XmlBeanFactory(res);
		HelloWorld hw=(HelloWorld) bef.getBean("hlw");
		hw.displayMessage();
		
		
		           // OR //
		
		
		ApplicationContext conxt=new ClassPathXmlApplicationContext("Spring.xml");
		HelloWorld hw1=(HelloWorld) conxt.getBean("hlw");
		hw1.displayMessage();
		
	}
}
