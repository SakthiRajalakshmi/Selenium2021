package week1.assignment;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		//String output="";
		//String rep="";
		int i;
		int count=0;
	    String[] dup = text.split("\\s");
	    //char[] ch=text.toCharArray();
	    String dup2="";
	    //System.out.println(ch);
	    System.out.println(dup.length);
	    
	    for(i=0;i<dup.length;i++) 
	    {
	    	for(int j=i+1;j<dup.length;j++)
	    	{
	    		if(dup[i].equals(dup[j]))
	    		{
	    				count=count+1;
	    				dup2=dup[i];
	    				System.out.println(dup[i]);
	    				
	    		}
	    		
	    	}
	    	
	    	}
	    if(count>1) {
    		//String text1=;
		    
    		System.out.print(text.replaceAll(dup2,""));
    	}
    
	    
	}
}

		
		

		// TODO Auto-generated method stub

	

	