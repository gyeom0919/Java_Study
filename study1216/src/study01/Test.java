package study01;

public class Test {

	public static void main(String[] args) {

		String str = new String("�ڹ� �ʹ� ���ƿ�!!!");
		String s = new String("�ڹ� !!!");
		
		System.out.println(str.length()); // ���� [0,1,2,3,4]
		System.out.println(str.charAt(3)); // ���°�� �ִ���
		System.out.println(str.equals(s)); // str�� s�� ������
		int i = 100; 
		String s2 = String.valueOf(i);// i�� String���� ��ȯ
		System.out.println(s2 + 100); // String 100 + 100
		
		System.out.println(str.substring(3)); // 3��°���� ��� ���
		System.out.println(str.substring(3,5)); // 3��°���� 5-1 ������ ��� ���
		
		System.out.println(s.trim()); // �A�ڿ� �ִ� ��������
		System.out.println(str.indexOf("��")); // "��"�� ���°�� �ִ���
	}

}