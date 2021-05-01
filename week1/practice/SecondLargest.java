package week1.practice;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		//int m=0;
		int[] a= {5,2,6,7,8};
		Arrays.parallelSort(a);
		int n=a.length;
		int ans=a[n-2];
		//for(int i=n-2;i<a.length;) {
			System.out.println(ans);
		//	break;
		//}
	
		
		//System.out.println(m);

	}

}
