package week1.practice;

public class OddIndexUpper {

	public static void main(String[] args) {
		String str="changeme";
		String str1="";
		//char m;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i%2!=0) {
			str1=str1+Character.toUpperCase(ch[i]);
			System.out.println(str1);
			}
			else {
				str1=str1+ch[i];
			System.out.println(str1);
			}
			
			
			
		}
		System.out.println(str1);

	}

}
