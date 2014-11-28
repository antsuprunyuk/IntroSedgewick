package anton.alerty.datatypes;

import anton.alerty.datatypes.StdIn;

public class ReverseDomain {

	public static void main(String[] args) {
		String domain = StdIn.readLine();
		int index1 = 0; 
		int index2 = 0;
		String inverse = "";
		while (domain.indexOf('.', index2) != -1) {
			index2 = domain.indexOf('.', index2)+1;
			inverse = "." + domain.substring(index1, index2-1) + inverse;
			index1 = index2;
		} 
		index2 = domain.length();
		inverse = domain.substring(index1, index2)  + inverse;
		
		System.out.println(inverse);
	}

}
