package week1.assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] ch = str.toCharArray();
		// System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'e') {
				count = count + 1;

			}

		}
		System.out.println(count);
	}

}
