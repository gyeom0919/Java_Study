package sec01.exam01;

public class VariableExam001 {

	public static void main(String[] args) {
		
		int x = 0b1100;
		int y = 014;
		int z = 0xc;
		
		
		char ch1 = 'A';
		char ch2 = 97;
		
		String str1 = "홍길동";
		String str2 = "홍길동 \n\"안녕\"";
		
		float d1 = 1e3f;
		long l = 5000000000L;
		float f = l; 
		
		double d2 = 3.14;
		int i1 = (int)d2;
		//강제로 변환할때 () 는 캐스팅 연산자
		
		//System.out.println(x+" "+y+" "+z+" ");
		//System.out.println(ch2);
		System.out.println(i1);
	}

}
