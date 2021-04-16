package week1.assignment;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter=0;
		int space=0;
		int num=0;
		int specialChar=0;
		char[] ch=test.toCharArray();
		int m=ch.length;
		System.out.println(m);
		for(int i=0;i<m;i++) {
			if(Character.isLetter(ch[i]))
				letter=letter+1;
			if(Character.isSpaceChar(ch[i]))
				space=space+1;
			if(Character.isDigit(ch[i]))
				num=num+1;
			else
				if(ch[i]=='$')
				specialChar=specialChar+1;
			
		}
		System.out.println("Number of Letters " + letter);
		System.out.println("Number of Digits " + num);
		System.out.println("Number of space " + space);
		System.out.println("Number of sepcialChar " + specialChar);
		
		

	}

}
