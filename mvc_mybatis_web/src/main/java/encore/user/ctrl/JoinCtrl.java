package encore.user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;
import encore.user.model.vo.UserVO;
import encore.user.service.UserService;
import encore.user.service.UserServiceImpl;

public class JoinCtrl implements Controller{
	private UserService service	;
	public JoinCtrl() {
		service = new UserServiceImpl();
	}

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>> join ctrl execute");
		
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		int point = Integer.parseInt(request.getParameter("point"));
		UserVO user = new UserVO(id, pwd, name, point);
		System.out.println("param >> "+ user);
		
		// insert
		int flag = service.registerService(user);
		System.out.println("insert result >>> "+flag);
		View view = new View();
		if(flag != 0) {
			view.setPath("index.jsp");	view.setSend(false);
		}else {
			view.setPath("registerForm.encore");
			view.setSend(true);
		}
		return view;
	}

}
