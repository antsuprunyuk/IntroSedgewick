package anton.alerty.arraysandloops;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int d = 1;
		if (y > x) {
			int t = x;
			x = y;
			y = t;
		}
		while (y > 1) {
			if (x % y == 0) {
				System.out.println("The GreatestCommonDivisor is " + y);
				break;
			} else {
				int t = y;
				y = x % y;
				x = t;
				if (y == 1) {
					System.out.println("There are no common divisors");
				}
			}
		}
		
	}

}
