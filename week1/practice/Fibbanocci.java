package week1.practice;
//0 +1+ 1+ 2 3 5 8 13 should be o/p
public class Fibbanocci {

	public static void main(String[] args) {
		int num=8;
		int firstnumber=0;
		int secondnumber=1;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		int m=num-2;
		int out=0;
		for(int i=1;i<=m;i++)
		{
			out=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=out;
			
			System.out.println(out);
		}
		

	}

}
