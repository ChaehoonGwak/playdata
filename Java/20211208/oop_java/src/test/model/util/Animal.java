package test.model.util;

public abstract class Animal {

	private int legs	;
	public void eating(String food) {
		System.out.println(food+"를 좋아합니다")		;	
	}
	
	public abstract void fly()		;
	public abstract void takeoff()	;
	public abstract void landing()	;
}
