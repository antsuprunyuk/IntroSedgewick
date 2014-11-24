package anton.alerty.recursion.Percolation;

public class Percolation {

	public static void flow(boolean[][] open, boolean[][] full, int i, int j) {
		int N = full.length;
		if ((i < 0)||(j < 0)||(i >= N)||(j >= N)) return;
		if (!open[i][j]) return;
		if (full[i][j]) return;
		full[i][j] = true;
		flow(open, full, i-1, j);
		flow(open, full, i, j-1);
		flow(open, full, i+1, j);
		flow(open, full, i, j+1);
	}
	public static boolean[][] flowRecursive(boolean[][] open) {
		int N = open.length;
		boolean[][] full = new boolean[N][N];
		for (int j = 0; j < N; j++) {
			flow(open, full, 0, j);
		}
		return full;
	}
	
	public static boolean[][] flow(boolean[][] open) {
		int N = open.length; 
		boolean[][] full = new boolean[N][N];
		for (int j = 0; j < N; j++)  { full[0][j] = open[0][j]; }
		
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if ((open[i][j])&&(full[i-1][j])) {
					full[i][j] = true;
				}
			}
		}
		return full;
	}
	
	public static boolean percolates(boolean[][] open) {
		boolean[][] full = flow(open);
		int N = full.length;
		for (int j = 0; j < N; j++) {
			if (full[N-1][j]) { 
				return true;
			}
		}
		return false;
	}
	
	public static void show(boolean[][] a, boolean which) {
		int N = a.length;
		StdDraw.setXscale(-1, N);
		StdDraw.setYscale(-1, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (a[i][j] == which) {
					StdDraw.filledSquare(j, N - i - 1, 0.5);
				}// else StdDraw.square(j, N - i - 1, 0.5);
			}
		}
	}
	public static boolean[][] random(int N, double p) {
		boolean[][] a = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = StdRandom.bernoulli(p);
			}
		}
		return a;
	}

	
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double p = Double.parseDouble(args[1]);
		int T = Integer.parseInt(args[2]);
		N = 8;
		p = 0.6;
		T = 10;
		int count = 0;
		for (int t = 0; t < T; t++) {
			StdDraw.clear();
			boolean[][] open = random(N, p);
			StdDraw.setPenColor(StdDraw.BLACK);
			show(open, false);
			StdDraw.square((N-1)/2.0, (N-1)/2.0, (N)/2.0);
			StdDraw.setPenColor(StdDraw.BLUE);
			show(flow(open), true);
			if (percolates(open)) count++;
			System.out.printf("%-8b", percolates(open));
			if ((t + 1) % 20 == 0) System.out.println();
			StdDraw.show(1000);
		}
		double probability = 1.0 * count / T;
		System.out.println("Probability equals " + probability);
		//System.exit(0);
	}

}
