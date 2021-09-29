package mypack;

public class Ex04_06 {

	public static void main(String[] args) {
		int a = 99;
		
		System.out.printf(" AND 연산 : %s \n", (a >= 100) && (a <= 200));
		System.out.printf(" OR 연산 : %s \n", (a >= 100) || (a <= 200));
		System.out.printf(" NOT 연산 : %s \n", !(a == 100));

		System.out.println(3 & 10);
		System.out.println(0b00000011 & 0b00001010);
		System.out.println(3 | 10);
		System.out.println(0b00000011 | 0b00001010);
		System.out.println(3 ^ 10);
		System.out.println(0b00000011 ^ 0b00001010);
	}//  00000011 -> 3
	// & 00001010 -> 10
	//    00000010 -> 2
	// |  00001011 -> 11
	// ^ 00001010 -> 10 XOR
	//    00001001 -> 9

}
