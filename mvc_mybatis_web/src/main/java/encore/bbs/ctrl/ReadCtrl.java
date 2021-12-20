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

public class ReadCtrl implements Controller{
	private BbsService service	;
	public ReadCtrl() {
		service = new BbsServiceImpl();
	}

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("read ctrl execute");
		int seq = Integer.parseInt(request.getParameter("seq"));
		BbsVO bbs = new BbsVO();
		bbs.setSeq(seq);
		System.out.println("param >>>> "+bbs);
		Object obj = service.readService(bbs);
		System.out.println(">>> ctrl result"+obj);
		
		request.setAttribute("bbs", obj);
		return new View("read.jsp", true);
	}

}
