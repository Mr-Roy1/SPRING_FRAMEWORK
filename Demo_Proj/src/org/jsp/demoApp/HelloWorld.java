package org.jsp.demoApp;

public class HelloWorld {
	
	public HelloWorld() {
		System.out.println("Hello World Object Created!");
	}
	
	private String message="Hi All Spring Student!";
	
	public void displayMessage() {
		System.out.println("Message is: "+message);
	}
}
