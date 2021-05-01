package week1.practice;

public class CharOccurance {

	public static void main(String[] args) {
		String str="welcome to chennai";
		char[] ch=str.toCharArray();
		int m=ch.length;
		int count=0;
		System.out.println(m);
		//int count=0;
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<m;j++) {
				if(ch[i]==ch[j])
		      System.out.println(ch[i]);
			}
				if(ch[i]=='e')
					count=count+1;
				
				
		}
		if(count>0)
			System.out.println(count);
	

	}

}
