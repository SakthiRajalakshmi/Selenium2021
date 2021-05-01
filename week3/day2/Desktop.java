package week3.day2;

public class Desktop implements Hardware, Software {
	public void desktopModel() {

		System.out.println("Model is Dell 15150");

	}

	public void softwareResource() {

		System.out.println("software is installed");
	}

	public void hardwareResource() {

		System.out.println("Hardware is booted");

	}

	public static void main(String[] args) {

		Desktop cc = new Desktop();
		cc.desktopModel();
		cc.hardwareResource();
		cc.softwareResource();
		// TODO Auto-generated method stub

	}

}
