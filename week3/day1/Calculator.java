package week3.day1;

public class Calculator {

	public void addNum(int a, int b) {

		System.out.println("Add the 2 int "+(a+b));

	}

	public void addNum(int a, int b, int c) {
		System.out.println("Add 3 int "+(a+b+c));

	}

	public void mulNum(int a, int b) {
		System.out.println("Mul 2 int "+(a*b));

		// TODO Auto-generated method stub

	}

	public void mulNum(int a, double b) {
		System.out.println("Mul int double "+(a*b));
	}

	public void divNum(int a, int b) {
		System.out.println("div 2 int"+" "+(a/b));
	}

	public void divNum(double a, int b) {
		System.out.println("div double int "+(a/b));
	}

	public void subNum(int a, int b) {
		System.out.println("Sub " + (a - b));
	}

	public void subNum(double a, double b) {

		System.out.println("Sub " + (a - b));
	}

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.addNum(1, 2);
		cal.addNum(1, 2, 3);
		cal.mulNum(1, 4.5);
		cal.mulNum(3, 5);
		cal.divNum(3.8, 2);
		cal.divNum(6, 2);
		cal.subNum(7.8, 2.7);
		cal.subNum(40, 3);

	}

}
