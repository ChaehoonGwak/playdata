package ctrl;

import ctrl.util.Controller;
import service.BbsService;
import service.BbsServiceImpl;

public class SearchCtrl implements Controller{
	
	private BbsService service ; 
	public SearchCtrl() {
		service = new BbsServiceImpl();
	}
	@Override
	public Object execute(Object obj) {
		System.out.println("search ctrl execute");
		System.out.println(">> ctrl "+obj) ; 
		return service.searchBiz(obj); 
	}
	
	
}
