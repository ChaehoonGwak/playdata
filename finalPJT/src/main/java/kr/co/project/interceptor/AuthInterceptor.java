package kr.co.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(">>> interceptor �������� üũ~~");
		HttpSession session = request.getSession();
		if (session.getAttribute("loginUser")==null) {
			System.out.println(">>> interceptor current user is not logined");
			
			// ������� ��û uri ���ǿ� �ɾ LoginInterceptor ���� �ش� uri �̵�
			String uri = request.getRequestURI();
			String query = request.getQueryString();
			if(query == null || query.equals("null")) {
				query = "";
			}else {
				query = "?"+query;
			}
			if(request.getMethod().equals("get")) {
				request.getSession().setAttribute("dest", uri+query);
			}else {
				request.getSession().setAttribute("dest", uri);
			}
			///

			response.sendRedirect("sign-in");
			return false;
		}
		return true;
	}
	

}
