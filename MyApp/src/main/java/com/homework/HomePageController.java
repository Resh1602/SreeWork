package com.homework;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomePageController {
	
	
	@RequestMapping(value="/redirect", params="add", method=RequestMethod.GET)
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i+j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result",k);
		
		return mv;
	}
	
	@RequestMapping(value="/redirect", params="subtract", method=RequestMethod.GET)
	public void subtract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		int k = i-j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result",k);
	}
	
	@RequestMapping(value="/redirect", params="divide", method=RequestMethod.GET)
	public void divide(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i/j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result",k);
	}
	
	@RequestMapping(value="/redirect", params="multiply", method=RequestMethod.GET)
	public void mutiply(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i*j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result",k);
	}
	
}
