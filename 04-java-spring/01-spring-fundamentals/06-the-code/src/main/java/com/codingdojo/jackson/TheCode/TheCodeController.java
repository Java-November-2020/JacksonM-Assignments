package com.codingdojo.jackson.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {
	
	@RequestMapping("/")
    public String index(@ModelAttribute("errors") String errors, Model method) {
        method.addAttribute("error", errors);
		return "index.jsp";
	}
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String code(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		System.out.println(code);
		if(code.equals("bushido")) {
			return "code.jsp";
		}else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder");
			return "redirect:/";
		    
		}

	}

}
	
	
