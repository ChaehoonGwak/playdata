package encore.bbs.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import encore.bbs.model.vo.BbsVO;
import encore.bbs.service.BbsService;
import encore.bbs.service.BbsServiceImpl;
import encore.ctrl.util.Controller;
import encore.ctrl.view.View;
import encore.user.service.UserService;
import encore.user.service.UserServiceImpl;

public class ListCtrl implements Controller{
	
	private BbsService service ;
	public ListCtrl() {
		service = new BbsServiceImpl();
	}

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>> list ctrl execute");
		
		List<Object> list = service.listService();
		
		for(Object obj : list) {
			System.out.println((BbsVO)obj);
		}
		
		View view = new View();
		
//		HttpSession session = request.getSession(true);
//		session.setAttribute("boards" , list);
		
		request.setAttribute("boards", list);
		view.setPath("bbs_index.jsp");
		view.setSend(true);
		
		return view;
	}

}
