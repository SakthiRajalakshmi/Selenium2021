package week1.practice;

import java.util.Arrays;

//import org.apache.commons.math3.analysis.function.Add;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,7,6,8};
		int s=0;
		//int[] miss= {};
		Arrays.parallelSort(arr);
		int m=arr.length;
		for(int i=0;i<m;i++) {
			s=i+1;
			if(s!=arr[i])
				break;
			//System.out.println(s);
		
			//break;
			//miss.add(s);
			
		}
		
		System.out.println(s);
	}

}
