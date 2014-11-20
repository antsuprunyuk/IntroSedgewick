package anton.alerty.functionsandmodules;

class InvalidFormatMatricesException extends Exception {
	InvalidFormatMatricesException(String s) {
		System.out.println(s);
	}
}
public class MultiplyingMatrices {

	public static int[][] multiply(int[][] a, int[][] b) throws InvalidFormatMatricesException {
		if (a[0].length != b.length) {
			System.out.println("Invalid dimensions of matrices");
			throw new InvalidFormatMatricesException("Dimensions are not eligible for multiplying");
		}
		int[][] c = new int[a.length][b[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				for(int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k]* b[k][j];
				}
			}
		}
		return c;
	}
	public static void main(String[] args) throws InvalidFormatMatricesException {
		
		int[][] a = { {2, 3, 4},
					  {3, 1, 5}	
					};
		int[][] b = { {1, 3, 2, 1},
					  {2, 1, 3, 4},
					  {1, 2, 3, 2}
					};

		int[][] c = multiply(a, b);
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
		}
	}
}
