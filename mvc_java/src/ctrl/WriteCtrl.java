package ctrl;

import ctrl.util.Controller;
import model.vo.BbsVO;
import service.BbsService;
import service.BbsServiceImpl;

public class WriteCtrl implements Controller {
	
	// DI (Dependency Injection)
	private BbsService service	;
	public WriteCtrl() {
		service = new BbsServiceImpl();
	}

	@Override
	public Object execute(Object obj) {
		System.out.println("write controller execute");
		return  service.insertBiz(obj); 
	}
	

}
