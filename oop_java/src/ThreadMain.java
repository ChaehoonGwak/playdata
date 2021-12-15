import test.thread.Prt;
import test.thread.PrtThread;

public class ThreadMain {

	public static void main(String[] args) {
		Prt monitor = new Prt();
		
		PrtThread runn01 = new PrtThread('D', monitor);
		Thread thread01 = new Thread(runn01);
		thread01.start();
		
		PrtThread runn02 = new PrtThread('B', monitor);
		Thread thread02 = new Thread(runn02);
		thread02.start();
//		System.out.println("main start");
//		
//		PrtThread runn = new PrtThread();
////		runn.run();
//		Thread thread = new Thread(runn);
//		thread.start();
//		
//		System.out.println("main end");
	}

}
