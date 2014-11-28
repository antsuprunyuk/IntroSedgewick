package anton.alerty.datatypes;

public class CheckISBN {

	public static void main(String[] args) {
		String s = args[0];
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-') {
				s = s.substring(0, i) + s.substring(i+1, s.length());
				i--;
			}
		}
		int sum = 0;
		System.out.println(s);
		for (int i = 0; i < 9; i++) {
			sum += (10 - i) * (Integer.parseInt("" + s.charAt(i)));
		}
		int lastDigit = 0; 
		for (int i = 0; i < 11; i++) {
			if ((sum + i) % 11 == 0) {
				lastDigit = i;
			}
		}
		if (lastDigit == 10) { 
			System.out.println(s+"X");
		} else System.out.println(s + lastDigit);
		
	}	
}
// 026251087 1