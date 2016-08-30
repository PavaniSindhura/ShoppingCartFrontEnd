package com.niit.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Controller
public class HomeController {
	@Autowired
	CategoryDAO categoryDAO;
	
	
/*	@RequestMapping("/")
	public String ShoppingCartHomePage()
	{
		return"Home";
	}
*/
	
	
	
	@RequestMapping("/")
	public ModelAndView home(){
		ModelAndView mv=new ModelAndView("Home");
		mv.addObject("message", "Thank you for visiting this URL");
		List<Category> categoryList=categoryDAO.list();
		mv.addObject("categoryList",categoryList);
		System.out.println("Size:"+categoryList.size());
		return mv;
	}
	@RequestMapping("/Login")
	public ModelAndView Login()
	{
		ModelAndView mv=new ModelAndView("Login");
		mv.addObject("UserClickedLoginHere", "true");

		return mv;


	}
	
	@RequestMapping("/Register")
	public ModelAndView Register(){
		ModelAndView mv=new ModelAndView("Registration");
		mv.addObject("UserClickedRegisterHere", "true");


		return mv;

		
	}
	
	
	}
