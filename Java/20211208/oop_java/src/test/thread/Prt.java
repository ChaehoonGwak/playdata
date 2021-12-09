package test.thread;

public class Prt {
	public synchronized void printChar(char charValue) {
		for(int i=0 ; i < 10 ; i++) {
			System.out.print(charValue);
		}
	}

}
