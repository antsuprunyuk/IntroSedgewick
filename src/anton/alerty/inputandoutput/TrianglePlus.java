package anton.alerty.inputandoutput;

public class TrianglePlus {

	public static void main(String[] args) {
		double t = Math.sqrt(3.0)/2;
		StdDraw.line(0.0, 0.0, 1.0, 0.0);
		StdDraw.line(1.0, 0.0, 0.5, t);
		StdDraw.line(0.0, 0.0, 0.5, t);
		StdDraw.point(1/2, t/3.0);

		int N = 50;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N);
		for (int i = 0; i <= N; i++) {
			StdDraw.line(0, N-i, i, 0);
		}
	}

}
