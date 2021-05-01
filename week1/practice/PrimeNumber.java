package week1.practice;
//the number which is only divided by itself and 1. 2 is the only even prime number.
public class PrimeNumber {

	
	public static void main(String[] args) {
		
		
		int num=4;
		int m=num/2;
		switch(num) 
		{
		case 2:
			System.out.println("prime number");
		break;
		}
		
		int count=0;
	
		for(int i=2;i<=m;i++) {
			
			if(num%i==0)
				break;
			else
				count=count+1;
				
		
		}
		if(count>0)
			System.out.println("prime number");
		else
			System.out.println("not a prime");
			
		}

	}


