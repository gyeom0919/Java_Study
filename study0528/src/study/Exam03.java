package study;

public class Exam03 {

	public static void main(String[] args) {

		// String[] str = {"������","������", "�۾���" };
		String[] str = new String[3];
		str[0] = "������";
		str[1] = "������";
		str[2] = new String("������");
		
		for(int i=0; i<str.length; i++) {
			System.out.printf("str[%d] = %s\n", i,str[i]);
		}
		System.out.println(str[0] == str[1]);
		System.out.println(str[1] == str[2]);
		System.out.println(sr[0].equals(str[1]));
	}
	

}