package anton.alerty.arraysandloops;

public class MyltiplyRectangularMatrices {

	public static void main(String[] args) {
		int[][] a = { 
				   { 9, 5, 8 }, 
				   { 9, 5, 7 }, 
				   { 9, 7, 6 }, 
				   { 4, 3, 1 }, 
				   { 9, 4, 2 }, 
				   { 9, 4, 5 }, 
				   { 6, 5, 8 }, 
				   { 2, 6, 9 }, 
				   { 7, 7, 2 }, 
				   { 8, 9, 3 }
				};
		int[][] b = {
						{ 3, 2 },
						{ 2, 4 },
						{ 5, 3 }
					};
		int[][] c = new int[a.length][b[0].length];
		
		//testing if dimensions are eligible
		boolean isOk = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b.length) { isOk = false;}
		}
		if (!isOk) {
			System.err.println("Error: Columns of 1st matrix are not equal to rows of 2nd matrix.");
			return;
		}	
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k] * b[k][j]; 
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}


