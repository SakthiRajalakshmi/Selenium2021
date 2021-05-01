package week3.day2;

public class College extends University {
	

	

	@Override
	public void ug() {
		
		System.out.println("ug is implemented");
	}
	
	public static void main(String[] args) {
		
		College cc=new College();
		cc.ug();
		cc.pg();

	}

}
