package week1.assignment;

public class Sum {

	public static void main(String[] args) {
		int input=123;
		int sum=0;
		while(input>0) {
			int rem=input%10;
			//System.out.println(rem);
			sum=sum+rem;
			//System.out.println(sum);
			int quo=input/10;
			input=quo;
			//System.out.println(quo);
			
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
