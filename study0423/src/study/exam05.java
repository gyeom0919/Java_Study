package study;

public class exam05 {

	public static void main(String[] args) {

		int a= (int) (Math.random()*4)+8;
		
		System.out.println("[현재시간"+a+"시]");
		
		switch(a) {
		
		case(8):
			System.out.println("출근합니다.");
		break;
		case(9):
			System.out.println("회의를 합니다.");

		case(10):
			System.out.println("업무를 봅니다.");

		default:
			System.out.println("외근을 나갑니다.");
		}
			
	}

}
