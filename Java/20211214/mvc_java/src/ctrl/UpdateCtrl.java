package ctrl;

import ctrl.util.Controller;
import service.BbsService;
import service.BbsServiceImpl;

public class UpdateCtrl implements Controller {
	
	private BbsService service ;
	public UpdateCtrl() {
		service = new BbsServiceImpl();
	}

	@Override
	public Object execute(Object obj) {
		System.out.println("update ctrl execute~~");
		return service.updateBiz(obj);
	}
	

}
