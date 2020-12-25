package org.jsp.autowiringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
			ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
			FlipkartController fpct=(FlipkartController) ctx.getBean("fp");
			fpct.purchase();
		}
	}


