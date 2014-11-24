package anton.alerty.recursion.Percolation;

public class Percolation {

	public static boolean[][] flow(boolean[][] open) {
		int N = open.length; 
		boolean[][] full = new boolean[N][N];
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
	
	public static void main(String[] args) {
		boolean[][] open = StdArrayIO.readBoolean2D();
		StdOut.print(percolates(open));
		StdOut.println(flow(open));
	}

}
