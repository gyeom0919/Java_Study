package study;

public class Exam05 {

	public static void main(String[] args) {

		int[][] array = { {95,86} , {93,92,96} , {78,83,93,87,88} };
		
		int sum = 0;
		
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				
					sum += array[i][j];
			}
			
			System.out.println("sum : " + sum);
			
				} 
		
		
	
		}	
	}


