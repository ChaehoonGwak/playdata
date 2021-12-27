package kr.co.project.user.ctrl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.project.user.model.vo.UserDTO;
import kr.co.project.user.service.UserService;

@Controller
public class UserCtrl {
	
	@Resource(name="userS")
	private UserService service ; 
	
	
	@RequestMapping(value = "sign-in" , method = RequestMethod.GET) 
	public String loginForm() {
		System.out.println(">>> user ctrl loginForm");
		return "login" ; 
	}
	/*
	@RequestMapping(value = "login" , method = RequestMethod.POST) 
	public String login(UserDTO user , HttpSession session) {
		System.out.println(">>> user ctrl login");
		System.out.println(">>> param "+user); 
		
		Object obj = service.loginService(user) ; 
		session.setAttribute("loginUser", obj); 
		return "home" ; 
	}
	*/
	@RequestMapping(value = "login" , method = RequestMethod.POST) 
	public void login(UserDTO user , Model model) {
		System.out.println(">>> user ctrl login");
		System.out.println(">>> param "+user); 
		
		Object obj = service.loginService(user) ; 
		model.addAttribute("loginUser", obj) ;  
	 
	}
	/*
	@RequestMapping(value = "logout" , method = RequestMethod.GET) 
	public String logout(HttpSession session) {
		System.out.println(">>> user ctrl logout");
		session.invalidate(); 
		return "redirect:/" ; 
	}
	*/
	@RequestMapping(value = "logout" , method = RequestMethod.GET) 
	public void logout() {
		System.out.println(">>> user ctrl logout");
	}
	
	@RequestMapping(value = "join" , method = RequestMethod.GET) 
	public String joinForm() {
		System.out.println(">>> user ctrl joinForm");
		return "join" ; 
	}
}




