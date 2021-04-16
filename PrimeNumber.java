package week1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int m=0;
		
		int in=1;
		m=in/2;
		if(in==0||in==1)
			System.out.println("not a prime number");
		int flag=0;
		for(i=2;i<m;i++) {
			if(in%i==0) {
				System.out.println("not a prime");
			flag=flag+1;
			break;
			}
		}
		if(flag==0)
			System.out.println("it is prime number");
		}
	}
