package anton.alerty.arraysandloops;

public class IntegerToString {

	public static void main(String[] args) {
		String str = "";
		int i = 18;
		for (int n = i; n > 0; n /= 2) { 
			str = (n % 2) + str;
		}
		System.out.println(str);
		
	}

}
