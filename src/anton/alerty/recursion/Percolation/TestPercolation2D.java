package anton.alerty.recursion.Percolation;

public class TestPercolation2D {

	public static boolean percolates(boolean[][] full) {
		int N = full.length;
		for (int j = 0; j < N; j++) {
			if (full[N-1][j]) return true; 
		}
		return false;
	}
	public static double eval(int N, double p, int T) {
		int count = 0;
		double prob = 0.0;
		for (int t = 0; t < T; t++) {
			boolean[][] open = Percolation.random(N, p);
			boolean[][] full = Percolation.flowRecursive(open);
			if (percolates(full)) count++;
		}
		prob = 1.0*count/T;
		return prob;
	}
	
	public static void curve(int N, double x0, double y0, double x1, double y1) {
		double gap = .001;
		double err = 0.005;
		int T = 20000;
		double xm = (x0 + x1)/2;
		double ym = (y0 + y1)/2;
		double fxm = eval(N, xm, T);
		if (x1 - x0 < gap || Math.abs(ym-fxm) < err) {
			StdDraw.line(x0, y0, x1, y1);
			return;
		}
		curve(N, x0, y0, xm, fxm);
		StdDraw.filledCircle(xm, fxm, .005);
		StdDraw.text(xm+0.05, fxm-0.05, ""+xm);
		curve(N, xm, fxm, x1, y1);
	}
	
	public static void main(String[] args) {
		int N = 10;
		double p = 0.59;
		int T = 1000;
		boolean[][] open = Percolation.random(N, p);
		//StdDraw.setPenColor(StdDraw.BLACK);
		//Percolation.show(open, false);
		boolean[][] full = Percolation.flowRecursive(open);
		//StdDraw.setPenColor(StdDraw.BLUE);
		//Percolation.show(full, true);
		//System.out.println(percolates(full));
		double prob = eval(N, p, T);
		System.out.println(prob);
		curve(20, .0, .0, 1.0, 1.0);
		
	}

}
