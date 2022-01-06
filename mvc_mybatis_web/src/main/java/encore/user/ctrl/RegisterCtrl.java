package encore.user.ctrl;

import java.io.IOException;

import javax.naming.ldap.Control;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class RegisterCtrl implements Controller{

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>> register ctrl execute");
		return new View("register.jsp", true);
	}

}
