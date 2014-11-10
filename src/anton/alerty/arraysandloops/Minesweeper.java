package anton.alerty.arraysandloops;

public class Minesweeper {

	public static void main(String[] args) {
		final int M = Integer.parseInt(args[0]);
		final int N = Integer.parseInt(args[1]);
		boolean[][] b = new boolean[M+2][N+2];
		int[][] field = new int[M+2][N+2];
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				if (Math.random() < 0.15) {
					b[i][j] = true;
				}
				if (b[i][j]) {System.out.print("* ");} else { System.out.print("` ");}
			}
			System.out.println();	
		}
		
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				if (!b[i][j]) {
					for (int k = -1; k < 2; k++) {
						for (int m = -1; m < 2; m++) {
							if (b[i+k][j+m]) {
								field[i][j]++; 
							}		
						}
					}
				} else {
					field[i][j] = -1;
				}
			}
		}
		//printing field
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				if (field[i][j] == -1) {
					System.out.print("* ");
				} else if (field[i][j] == 0) {
					System.out.print("  ");
				} else {
					System.out.print(field[i][j] + " ");
				}	
			}
			System.out.println();
		}
		
		
		
	}

}
