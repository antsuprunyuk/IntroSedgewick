package anton.alerty.arraysandloops;

public class MatrixTransposition {

	public static void main(String[] args) {
		int[][] a = { 
				   { 99, 85, 98 }, 
				   { 98, 57, 78 }, 
				   { 92, 77, 76 }, 
				   { 94, 32, 11 }, 
				   { 99, 34, 22 }, 
				   { 90, 46, 54 }, 
				   { 76, 59, 88 }, 
				   { 92, 66, 89 }, 
				   { 97, 71, 24 }, 
				   { 89, 29, 38 }
				};
		int[][] b = new int[a[0].length][a.length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		for (int j = 0; j < b.length; j++) {
			for (int i = 0; i < b[j].length; i++) {
				System.out.print(b[j][i] + " ");
			}
			System.out.println();
		}
		
		// transposition of square N-N matrix without creating second one
		int[][] c = { 
				   { 99, 85, 98, 11 }, 
				   { 98, 57, 78, 11 }, 
				   { 92, 77, 76, 11 },
				   { 33, 33, 33, 44}
									};
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j <= i; j++) {
				int t = c[i][j];
				c[i][j] = c[j][i];
				c[j][i] = t;
			}
		}
		for (int[] arr : c) {
			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
