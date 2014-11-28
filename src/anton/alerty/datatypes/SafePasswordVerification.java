package anton.alerty.datatypes;

public class SafePasswordVerification {
	

	public static boolean check(String password) {
		String bigLetter 	 = "ABCDEFGHIJKLMNOPQRSTVUWXYZ";
		String smallLetter   = "abcdefghijklmnopqrstvuwxyz";
		String digit 	     = "01234567890";
		String symbol   	 = "~!@#$%^&*()_+|=-/?><.,";
		boolean hasBig, hasSmall, hasDigit, hasSymbol, enoughSize;
		hasBig = hasSmall = hasDigit = hasSymbol = enoughSize = false;
		int pl = password.length();
		if (pl >= 9) enoughSize = true;
		for (int i = 0; i < pl; i++) {
			String s = password.substring(i, i+1);
			if (bigLetter.contains(s))   { hasBig = true; }
			if (smallLetter.contains(s)) { hasSmall = true; }
			if (digit.contains(s))       { hasDigit = true; }
			if (symbol.contains(s))  	 { hasSymbol = true; }
		}
		if (enoughSize && hasBig && hasSmall && hasDigit && hasSymbol) return true;
		return false;
	}
	
	public static void main(String[] args) {
		while (!StdIn.isEmpty()) {
			String str = StdIn.readLine();
			boolean checkPass = check(str);
			System.out.println(checkPass);
		}
	}

}
