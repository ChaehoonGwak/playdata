package ctrl;

import ctrl.util.Controller;
import service.BbsService;
import service.BbsServiceImpl;

public class SelectCtrl implements Controller{
	
	private BbsService service ;
	public SelectCtrl() {
		service = new BbsServiceImpl();
	}
	
	@Override
	public Object execute(Object obj) {
		System.out.println("select ctrl execute~~");
		return service.selectBiz();
	}

}
