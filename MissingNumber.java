package week1.assignment;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		//int m;
		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
	    Arrays.parallelSort(arr);    
		
		
		for (int i = 1; i <= 8; i++) {
			if(i!=arr[i-1]) {
				
			   int m=i;
					System.out.println(m);
					break;
				}

			}
	}
}
	
	


