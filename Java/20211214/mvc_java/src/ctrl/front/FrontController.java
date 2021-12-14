package ctrl.front;

import ctrl.util.BeanFactory;
import ctrl.util.Controller;

public class FrontController {
	private BeanFactory factory	;
	
	public FrontController() {
		factory = BeanFactory.getInstance();
	}
	
	public Object requestProc(int code, Object obj) {
		Controller ctrl = factory.getBean(code) ; 
		return ctrl.execute(obj);
	}

}
