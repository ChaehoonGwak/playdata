package mypack;

import java.util.Scanner; // Scanner를 쓰기 위한 import

public class EvenOdd {
	public static void main(String[] args) {
		int number;
		// 입력받는 객체 Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = input.nextInt(); // 정수 입력
		
		// 조건문을 통하여 짝수 홀수 판별하여 출력
		if(number % 2 == 0) {
			System.out.println("입력된 정수는 짝수입니다.");
		} else {
			System.out.println("입력된 정수는 홀수입니다.");
		}
		
		System.out.println("프로그램이 종료되었습니다. ");
	}
}
