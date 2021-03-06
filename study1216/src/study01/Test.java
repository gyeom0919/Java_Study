package study01;

public class Test {

	public static void main(String[] args) {

		String str = new String("자바 너무 좋아요!!!");
		String s = new String("자바 !!!");
		
		System.out.println(str.length()); // 길이 [0,1,2,3,4]
		System.out.println(str.charAt(3)); // 몇번째에 있는지
		System.out.println(str.equals(s)); // str과 s가 같은지
		int i = 100; 
		String s2 = String.valueOf(i);// i를 String으로 변환
		System.out.println(s2 + 100); // String 100 + 100
		
		System.out.println(str.substring(3)); // 3번째부터 모두 출력
		System.out.println(str.substring(3,5)); // 3번째부터 5-1 번까지 모두 출력
		
		System.out.println(s.trim()); // 얖뒤에 있는 공백제거
		System.out.println(str.indexOf("좋")); // "좋"가 몇번째에 있는지
	}

}
