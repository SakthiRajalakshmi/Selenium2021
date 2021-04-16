package week1.assignment;

public class SumOfDigitsFromStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Tes12Le79af65";
		int sum=0;
		
		String replaceAll = text.replaceAll("\\D","");
		System.out.println(replaceAll);
		char[] ch=replaceAll.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			
		sum=sum+Character.getNumericValue(ch[i]);
			
		}
		System.out.println(sum);
		

	}

}
