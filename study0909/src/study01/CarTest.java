package study01;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car("IONIQ6" , 230);
		myCar.set_cs(10);
		myCar.set_gas(10);
		
		System.out.println("제조회사는 : "+ myCar.company);
		System.out.println("모델명은 : "+ myCar.model);
		System.out.println("최고속도는: "+ myCar.max_spd);
		System.out.println("현재속도는 : "+ myCar.cur_spd);
		System.out.println("가스는 : "+ myCar.gas);
	
		myCar.isEmptyGas();
		
		myCar.run();
		
		
	}

}

