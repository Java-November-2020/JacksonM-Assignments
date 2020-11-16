package com.codingdojo.jackson.DisplayDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DisplayDateController {
	@RequestMapping("/")
	public String hello(Model model) {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat dd = new SimpleDateFormat("dd");
		SimpleDateFormat yy = new SimpleDateFormat("yyyy");
		SimpleDateFormat mm = new SimpleDateFormat("MM");
		Date date = new Date();
		model.addAttribute("date",dd.format(date));
		model.addAttribute("year",yy.format(date));
		int inum2 = Integer.parseInt(mm.format(date));
		String month ="";
		switch (inum2) {
		  case 1:
		    month = "January";
		    break;
		  case 2:
			month = "February";
		    break;
		  case 3:
			month = "March";
		    break;
		  case 4:
			month = "April";
		    break;
		  case 5:
			month = "May";
		    break;
		  case 6:
			month = "June";
		    break;
		  case 7:
			month = "July";
		    break;
		  case 8:
			month = "August";
		    break;
		  case 9:
			month = "September";
		    break;
		  case 10:
			month = "October";
		    break;
		  case 11:
			month = "November";
		    break;
		  case 12:
			month = "December";
			break;
		}
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		String dow="";
		switch (day) {
		  case 1:
		    dow="Sunday";
		    break;
		  case 2:
			dow="Monday";
		    break;
		  case 3:
			dow="Tuesday";
		    break;
		  case 4:
			dow="Wednesday";
		    break;
		  case 5:
			dow="Thursday";
		    break;
		  case 6:
			dow="Friday";
		    break;
		  case 7:
			dow="Saturday";
		    break;
		}
		model.addAttribute("month",month);
		model.addAttribute("day",dow);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a");
		model.addAttribute("time", sdf.format(date));
		return "time.jsp";
	}
	
}
