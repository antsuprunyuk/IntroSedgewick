package anton.alerty.algorithms;

public class StdRandom {

	public static int uniform(int N) {
		return (int)(Math.random()*N);
	}
	
	public static double uniform(double lo, double hi) {
		return lo + (hi - lo)*(Math.random());
	}
	
	public static boolean bernoulli(double p) {
		return Math.random() < p;
	}
	
	public static double gaussian() {
		double r, x, y;
		do {
			x = uniform(-1.0, 1.0);
			y = uniform(-1.0, 1.0);
			r = x*x + y*y;
		} while ((r >= 1) || (r == 0));
		return x*Math.sqrt(-2.0 * Math.log(r) / r);
	}
	
	public static double gaussian(double m, double s) {
		return m + s * gaussian();
	}
	

	public static int discrete(double[] a) {
		double r = uniform(0.0, 1.0);
		double sum = 0.0; 
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (sum > r) {
				return i;
			}
		}
		return a.length - 1;
	}
	
	public static void shuffle(double[] a) {
		double t;
		for (int i = 0; i < a.length; i++) {
			int r = i + (int)(Math.random()*(a.length - i));
			t = a[i];
			a[i] = a[r];
			a[r] = t;
		}
	}
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double[] t = {.5, .3, .1, .1};
		for (int i = 0; i < N; i++) {
			StdOut.printf(" %2d ", uniform(100));
			StdOut.printf("%8.5f ", uniform(10.0, 99.0));
			StdOut.printf("%5b ", bernoulli(.5));
			StdOut.printf("%7.5f ", gaussian(9.0, .2));
			StdOut.printf("%2d ", discrete(t));
			StdOut.println();
		}
		//testing shuffle
		for (int j = 0; j < 3; j++) {
			shuffle(t);
			for (int i = 0; i < t.length; i++) {
				System.out.print(t[i] + " ");
			}
			System.out.println();
		}	
	}

}
