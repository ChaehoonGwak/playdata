package encore.factory;

import java.util.HashMap;
import java.util.Map;

import encore.bbs.ctrl.ListCtrl;
import encore.bbs.ctrl.PostCtrl;
import encore.bbs.ctrl.PostForm;
import encore.bbs.ctrl.ReadCtrl;
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
		map.put("/pjt/bbs/list.encore", new ListCtrl()) ;
		map.put("/pjt/bbs/postForm.encore", new PostForm()) ;
		map.put("/pjt/bbs/post.encore", new PostCtrl()) ;
		map.put("/pjt/bbs/read.encore", new ReadCtrl()) ;
		
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
