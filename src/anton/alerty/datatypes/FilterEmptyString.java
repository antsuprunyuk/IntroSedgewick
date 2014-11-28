package anton.alerty.datatypes;

import anton.alerty.recursion.Percolation.StdIn;

public class FilterEmptyString {

	public static void main(String[] args) {
		while(!StdIn.isEmpty()) {
			String s = StdIn.readLine();
			boolean isEmpty = true;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != ' ') {
					isEmpty = false;
				}
			}
			if (!isEmpty) System.out.println(s);
		}
	}
}
