package week1.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		//char[] ch=str.toCharArray();
		String rev="";
		//int l=str.length();
		
			
			for(int j=str.length()-1;j>=0;j--) {
			 rev=rev+str.charAt(j);
			 System.out.println(rev);
			 
			
				
		}
			if(str.equals(rev))
				System.out.println("It is a Palindrome");
			else
				System.out.println("not a Palindrome");
				
		
		
				

	}

}
