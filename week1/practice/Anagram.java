package week1.practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str = "stops";
		String str1 = "spots";
		//int count = 0;
		int len1=str.length();
		int len2=str1.length();
		if(len1==len2)
		{
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		
		
		Arrays.sort(ch);
		System.out.println(ch);
		Arrays.sort(ch1);
		System.out.println(ch1);
		if(Arrays.equals(ch1, ch))
		{
		System.out.println("Anagram");
		}
		else
		
			{
			System.out.println("not an Angram");
			}
		
		}
		else
			System.out.println("invalid");
		
			
		
		
		/*for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch1.length; j++) {
				if (ch[i] != ch1[j])
					count = count + 1;
				else
					count=0;

			}

		}
		if(count==0)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}*/
	}

	}

