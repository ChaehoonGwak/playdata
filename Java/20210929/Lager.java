package mypack;

import java.util.Scanner;

public class Lager {
// 두개의 정수를 입력받아서 둘 중에 큰 수를 출력하는 프로그램
	public static void main(String[] args) {
		int x, y, max;
		
		Scanner in = new Scanner(System.in);
		System.out.print("첫 번째 정수: ");
		x = in.nextInt();
		
		System.out.print("두 번째 정수");
		y = in.nextInt( );
		
		// if문 바디가 한줄일시 중괄호 생략 가능
		if(x > y) {
			max = x;
		}
		else
			max = y;
		
		System.out.println("큰 수는 " + max);
	}

}
