package com.homework;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomePageController {
	
	@RequestMapping(value="/redirect", params="add", method=RequestMethod.GET)
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		//String opr = request.getParameter("a");
		int k = i+j;
		System.out.println(k);
		request.setAttribute("t3", k);
		request.getAttribute("t3");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/redirect", params="subtract", method=RequestMethod.GET)
	public void subtract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		//String opr = request.getParameter("a");
		//System.out.println(i-j);
		request.setAttribute("value", i);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/redirect", params="divide", method=RequestMethod.GET)
	public void divide(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		//System.out.println(i/j);
		request.setAttribute("value", i);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/redirect", params="multiply", method=RequestMethod.GET)
	public void mutiply(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		//String opr = request.getParameter("a");
		//System.out.println(i*j);
		request.setAttribute("value", i);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
}
