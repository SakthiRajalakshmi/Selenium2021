package week1.day2;

public class Armstrongnumber {

	public static void main(String[] args) {
		int input=153;
		int calculated=0;
		int original=input;
		int remainder;
		while(input>0) {
			remainder=input%10;
			
			input=input/10;
			
			calculated=calculated+remainder*remainder*remainder;
		
		}
		if(original==calculated) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not Armstrong num");
		}
				
			
	     
			
				
		// TODO Auto-generated method stub

	}

}
