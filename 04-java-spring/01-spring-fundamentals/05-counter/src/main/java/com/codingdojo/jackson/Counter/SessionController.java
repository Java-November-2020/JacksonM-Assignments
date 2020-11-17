package com.codingdojo.jackson.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}
		
		Integer currentCount = (Integer)session.getAttribute("count");
		currentCount++;
		session.setAttribute("count", currentCount);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
		public String count(HttpSession session, Model model) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
			model.addAttribute("currentCount", session.getAttribute("count"));
		}
			Integer currentCount = (Integer)session.getAttribute("count");
			session.setAttribute("count", currentCount);
			model.addAttribute("currentCount", currentCount);
			return "counter.jsp";
		}
	
}