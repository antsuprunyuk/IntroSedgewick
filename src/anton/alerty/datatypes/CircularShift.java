package anton.alerty.datatypes;

import anton.alerty.datatypes.StdIn;

public class CircularShift {

	public static void main(String[] args) {
		String s1 = StdIn.readLine();
		String s2 = StdIn.readLine();
		boolean shift = false;
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.substring(i, s1.length()) + "  " + s1.substring(0,i));
			if (s2.equals(s1.substring(i, s1.length()) + s1.substring(0,i) )) {
				shift = true;
				break;
			}
		}	
		if (shift) {
			System.out.println("This strings are circular shifted");
		} else System.out.println("No. Some bizzare strings");
		//System.out.println(s1.sub)
	}

}
