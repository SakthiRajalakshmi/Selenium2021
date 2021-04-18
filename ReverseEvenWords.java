package week1.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "I am learning Selenium in April Batch";
		String[] str1 = str.split("\\s");

		String str2 = "";
		String str3 = "";
		String str4="";
		int len1 = str1.length;
		System.out.println(len1);
		for (int i = 0; i < len1; i++) {
			// System.out.println(str1[i]);
			if (i % 2 != 0) {
				str2 = str1[i];
				System.out.println(str2);

				for (int j = str2.length() - 1; j >= 0; j--) {
					str3 = str3 + str2.charAt(j);
					//System.out.println(str3);
				}

			}
			else 
				str3=str3+" "+str1[i]+" ";
				System.out.println(str3);
			  

		}
		  

	}


}
