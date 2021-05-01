package week3.day1;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit is 70000000");
	}
	
	
	
	

	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();

	}

}
