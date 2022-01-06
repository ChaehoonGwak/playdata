package test.view;

import java.util.Scanner;

import test.ctrl.TestController;
import test.model.vo.TestVO;

public class TestView {
	// Dependency Injection
	private TestController ctrl	;
	public TestView() {
		ctrl = new TestController();
	}
	
	
	public void mainMenu() {
		System.out.println(">> Play Data MVC <<");
		System.out.println("1. 등록");
		System.out.println("99. 종료");
		System.out.print("INPUT NUMBER >> ");
		Scanner scan = new Scanner(System.in)	;
		int number = scan.nextInt()	;
		switch(number) {
			case 1	:
				enroll()	;
				break;
			case	99	:
				System.out.println("시스템을 종료합니다!!");
				System.exit(1);
		}
	}
	
	public void enroll() {
		Scanner scan = new Scanner(System.in)	;
		System.out.print("이름 >> ");
		String name = scan.next();
		System.out.print("나이 >> ");
		int age = scan.nextInt();
		System.out.print("주소 >> ");
		String addr = scan.next();
		
		TestVO user = new TestVO(name, age, addr)	;
		int flag = ctrl.execute("c", user)		;
		if(flag != 0) {
			System.out.println("1 row insert OK");
		}else {
			System.out.println("1 row insert error");
		}
		
	}

}
