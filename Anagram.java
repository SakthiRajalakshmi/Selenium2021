package week1.assignment;

import java.util.Arrays;//same set of characters

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1= "stops";
		String text2="potss";
		if(text1.length()==text2.length()) {
			
			
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			Arrays.parallelSort(ch1);
			System.out.println(ch1);
			System.out.println(ch2);
			Arrays.parallelSort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("not Anagram");
			}

	}
		else
			System.out.println("not valid");

}
}
