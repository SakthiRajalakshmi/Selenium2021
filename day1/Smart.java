package week3.day1;

public class Smart extends Android{

	public void connectWhatsApp() {
          System.out.println("WhatsApp connected");
	}
	@Override
	public void takevideo() {
		// TODO Auto-generated method stub
		System.out.println("Video overridden");
	}
	public static void main(String[] args)
	{
		Smart s=new Smart();
		s.takevideo();
	}
}
