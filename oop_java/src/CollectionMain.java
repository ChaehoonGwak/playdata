import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import test.model.util.LTV;
import test.model.util.STV;
import test.model.util.TV;

public class CollectionMain {

	public static void main(String[] args) {
		List<TV> list = new ArrayList<TV>()	;
		list.add(new STV())	;
		list.add(new LTV())	;
//		for(int i=0 ; i < list.size() ; i++ ) {
////			list.get(i).turnOn();
//			TV tv = list.get(i);
//			tv.turnOn();
//		}
		Iterator<TV> ite = list.iterator()	;
		while(ite.hasNext()) {
			ite.next().turnOn();
		}
	}

}
