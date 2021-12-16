package encore.user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;
import encore.user.model.vo.UserDTO;
import encore.user.model.vo.UserVO;
import encore.user.service.UserService;
import encore.user.service.UserServiceImpl;

public class LoginCtrl implements Controller{
	
	private UserService service;
	public LoginCtrl() {
		service = new UserServiceImpl();
	}
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>> login ctrl execute");
		String id= request.getParameter("id");
		String pwd= request.getParameter("pwd");
		System.out.println(">>> param "+id+"\t"+pwd);
		
		UserDTO param = new UserDTO(id, pwd);
		Object user = service.loginService(param);
		System.out.println(">>> result " + ((UserVO)user));
		View view= new View();
		if(user != null) {
			// 세션을 생성하여 사용자의 상태정보를 유지하는 매커니즘..
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);
			
			view.setPath("main.jsp"); view.setSend(true);
		}else {
			view.setPath("error.jsp"); view.setSend(true);
		}
		
		return view;
	}

}
