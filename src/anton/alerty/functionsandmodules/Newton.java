package anton.alerty.functionsandmodules;

public class Newton {

	public static double sqrt(double c) {
		if (c < 0) {
			return Double.NaN;
		}
		double e = 1e-15;
		double t = c;
		while (Math.abs(t - c/t) > e*t) {
			t = (t + c / t) / 2;
		}
		return t;
	}
	public static void main(String[] args) {
		int N = args.length;
		double[] a = new double[N];
		for (int i = 0; i < N; i++) {
			a[i] = Double.parseDouble(args[i]);
		}
		for (int i = 0; i < N; i++) {
			double x = sqrt(a[i]);
			System.out.printf("%5.2f ", x);
		}
		System.out.println();
	}

}
