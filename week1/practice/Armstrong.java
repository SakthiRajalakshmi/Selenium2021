package week1.practice;

public class Armstrong {

	public static void main(String[] args) {
		// 153=1*1*1+5*5*5+3*3*3 should be the number itself, for loop doesnt work for this program.becausee when the number is 
		int num=153;
		int sum=0;
		while(num>0) {
			
			
			int q=num/10;
			
			int r=num%10;
			System.out.println(r);
			sum=sum+r*r*r;
			System.out.println(sum);
			num=q;
		}
		
		System.out.println(sum);

	}

}
