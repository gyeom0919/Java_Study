package study;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		boolean run = true;
		int don = 0;
		Scanner sc= new Scanner(System.in);
		
		while(run ) { 
			System.out.println("------------------------");
			System.out.println("1.예금    2.출금    3.잔고    4.종료");
			System.out.println("------------------------");
			System.out.println("선택>> ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("예금액>>");
				don += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>>");
				don -= sc.nextInt();
				break;
			case 3:
				System.out.print("잔고>>");
				System.out.print(don);
				break;
					
			default :
				run = false;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
