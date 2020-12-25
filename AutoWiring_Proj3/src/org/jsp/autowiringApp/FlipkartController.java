package org.jsp.autowiringApp;

public class FlipkartController {
	
	private Electronic ec;  // Spring AutoWiring deals only with ClassType //
	private Furniture fr;
	private Cosmetics cs;
	
	
	public FlipkartController(Electronic ec, Furniture fr, Cosmetics cs) {
		super();
		this.ec = ec;
		this.fr = fr;
		this.cs = cs;
	}


	public void purchase() {
		System.out.println("Purchase Confirmed by Flipkart!!");
		ec.mobile();
		fr.sofa();
		cs.lipstick();
	}
}
