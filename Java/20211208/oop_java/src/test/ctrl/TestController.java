package test.ctrl;

import test.model.vo.TestVO;
import test.service.TestServiceImpl;

public class TestController {
	
	private TestServiceImpl service ;

	public TestController() {
		service = new TestServiceImpl();
	}
	
	// action = c, r, u, d
	public int execute(String action , TestVO vo) {
		int flag = 0 ; 
		if (action == "c") {
			flag = service.insertService(vo) ; 
		}
		return flag ; 
	}
	
	
	
	 
	
	
	
	
}
