package anton.alerty.recursion;

public class BinaryToInteger {
	
	public static String convertIter(int n) {
		String str = "";
		while (n != 0) {
			if (n % 2 == 0) {
				str += "0";
			} else {
				str += "1";
			}
			n /= 2;
		}
		return str;
	}
	
	public static void convertRecurs(int n) {
		if (n == 0) return;
		convertRecurs(n/2);
		System.out.print(n % 2);
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String str = convertIter(n);
		System.out.println(str);
		convertRecurs(n);
	}

}
