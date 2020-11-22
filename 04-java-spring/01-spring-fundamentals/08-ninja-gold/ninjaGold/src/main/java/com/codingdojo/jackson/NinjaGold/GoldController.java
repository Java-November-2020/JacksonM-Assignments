package com.codingdojo.jackson.NinjaGold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	private String index(HttpSession session, Model viewModel) {
		ArrayList<String>activity = new ArrayList<String>();
		if(session.getAttribute("usersGold")==null) {
			session.setAttribute("usersGold", 0);
		}
		if(session.getAttribute("activity")==null) {
			session.setAttribute("activity", activity);
		}
		viewModel.addAttribute("gold", session.getAttribute("usersGold"));
		viewModel.addAttribute("activity",session.getAttribute("activity"));
		return "index.jsp";
	}
	
	@RequestMapping(value="/findGold", method=RequestMethod.POST)
	public String gold(@RequestParam("building") String building, HttpSession session) {
		Random r = new Random();
		int gold = (int)session.getAttribute("usersGold");
		int goldThisTurn = 0;
		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("activity");
		Date date = new Date();
		SimpleDateFormat dd = new SimpleDateFormat("dd");
		SimpleDateFormat yy = new SimpleDateFormat("yyyy");
		SimpleDateFormat mon = new SimpleDateFormat("MM");
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a");
		String month="";
		String day="";
		int inum2 = Integer.parseInt(mon.format(date));
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
		int idate = Integer.parseInt(dd.format(date));
		switch(idate %10) {
			case 1:
				day="st";
				break;
			case 2:
				day="nd";
				break;
			case 3: 
				day="rd";
				break;
			default:
				day="th";
				break;
		}
		int iyear = Integer.parseInt(yy.format(date));
		
		if(building.equals("farm")) {
			goldThisTurn = r.nextInt((20-10) + 1) + 10;//r.nextInt((Max-min) + 1) + min;
			activity.add("You entered a farm and earned " + goldThisTurn + " gold. " + "(" +  month + " " + idate + day + " " + iyear + " " + sdf.format(date) + ")");
		}
		else if(building.equals("cave")) {
			goldThisTurn = r.nextInt((10-5) + 1) + 5;//r.nextInt((Max-min) + 1) + min;
			activity.add("You entered the cave and earned " + goldThisTurn + " gold. " + "(" +  month + " " + idate + day + " " + iyear + " " + sdf.format(date) + ")");
		}
		else if(building.equals("house")) {
			goldThisTurn = r.nextInt((5-2) + 1) + 2;//r.nextInt((Max-min) + 1) + min;
			activity.add("You entered the house and earned " + goldThisTurn + " gold. " + "(" +  month + " " + idate + day + " " + iyear + " " + sdf.format(date) + ")");
		}
		else {
			goldThisTurn = r.nextInt((50+ 10) + 1) - 50;//r.nextInt((Max-min) + 1) + min;
			if (goldThisTurn<0) {
				activity.add("You entered the casino and lost " + goldThisTurn + " gold. " + "(" +  month + " " + idate + day + " " + iyear + " " + sdf.format(date) + ")");
			}else {
				activity.add("You entered the casino and won " + goldThisTurn + " gold. " + "(" +  month + " " + idate + day + " " + iyear + " " + sdf.format(date) + ")");
			}
		}
		int totalGold= gold + goldThisTurn;
		session.setAttribute("usersGold", totalGold);
		session.setAttribute("activity", activity);
		return "redirect:/";
	}
}
