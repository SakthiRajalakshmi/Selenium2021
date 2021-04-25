package week3.day1;

public class Students {
	
	public void getStudentsInfo(int id) {
		
		System.out.println("Id is "+id);

	}
	public void getStudentsInfo(int id,String name) {
		System.out.println("Id and Name "+id+" " + name);
		

	}
	public void getStudentsInfo(String email,int ph) {
		System.out.println("Email is "+email+" " + ph);
		
		
	}


	public static void main(String[] args) {
		
		Students ss1=new Students();
		ss1.getStudentsInfo(445);
		ss1.getStudentsInfo(334,"Avira");
		ss1.getStudentsInfo("Avira@gmail.com",124567);

	}

}
