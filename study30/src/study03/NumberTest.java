package study03;

public class NumberTest {
	
	static void plusNum(Number x) {
		x.num += 10;
	}

	public static void main(String[] args) {
		Number ob = new Number(10);
		plusNum(ob);
		System.out.println(ob.num);
	}

}
