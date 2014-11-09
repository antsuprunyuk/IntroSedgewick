package anton.alerty.arraysandloops;

public class ProductBooleanMatrix {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		boolean[][] a = new boolean[N][N];
		boolean[][] b = new boolean[N][N];
		boolean[][] c = new boolean[N][N];
		
		//filling array
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (Math.random() < 0.5) {
					a[i][j] = true;
				}
				if (Math.random() < 0.5) {
					b[i][j] = true;
				}
			}
		}
		
		//printing array a
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf(a[i][j] + " ");
			}
			System.out.println();	
		}
		System.out.println();
		
		//printing array b
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf(b[i][j] + " ");
			}
			System.out.println();	
		}
		System.out.println();	
		
		//multiplying matrixes
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					c[i][j] =c[i][j] || (a[i][k] && b[k][j]);
				}
			}
		}
		
		//printing array c
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf(c[i][j] + " ");
			}
			System.out.println();	
		}
	}

}
