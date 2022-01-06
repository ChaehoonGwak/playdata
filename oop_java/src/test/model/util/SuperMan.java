package test.model.util;

public class SuperMan extends Animal	{

	@Override
	public void fly() {
		System.out.println("슈퍼맨이 난다");
	}

	@Override
	public void takeoff() {
		System.out.println("슈퍼맨이 이륙한다");
	}

	@Override
	public void landing() {
		System.out.println("슈퍼맨이 착륙한다");
	}

	
}
