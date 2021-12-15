package ctrl.util;

import java.util.HashMap;
import java.util.Map;

import ctrl.DeleteCtrl;
import ctrl.ReadCtrl;
import ctrl.SearchCtrl;
import ctrl.SelectCtrl;
import ctrl.UpdateCtrl;
import ctrl.WriteCtrl;

// 1. insert , 2. update , 3. delete , 4. list , 5. read
public class BeanFactory {
	
	private static BeanFactory instance ;
	
	private Map<Integer, Controller> map	;

	private BeanFactory() {
		map = new HashMap<>()	;
		map.put(1, new WriteCtrl());
		map.put(2, new UpdateCtrl());
		map.put(3, new DeleteCtrl());
		map.put(4, new SelectCtrl());
		map.put(5, new ReadCtrl());
		map.put(6, new SearchCtrl());
		
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
