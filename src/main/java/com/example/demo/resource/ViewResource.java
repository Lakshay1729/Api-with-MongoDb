package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.document.Users;
import com.example.demo.request.UserNewRequest;
import com.example.demo.service.UserService;

@Controller
public class ViewResource {

	@Autowired
	private UserService userService;
	
	@GetMapping("/index")
	public String getData(Model model){
		
		
		model.addAttribute("at",userService.getAllUsers());
//		System.out.println(userService.getAllUsers().get(0).getDescription());
		return "/index";
	}
	
	@RequestMapping(value = "/add-user",method=RequestMethod.GET)
	public ModelAndView showForm(
			Model model) {
//	  logger.info("first Name : {}", firstName);
//	  logger.info("Last Name : {}", lastName);
//	  logger.info("Role: {}", role);
//		UserNewRequest userRequest=new UserNewRequest();
//		userRequest.setDescription(description);
//		userRequest.setName(name);
//	    System.out.println(description+"kak");
//		userService.addUser(userInfo);
		 ModelAndView mv = new ModelAndView();
		 
		 model.addAttribute("userInfo", new Users());
		 
		 
		    mv.setViewName("add-user");
		    return mv;
		
	}
	
	@RequestMapping(value = "/create-user",method=RequestMethod.POST)
	public String createUser(
			@ModelAttribute UserNewRequest userInfo,
			Model model) {
//	  logger.info("first Name : {}", firstName);
//	  logger.info("Last Name : {}", lastName);
//	  logger.info("Role: {}", role);
//		UserNewRequest userRequest=new UserNewRequest();
//		userRequest.setDescription(description);
//		userRequest.setName(name);
//	    System.out.println(description+"kak");
		userService.addUser(userInfo);
//		 ModelAndView mv = new ModelAndView();
//		 
//		 model.addAttribute("userInfo", new Users());
//		 
//		 
//		    mv.setViewName("add-user");
		    return "redirect:/index";
	}
	
}
