package study01;

public class Car {
	
	String company = "Hyundai";
	String model;
	int max_spd; //�ְ��ӵ�
	int cur_spd; //�����ӵ�
	int gas;
	
	Car(String m, int m_s){
		this.model = m;
		this.max_spd = m_s;
	}
	
	void set_cs(int scan){ //����ӵ� ��ĵ ( int scan ) << �Է¹ޱ�
		cur_spd = scan ;
	}
	
	void set_gas(int gas_s) {
		gas = gas_s;
	}
	
	boolean isEmptyGas() {
		if(this.gas == 0) {
			System.out.println("������ �����ϴ�.");
			return true; // �� ������ �����ϰ� ���� �� return ��� ���� ��
		}else {
			System.out.println("������ �����ֽ��ϴ�");
			return false; // ���Ϲ� ���� �ٿ� ����� ���๮�� ������� �ʴ´�.
		}
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.printf("���� ������ �����մϴ�. ���� �ӵ��� %d km/s , ���� �ܷ��� %d �����Դϴ�", cur_spd , gas );
				if(cur_spd < 60) {
					cur_spd += 10;
				}
				return;
			}else {
				System.out.println("���� ������ ����ϴ�. ���� �ܷ� %d ����", gas);
			}
		}
	}
	
	
 	

}