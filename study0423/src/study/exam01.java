package study;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�>>");
		
		int num;
		num = sc.nextInt();
		if(num >= 90) {
			System.out.println("90���� ũ�ų� ����");
			System.out.println("����� A�Դϴ�.");
		}
		if(num < 90) {
			System.out.println("90���� �۽��ϴ�");
			
		}
		System.out.println("����� B�Դϴ�.");
				
		
		
	}

}