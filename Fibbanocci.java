package week1.day1;

public class Fibbanocci {
	//int sum;

	public static void main(String[] args) {
		int range=6;
		int firstSum=0;
		int secondSum=1;
		int sum;
		
		System.out.println(firstSum);
		System.out.println(secondSum);
		for(int i=1;i<=range;i++) {
					

					sum=firstSum+secondSum;
					firstSum=secondSum;
					
			
					secondSum=sum;

					System.out.println(sum);
					
				}
					
		
				
			}

}
