package anton.alerty.functionsandmodules;

public class GaussianDistribution {

	public static int max(int[] a) {
		int m = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > m) {
				m = a[i];
			}
		}
		return m;
	}
	public static void drawHistogram(int[] a) {
		StdDraw.setXscale(0, a.length);
		StdDraw.setYscale(0, max(a));
		for (int i = 0; i < a.length; i++) {
			double[] x = {i, i, i + .5, i + .5}; 
			double[] y = {0, a[i], a[i], 0};
			StdDraw.polygon(x, y);
		}
	}
	public static double uniform(double a, double b) {
		if (b <= a) {System.out.println("Not appropriate arguments for uniform-function"); return Double.NaN;}
		return a + (b-a)*Math.random();
	}
	public static double gaussian() {
		double r, x, y;
		do {
			x = uniform(-1.0, 1);
			y = uniform(-1.0, 1);
			r = x*x + y*y;
		} while ((r >= 1) || (r == 0));
		return x * Math.sqrt(-2 * Math.log(r) / r);
	}
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int arrlength = 20;
		int[] a = new int[arrlength];
		for (int i = 0; i < N; i++) {
			double g = gaussian();
		//	System.out.println(g);
			for (int k = 0; k < arrlength; k++) {
				if (Math.abs(g) < 0.2*(k+1) ) {
					a[k]++;
					break;
				}
			}
		}
		drawHistogram(a);
	}
}
