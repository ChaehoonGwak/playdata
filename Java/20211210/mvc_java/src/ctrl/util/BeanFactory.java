package ctrl.util;

import java.util.HashMap;
import java.util.Map;

import ctrl.UpdateCtrl;
import ctrl.WriteCtrl;

// 1. insert , 2. update , 3. delete , 4. list , 5. finder
public class BeanFactory {
	
	private static BeanFactory instance ;
	
	private Map<Integer, Controller> map	;

	private BeanFactory() {
		map = new HashMap<>()	;
		map.put(1, new WriteCtrl());
		map.put(2, new UpdateCtrl());
		
	}
	
	public synchronized static BeanFactory getInstance() {
		if(instance == null) {
			instance = new BeanFactory() ;
		}
		return instance	;
	}
	
	public Controller getBean(int number) {
		return map.get(number);
	}
}
