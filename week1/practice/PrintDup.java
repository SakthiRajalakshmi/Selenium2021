package week1.practice;

public class PrintDup {

	public static void main(String[] args) {
	int[]arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int m=arr.length;
	for(int i=0;i<m;i++)
	{
		for(int j=i+1;j<m;j++)
		{
			if(arr[i]==arr[j])
				System.out.println(arr[i]);
		}
	}

	}

}
