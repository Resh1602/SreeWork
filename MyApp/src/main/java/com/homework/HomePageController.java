package com.homework;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	@RequestMapping(value = "/redirect", params = "save", method = RequestMethod.GET)
	public ModelAndView save(HttpServletRequest request, HttpServletResponse response) throws MyException {
		String i = (request.getParameter("t1"));
		String outputString = null;
		System.out.println("Value of i is" + i + "this");
		ModelAndView mv = new ModelAndView();
		UserDataModel userDataModel = new UserDataModel();
		userDataModel.setTextFromUser(i);
		UserDataManager manager = new UserDataManagerImpl();
		boolean result = false;
		try {
		result = manager.saveUserDataToFile(userDataModel);
		}catch(MyException me){
			outputString = "Error saving file";
		}
		System.out.println("Result:" + result);
		if (result == true) {
			outputString = "File saved successfully";
			System.out.println(outputString);
		}
		mv.setViewName("index.jsp");
		mv.addObject("result", outputString);
		return mv;
	}

	@RequestMapping(value = "/redirect", params = "view", method = RequestMethod.GET)
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response)
			throws FileNotFoundException, ClassNotFoundException, IOException {
		UserDataModel userDataModel = new UserDataModel();
		UserDataManager manager = new UserDataManagerImpl();
		String text = manager.viewUserDataFromFile(userDataModel);
		String outputString = null;
		ModelAndView mv = new ModelAndView();
		if (text == null) {
			outputString = "Value is null";
		} else {
			outputString = text;
		}
		mv.setViewName("index.jsp");
		mv.addObject("result", outputString);
		return mv;

	}
}
