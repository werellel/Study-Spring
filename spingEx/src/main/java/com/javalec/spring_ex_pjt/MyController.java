package com.javalec.spring_ex_pjt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/view")
	public String view() {
		return "view"; // jsp ���� �̸�
	}
	
	@RequestMapping("/content/contentView")
	public String contentView(Model model) {
		model.addAttribute("id", "abcde");
		
		return "content/contentViews"; // jsp ���� �̸�
	}
	
	@RequestMapping("/model/modelEx")
	public String modelEx(Model model) {
		model.addAttribute("data", "asdasdasd");
		
		return "/model/modelEx";
	}
	
	@RequestMapping("/modelAndView/modelView")
	public ModelAndView modelAndView() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "abcde");
		mv.setViewName("/modelAndView/modelView");
		
		return mv;
	}
	
	
}
