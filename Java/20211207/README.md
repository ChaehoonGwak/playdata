collection API - List, Set, Map

인터페이스 vs 추상클래스
공통점:
- 객체생성이 X
- 추상메서드 구현을 강제(overriding) - 구현분만 달라져야 한다

차이점:
public abstract class clasee_name {
	public abstract void a();
	public void b() {
	}
}

public interface interface_name {
	public int AGE = 10
	상수 + 추상메서드
	public void a() ;
}

public class A extends B implements C, D, E {
}

public class A implements C, D, E {
}

public interface A {
	a();
}

public interface B enxtends A {
	b();
}

public class C implements B {
	a();
	b();
}


