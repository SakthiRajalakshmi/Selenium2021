package week1.assignment;

public class OddUpper {

	public static void main(String[] args) {
		String test="Changeme";
		char k=0;
		String replace="";
		char[]ch=test.toCharArray();
		for(char i=0;i<ch.length;i++) {
			if (i%2!=0){
				
				k=Character.toUpperCase(ch[i]);
				replace = replace+k;
			//	System.out.println(replace);
									
			}else
			{
				replace=replace+ch[i];
			}
	

			
			
		}
		
		System.out.println(replace);
		// TODO Auto-generated method stub

	}

}
