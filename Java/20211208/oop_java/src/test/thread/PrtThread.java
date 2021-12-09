package test.thread;

public class PrtThread implements Runnable {
	private char charValue;
	private Prt monitor;

	public PrtThread() {

	}

	public PrtThread(char charValue, Prt monitor) {
		this.charValue 	= charValue	;
		this.monitor 		= monitor		;
	}

	public void run() {
		synchronized (monitor) {

			for (int i = 0; i < 10; i++) {
				monitor.printChar(charValue);
				System.out.println();
			}
		}
	}

}
