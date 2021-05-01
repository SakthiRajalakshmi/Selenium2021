package week1.practice;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str= "We learn java basics as part of java sessions in java week1";
		String[] word=str.split(" ");
		String str1="";
		int count=0;
		for(int i=0;i<word.length;i++) {
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count=count+1;
					
					str1=word[i];
					System.out.println(str1);
					
					
					
				}
				
					
			}
			
				
			}
		if(count>1) 
			System.out.println(str.replaceAll(str1," "));
			//System.out.println(word[i]);	
			
			
			
			
			
		}
	}

		
		



