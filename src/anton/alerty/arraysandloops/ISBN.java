package anton.alerty.arraysandloops;

public class ISBN {

	public static void main(String[] args) {
		long l = 0L;
		for (int i = 0; i < args[0].length(); i++) {
			//System.out.println(args[0].charAt(i));
			l += (10 - i)*(args[0].charAt(i) - '0');
		}	
		for (int i = 0; i < 10; i++) {
			if ((l+i) % 11 == 0) {
				System.out.println(args[0] + i);
				break;
			} else if ((l + 10) % 11 == 0) {
				System.out.println(args[0] + 'X');
				break;
			}
		}
		
	}

}
