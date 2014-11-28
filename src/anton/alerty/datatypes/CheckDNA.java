package anton.alerty.datatypes;

public class CheckDNA {

	public static void main(String[] args) {
		String str = args[0];
		boolean correctDNA = true;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i)!='A') && (str.charAt(i)!='C') && (str.charAt(i)!='T') && (str.charAt(i)!='G')) {
				 correctDNA = false;
			}
		}
		System.out.println(correctDNA);
	}

}
