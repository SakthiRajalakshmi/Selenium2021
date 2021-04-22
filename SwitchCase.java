package week1.practice;

import org.apache.bcel.generic.SWITCH;

public class SwitchCase {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		
		int op=3;
		
		switch (op) {
		case 1:
			System.out.println(a+b);
			
			break;
		case 2:
			System.out.println(a-b);
			
			break;
		case 3:
			System.out.println(a*b);
			
			break;

		default:
			System.out.println(a/b);
			break;
		}

	}

}
