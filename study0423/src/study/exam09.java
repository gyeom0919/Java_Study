package study;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		
		int a;
		a = sc.nextInt();
		
			System.out.println("정수를 입력하시오 >>" + a);
			
		if(a>0) {
			System.out.println(a +"의 절댓값:" +a);
		}else {
			System.out.println(a +"의 절댓값:" + -a);
		}
			}

}
