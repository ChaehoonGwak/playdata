package encore.bbs.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class PostForm implements Controller{

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>> ctrl PostForm execute");
		return new View("post.jsp", true);
	}

}
