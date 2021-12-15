package test.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  servlet lifecycle
 *  init - (doGet|doPost) - destroy
 */
@WebServlet("/greeting")
public class TestController extends HttpServlet {
	

	@Override
	public void init() throws ServletException {
		System.out.println("ctrl init");
	}
	

	@Override
	public void destroy() {
		System.out.println("ctrl destroy");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("ctrl service");
		
		//response.sendRedirect("test.jsp");
		
				RequestDispatcher view = 
						request.getRequestDispatcher("test.jsp") ; 
				view.forward(request, response);

	}

}
