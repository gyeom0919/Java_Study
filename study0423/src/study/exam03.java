package study;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� >> ");
		
		int num;
		num = sc.nextInt();
		
		if(num >= 90) {
			System.out.println("������ 100~90�� �Դϴ�");
			System.out.println("����� A����Դϴ�.");
		}else if(num >= 80){
			System.out.println("������ 89~80�� �Դϴ�");
			System.out.println("����� B����Դϴ�.");
		}else if(num >= 70){
			System.out.println("������ 79~70�� �Դϴ�");
			System.out.println("����� C����Դϴ�.");
		}else {
			System.out.println("������70�� �̸��Դϴ�");
			System.out.println("����� D����Դϴ�.");
		}
	}

}