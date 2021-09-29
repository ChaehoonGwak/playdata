package mypack;

public class Ex04_04 {
	public static void main(String[] args) {
		int a = 10, b;
		
		b = a++;
		System.out.printf(" %d \n", b);
		
		b = ++a;
		System.out.printf(" %d \n", b);
	}// 연산자의 종류 - 증감연산자 (++, --)
	//전위형: 연산(또는 실행) 전 증감 수행 (++변수명)
	//후위형: 연산(또는 실행) 후 증감 수행 (변수명++)
}
