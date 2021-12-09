import test.factory.BeanFactory;
import test.model.util.LTV;
import test.model.util.STV;
import test.model.util.TV;

public class InterfaceMain {

	public static void main(String[] args) {
//		TV tv = new STV();
//		tv.turnOn();
		
		BeanFactory factory = BeanFactory.getInstance()	;
		TV tv = factory.getBrand("lg")	;
		tv.turnOn()	;
//		System.out.println("address - "+factory);
//		
//		BeanFactory factory1 = BeanFactory.getInstance()	;
//		System.out.println("address - "+factory1);

	}

}
