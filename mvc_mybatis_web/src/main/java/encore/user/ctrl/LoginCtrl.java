package encore.user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		UserVO user = service.loginService(param);
		View view= new View();
		if(user != null) {
			view.setPath("ok.jsp"); view.setSend(true);
		}else {
			view.setPath("error.jsp"); view.setSend(true);
		}
		
		return view;
	}

}
