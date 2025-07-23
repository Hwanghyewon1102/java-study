package Homework;

public class Homework1 {

	public static void main(String[] args) {
		int hight[] = { 152, 180, 165, 158, 171 };
		int min = hight[0];
		
		
		
		for (int i = 0; i < hight.length - 1; i++) {
			for(int j = hight[i]; j < hight.length - 1 - i; j++) {
				min++;
				
				if(min < hight[i]) {
					min = min;
				}
				if(min > hight[i]) {
					min = hight[i];
					
					
					
				}
			}
			
		}
		
		for(int i = 0; i < hight.length; i++)
		System.out.print(hight[i] + ", ");

	}

}
