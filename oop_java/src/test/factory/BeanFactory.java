package test.factory;

import java.util.HashMap;
import java.util.Map;

import test.model.util.LTV;
import test.model.util.STV;
import test.model.util.TV;

public class BeanFactory {
	
	private static BeanFactory instance ;
	private Map<String, TV> ary	;
	
	private BeanFactory() {
		ary = new HashMap<String, TV>()	;
		ary.put("samsung",	new STV()	) ;
		ary.put("lg", 				new LTV()		) ;
	}
	
	public synchronized static BeanFactory getInstance() {
		if(instance == null) {
			instance = new BeanFactory();
		}
		return instance ;
	}
	
	public TV getBrand(String key) {
		TV tv = ary.get(key);
		return tv	;
	}

}
