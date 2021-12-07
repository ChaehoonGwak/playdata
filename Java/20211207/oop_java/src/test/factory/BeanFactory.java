package test.factory;

public class BeanFactory {
	
	private static BeanFactory instance ;
	
	private BeanFactory() {
		
	}
	
	public synchronized static BeanFactory getInstance() {
		if(instance == null) {
			instance = new BeanFactory();
		}
		return instance ;
	}

}
