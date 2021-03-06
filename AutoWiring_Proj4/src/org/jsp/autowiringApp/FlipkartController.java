package org.jsp.autowiringApp;

import org.springframework.beans.factory.annotation.Autowired;

public class FlipkartController {
	@Autowired
	private Electronic ec;  // Spring AutoWiring deals only with ClassType //
	@Autowired
	private Furniture fr;
	@Autowired
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
