package anton.alerty.functionsandmodules;

public class Exercise218 {

	public static double abs(double a, int depth) {
		for (int i = 0; i < depth; i++) System.out.print("	");
		System.out.println("abs(" + a + ")");
		if (a < 0) return -a;
		for (int i = 0; i < depth; i++) System.out.print("	");
		System.out.println("return " + a);
		return a;
	}
	
	public static int abs(int a) {
		if (a < 0) return -a;
		return a;
	}
	
	public static double sqrt(double c, int depth) {
		for (int i = 0; i < depth; i++) System.out.print("	");
		System.out.println("sqrt(" + c + ")");
		if (c < 0) {
			return Double.NaN;
		}
		double e = 1e-15;
		double t = c;
		while (abs((t - c/t), depth + 1) > e*t) {
			t = (t + c / t) / 2;
		}
		for (int i = 0; i < depth; i++) System.out.print("	");
		System.out.println("return " + t);
		return t;
	}

	public static void main(String[] args) {
		int depth = 0;
		for (int i = 0; i < depth; i++) System.out.print("	");
		System.out.println("main({4.0, 9.0})");
		int N = args.length;
		double[] a = new double[N];
		for (int i = 0; i < N; i++) {
			a[i] = Double.parseDouble(args[i]);
		}
		for (int i = 0; i < N; i++) {
			double x = sqrt(a[i], depth + 1);
			System.out.printf("%5.2f ", x);
		}
		System.out.println("\nreturn");
	}

}