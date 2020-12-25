package org.jsp.autowiringApp;

public class FlipkartController {
	
	private Electronic ec;  // Spring AutoWiring deals only with ClassType //
	private Furniture fr;
	private Cosmetics cs;
	public Electronic getEc() {
		return ec;
	}
	public void setEc(Electronic ec) {
		this.ec = ec;
	}
	public Furniture getFr() {
		return fr;
	}
	public void setFr(Furniture fr) {
		this.fr = fr;
	}
	public Cosmetics getCs() {
		return cs;
	}
	public void setCs(Cosmetics cs) {
		this.cs = cs;
	}
	
	public void purchase() {
		System.out.println("Purchase Confirmed by Flipkart!!");
		ec.mobile();
		fr.sofa();
		cs.lipstick();
	}
	
}
