package study;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 >> ");
		
		int num;
		num = sc.nextInt();
		
		if(num >= 90) {
			System.out.println("점수는 100~90점 입니다");
			System.out.println("등급은 A등급입니다.");
		}else if(num >= 80){
			System.out.println("점수는 89~80점 입니다");
			System.out.println("등급은 B등급입니다.");
		}else if(num >= 70){
			System.out.println("점수는 79~70점 입니다");
			System.out.println("등급은 C등급입니다.");
		}else {
			System.out.println("점수는70점 미만입니다");
			System.out.println("등급은 D등급입니다.");
		}
	}

}
