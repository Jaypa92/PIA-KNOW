package com.justin.piano.Controllers;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.servlet.http.HttpSession;

@Controller
public class PiaKnowController {
	@GetMapping("/")
	public String index() {
		return "home.jsp";
	}
	
	@GetMapping("/piano")
	public String piano() {
		return "piano.jsp";
	}
	
	@GetMapping("/next")
	public String next(HttpSession session) {
		ArrayList<String> pages = new ArrayList<String>();
		String one = "piano.jsp";
		String two = "question2.jsp";
		String three = "question3.jsp";
		String four = "question4.jsp";
		String five = "question5.jsp";
		String six = "question6.jsp";
		String seven = "question7.jsp";
		String eight = "question8.jsp";
		String nine = "question9.jsp";
		String ten = "question10.jsp";
		String eleven = "question11.jsp";
		String twelve = "question12.jsp";
		
		pages.add(one);
		pages.add(two);
		pages.add(three);
		pages.add(four);
		pages.add(five);
		pages.add(six);
		pages.add(seven);
		pages.add(eight);
		pages.add(nine);
		pages.add(ten);
		pages.add(eleven);
		pages.add(twelve);
		
		Collections.shuffle(pages);
		session.setAttribute("questions", pages);
		return "redirect:/next/0";
	}
	@GetMapping("/next/{i}")
	public String question(HttpSession session, @PathVariable("i") int i, Model model) {
		ArrayList<String> list = (ArrayList<String>) session.getAttribute("questions");
		if(i >= list.size()) {
			return "redirect:/";
		}
		model.addAttribute("i", i);
		return list.get(i);
	}
	@GetMapping("/test")
	public String test() {
		return "question2.jsp";
	}
}
