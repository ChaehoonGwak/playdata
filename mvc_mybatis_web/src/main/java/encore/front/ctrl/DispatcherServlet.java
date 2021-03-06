package encore.front.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;
import encore.factory.BeanFactory;

@WebServlet("*.encore")
public class DispatcherServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		process(request , response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		process(request , response);
	}
	public void process(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("front controller"); 
		String uri = request.getRequestURI() ; 
		System.out.println("client request : "+uri);
		
		// 팩토리를 통한 컨트롤러와 관계형성 및 화면 분기
		BeanFactory factory = BeanFactory.getInstance() ; 
		Controller ctrl = factory.getBean(uri) ; 
		View view = ctrl.execute(request, response) ; 
		if(view.isSend()) {
			RequestDispatcher rd = 
					request.getRequestDispatcher(view.getPath()) ; 
			rd.forward(request, response);
		}else {
			response.sendRedirect(view.getPath());
		}
	}

}





