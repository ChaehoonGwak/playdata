package mypack;

import java.util.Scanner;

public class Bonus {
// 실적 목표로 초과한 금액의 10%를 성과급으로 받는 프로그램을 작성
	public static void main(String[] args) {
		final int target = 1000; // 상수는 final로 선언
		int mysales;
		int bonus;
		String result;

		Scanner in = new Scanner(System.in);
		System.out.println("실적을 입력하세요");
		mysales = in.nextInt();
		
		if(mysales >= target) {
			result = "실적달성";
			bonus = (mysales - target) / 10;
		}else {
			result = "실적달성 못함";
			bonus = 0;
		}
		
		System.out.println(result + "\n" + "보너스" + bonus);
	}
}
