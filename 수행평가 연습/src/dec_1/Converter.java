package dec_1;

import java.util.Scanner;

public abstract class Converter {
	
	protected abstract double convert(double src);
	protected abstract String getInString ();
	protected abstract String getOutString();
	protected double ratio; 
	protected abstract void setratio();
		

	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getInString() + "을" + getOutString() + "로 바꿉니다.");
		System.out.print(getInString() + "을 입력하세요 >>> ");
		double val = scanner.nextDouble();
		double result = convert(val);
		System.out.println("변환 결과 :" + result + getOutString() + "입니다.");
	}

}
