package week1.day1;

public class Mobile {
	 
	int mobileWeight = 2;
	boolean fullCharge = true;
	double mobileCost = 700000.32;
	String mobileModel = "Redmi";
	
	

	public void makeCall() {
		System.out.println("Call Amma");

	}

	public void sendMsg() {
		System.out.println("Hi Amma");

	}

	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println(myMobile.fullCharge);
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.mobileCost);
	}
}
