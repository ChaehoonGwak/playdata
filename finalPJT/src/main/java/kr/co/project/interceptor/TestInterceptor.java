package kr.co.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TestInterceptor extends HandlerInterceptorAdapter{
	/*
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	throws Exception {
		System.out.println(">>>>>>>>>> interceptor preHandle");
		response.sendRedirect("sign-in"); 
		return false ;
	}
	*/
	@Override
	public void postHandle(	HttpServletRequest request, 
							HttpServletResponse response, 
							Object handler,
							ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>> interceptor post");
	}
}


