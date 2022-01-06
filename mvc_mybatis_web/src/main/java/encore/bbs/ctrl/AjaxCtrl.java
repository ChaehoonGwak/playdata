package encore.bbs.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import encore.bbs.model.vo.BbsVO;
import encore.bbs.model.vo.FilterVO;
import encore.bbs.service.BbsService;
import encore.bbs.service.BbsServiceImpl;

@WebServlet("/search.ajax")
public class AjaxCtrl extends HttpServlet {
	private BbsService service ;
	public AjaxCtrl() {
		service =  new BbsServiceImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>> ajax ctrl ");
		String condition = request.getParameter("condition");
		String keyword = request.getParameter("keyword");
		
		System.out.println("param >>> "+condition);
		System.out.println("param >>> "+keyword);

		//JSONObject jObj = new JSONObject(bbs);
		
		FilterVO filter = new FilterVO(condition, keyword) ;
		List<Object> list = service.searchService(filter);
		JSONArray jAry = new JSONArray(list);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(jAry.toString());
	}

}
