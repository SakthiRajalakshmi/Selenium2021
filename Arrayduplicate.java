package week1.day2;

public class Arrayduplicate {
	

	public static void main(String[] args) {
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//int len=a.length;
		for(int i=0;i<a.length;i++) {
			//int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
				//	count=count+1;
					System.out.println(a[i]);
				}
				//System.out.println(a[i]);	
			}
			//if(count > 0) {
				// System.out.println(a[i]);
			}
			 
		}
		
		
		// TODO Auto-generated method stub

	}


