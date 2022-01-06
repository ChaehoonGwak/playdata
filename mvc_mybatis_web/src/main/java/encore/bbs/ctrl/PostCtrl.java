package encore.bbs.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.bbs.model.vo.BbsVO;
import encore.bbs.service.BbsService;
import encore.bbs.service.BbsServiceImpl;
import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class PostCtrl implements Controller{
	private BbsService service	;
	public PostCtrl() {
		service = new BbsServiceImpl();
	}
	
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>> post ctrl execute");
		
		request.setCharacterEncoding("UTF-8");
		
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		BbsVO bbs = new BbsVO();
		bbs.setSubject(subject);
		bbs.setContent(content);
		bbs.setWriter(writer);
		System.out.println("param >>> "+bbs);
		
		// post
		int flag = service.postService(bbs);
		System.out.println("ctrl result >>> "+flag);
		View view = new View();
		if(flag != 0) {
			view.setPath("list.encore")	;	view.setSend(false);
		}else {
			view.setPath("postForm.encore")	;	view.setSend(true);
		}
		return view;
	}

}
