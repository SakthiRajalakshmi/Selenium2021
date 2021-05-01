package week3.assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionDuplicate {

	public static void main(String[] args) {
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		
		List <Integer>newValues=new ArrayList<Integer>();
		
		
		for(int i=0;i<data.length;i++)
		{
			
			for(int j=i+1;j<data.length;j++)
				
		
			{
				System.out.println(data[i]);
				System.out.println(data[j]);
				if(data[i]==data[j])
					
					newValues.add(data[i]);
			}
				
				
		}
		
		System.out.println(newValues);
	}
}
