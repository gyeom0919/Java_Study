package study01;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car("IONIQ6" , 230);
		myCar.set_cs(10);
		myCar.set_gas(10);
		
		System.out.println("����ȸ��� : "+ myCar.company);
		System.out.println("�𵨸��� : "+ myCar.model);
		System.out.println("�ְ��ӵ���: "+ myCar.max_spd);
		System.out.println("����ӵ��� : "+ myCar.cur_spd);
		System.out.println("������ : "+ myCar.gas);
	
		myCar.isEmptyGas();
		
		myCar.run();
		
		
	}

}
