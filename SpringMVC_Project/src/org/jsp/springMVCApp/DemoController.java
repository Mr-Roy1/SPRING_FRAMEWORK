package org.jsp.springMVCApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class DemoController {
	//InternalResourceViewResolver //---> used for class path in dispatcher-servlet.xml file
	public DemoController() {
		System.out.println("DemoController object created");
	}
	
	@RequestMapping(value="/btm", method=RequestMethod.POST)
	public ModelAndView display(@ModelAttribute Demo demo) {
		
		System.out.println("inside display() method");
		String message="Message is "+demo.getNm();
		return new ModelAndView("Success", "pappu", message);
	}
	
	@RequestMapping(value="/btm1", method=RequestMethod.POST)
	public String displayNew(@ModelAttribute Demo demo, ModelMap map) {
		
		System.out.println("inside displayNew() method");
		String message="Message is "+demo.getNm();
		map.addAttribute("pappu", message);
		return "Success";
	}
}
