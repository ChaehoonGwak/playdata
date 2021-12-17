package encore.factory;

import java.util.HashMap;
import java.util.Map;

import encore.bbs.ctrl.ListCtrl;
import encore.ctrl.util.Controller;
import encore.intro.ctrl.IndexCtrl;
import encore.user.ctrl.JoinCtrl;
import encore.user.ctrl.LoginCtrl;
import encore.user.ctrl.LogoutCtrl;
import encore.user.ctrl.RegisterCtrl;



public class BeanFactory {
	private static BeanFactory instance ; 
	private Map<String , Controller> map ; 
	private BeanFactory() {
		map = new HashMap<>() ; 
		///////////////////////////////
		map.put("/pjt/index.encore", new IndexCtrl()) ;
		map.put("/pjt/login.encore", new LoginCtrl()) ;
		map.put("/pjt/logout.encore", new LogoutCtrl()) ;
		map.put("/pjt/registerForm.encore", new RegisterCtrl()) ;
		map.put("/pjt/register.encore", new JoinCtrl()) ;
		map.put("/pjt/list.encore", new ListCtrl()) ;
		
		
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
