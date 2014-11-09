package anton.alerty.arraysandloops;

public class MatrixMultiplication {

	public static void main(String[] args) {
		double a[][] = {{0.7, 0.2, 0.1}, {0.3, 0.6, 0.1}, {0.5, 0.1, 0.4}};
		double b[][] = {{0.8, 0.3, 0.5}, {0.1, 0.4, 0.1}, {0.1, 0.3, 0.4}};
		double c[][] = new double[3][3];
		double d[][] = new double[3][3];
		int N = 3;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf(" %.2f", c[i][j]);
			}
			System.out.println();
		}
	}
}
