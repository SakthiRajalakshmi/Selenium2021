package week1.assignment;

public class ReverseString {

	public static void main(String[] args) {
		String test="feeling good";
				int m=test.length();
		//System.out.println(m);
		//char c=test.charAt(3);
		//System.out.println(c);
		for(int i=0;i<m;i++) {
			System.out.print(test.charAt(i));
			
		}
		for(int j=m-1;j>=0;j--) {
			System.out.print(test.charAt(j));
		}
	}

}
