package study;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int min=a;
		
		if(a>b) {
			min=b;
		}if(b>c) {
			min=c;
		}
		
		System.out.print("�ּڰ�="+min);
	}

}
