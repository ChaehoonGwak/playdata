package encore.factory;

import java.util.HashMap;
import java.util.Map;

import encore.ctrl.util.Controller;
import encore.intro.ctrl.IndexCtrl;
import encore.user.ctrl.LoginCtrl;



public class BeanFactory {
	private static BeanFactory instance ; 
	private Map<String , Controller> map ; 
	private BeanFactory() {
		map = new HashMap<>() ; 
		///////////////////////////////
		map.put("/pjt/index.encore", new IndexCtrl()) ;
		map.put("/pjt/login.encore", new LoginCtrl()) ;
	}
	public static BeanFactory getInstance() {
		if(instance == null) {
			instance = new BeanFactory() ; 
		}
		return instance  ;
	}
	public Controller getBean(String uri) {
		return map.get(uri);
	}

}
