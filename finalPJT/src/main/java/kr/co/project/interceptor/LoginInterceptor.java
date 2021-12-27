package kr.co.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public void postHandle(	HttpServletRequest request, 
							HttpServletResponse response, 
							Object handler,
							ModelAndView modelAndView) throws Exception {
		
		System.out.println(">>> LoginInterceptor");
		HttpSession session = request.getSession() ; 
		ModelMap model = modelAndView.getModelMap();
		Object user = model.get("loginUser");
		if(user != null) {
			System.out.println(">>> interceptor session save");
			session.setAttribute("loginUser", user); 
			
			//response.sendRedirect("/");
			
			Object dest = session.getAttribute("dest") ;
			response.sendRedirect( dest != null ? (String)dest : "/");

		}
		
	}
}





