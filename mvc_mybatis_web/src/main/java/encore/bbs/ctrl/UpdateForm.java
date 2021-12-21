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

public class UpdateForm implements Controller{
	private BbsService service	;
	public UpdateForm() {
		service = new BbsServiceImpl();
	}

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>> ctrl updateForm execute");
		int seq = Integer.parseInt(request.getParameter("seq"));
		BbsVO bbs = new BbsVO();
		bbs.setSeq(seq);
		System.out.println("param >>> "+bbs);
		
		Object obj = service.readService(bbs);
		request.setAttribute("bbs", obj);
		
		return new View("update.jsp", true);
	}

}
