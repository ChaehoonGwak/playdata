package test.model.util;

public class Bird extends Animal {

	@Override
	public void fly() {
		System.out.println("새가 난다");
	}

	@Override
	public void takeoff() {
		System.out.println("새가 이륙한다");

	}

	@Override
	public void landing() {
		System.out.println("새가 착륙한다");

	}

}
