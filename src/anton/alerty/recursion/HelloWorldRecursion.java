package anton.alerty.recursion;

public class HelloWorldRecursion {

	//printing tabs for fuction trace
	public static void printTab(int tab) {
		for (int i = 0; i < tab; i++) {
			System.out.printf("      ");
		}
	}
	public static long factorial(long l, int tab) {
		printTab(tab);
		System.out.printf("factorial (%d)\n", l);
		if (l == 1) {
			printTab(tab);
			System.out.println("return 1");
			return 1;
		}
		long fact = factorial(l-1,++tab);
		printTab(tab-1);
		System.out.printf("return %d*%d=%d\n",l, l-1, l*(l-1));
		return l*fact;
	}
	
	public static double harm(int N) {
		if (N == 1) {
			return 1;
		}
		return harm(N-1) + 1.0/N;
	}
	public static int gcd(int p, int q) {
		if (q == 0) return p;
		return gcd(q, p % q);
	}
	public static void main(String[] args) {
		System.out.println(factorial(1, 0));
		System.out.println(harm(10_000));
		System.out.println(gcd(102, 68));
		
	}

}
