package anton.alerty.functionsandmodules;

public class ValidChecksum {

	public static int checkSum(long lcheck) {
		int sum = 0;
		long l = lcheck;
		int count = 0;
		do {
			long multi = 1;
			while (l/multi >= 10) {
				multi *= 10;
			}
			long d = l / multi;
			//System.out.println(d);
			if (count % 2 == 0) {
				sum += d;
			} else if (d*2 < 10) {
				sum += d*2;
			} else sum += 1 + ((d*2) % 10);
			
			l -= d * multi;
			count++;
		} while (l != 0); 
		return sum % 10;
	}
	
	public static void main(String[] args) {
		long l = Long.parseLong(args[0]);
		System.out.println(l + " ");
		int valid = checkSum(l);
		long validL = 10*l + valid;
		if (valid != 0) System.out.println("card number is not valid");
		System.out.println(validL);
	}
}
