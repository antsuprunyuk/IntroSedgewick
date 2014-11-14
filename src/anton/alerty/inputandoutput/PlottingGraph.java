package anton.alerty.inputandoutput;

public class PlottingGraph {

	public static void main(String[] args) {
		int N = 5;
		double[] x = new double[N+1];
		double[] y = new double[N+1];
		double yMin = Double.POSITIVE_INFINITY;
		double yMax = Double.NEGATIVE_INFINITY;
		for (int i = 0; i <= N; i++) {
			x[i] = i * Math.PI / N;
			y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);
			if (yMin > y[i]) { yMin = y[i]; }
			if (yMax < y[i]) { yMax = y[i]; }
		}
		StdOut.println(yMin + " " + yMax);
		StdDraw.setXscale(0, Math.PI);
		StdDraw.setYscale(-2.0, 2.0);
		for (int i = 1; i <= N; i++) {
			StdDraw.line(x[i-1], y[i-1], x[i], y[i]);
		}
	}

}
