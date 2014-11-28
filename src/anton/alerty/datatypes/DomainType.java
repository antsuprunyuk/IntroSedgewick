package anton.alerty.datatypes;

import anton.alerty.inputandoutput.StdIn;

public class DomainType {

	public static void main(String[] args) {

		String str = StdIn.readLine();
		int index = 0;
		while (str.indexOf('.', index) != -1) {
			index = str.indexOf('.', index) + 1 ;
		}
		int lastIndex = 0;
		if (str.indexOf('/', index+1) != -1) {
			lastIndex = str.indexOf('/', index+1);
		} else lastIndex = str.length();
		String find = str.substring(index, lastIndex);
		System.out.println(find);
	}

}
