package week1.day2;

public class Calculator {

	public int sum(int a,int b) {
		
		int sum=a+b;
		return sum;
		
	
		// TODO Auto-generated method stub

	}
	public double sub(double c,double d) {
		
		double sub=c-d;
		return sub;
		// TODO Auto-generated method stub

	}
	public double mul(double f,double h) {
		
		double mul=f*h;
		return mul;
		
			
		// TODO Auto-generated method stub

	}
	public int div(int g, int h) {
		
		int div=g/h;
		return div;
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		int d=myCalc.div(10, 2);
		System.out.println(d);
		double m=myCalc.mul(3, 9);
		System.out.println(m);
		double mi=myCalc.sub(4, 6);
		System.out.println(mi);
		int su=myCalc.sum(29, 45);
		System.out.println(su);
		
		// TODO Auto-generated method stub

	}

}
