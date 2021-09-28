package mypack;

import java.util.Scanner;

public class Grade {
	// 성적이 90점 이상이면 A학점 80점 이상이면 B학점 70점 이상이면 C학점
	public static void main(String[] args) {
		int score;
		String grade = ""; // 변수 초기화
		Scanner in = new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		score = in.nextInt();
		
		// 조건문으로 score에 따른 학점을 매김
		if(score >= 90) {
			grade = "A";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else if(score >= 70) {
			grade = "C";
		}
		
		System.out.print("당신의 학점은: " + grade);
	}

}
