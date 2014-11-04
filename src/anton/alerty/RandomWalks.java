package anton.alerty;

public class RandomWalks {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int T = Integer.parseInt(args[1]);
		
		int deadEnds = 0;
		for (int i = 0; i < T; i++) {
			int x = N / 2, y = N / 2;
			boolean[][] b = new boolean[N][N];
			while ((x > 0) && (x < N - 1) && (y > 0) && (y < N  - 1)) {
				b[x][y] = true;
				if ((b[x-1][y])&&(b[x+1][y])&&(b[x][y-1])&&(b[x][y+1])) {
					deadEnds++; break;
				}
				double temp = Math.random();
				if 		(temp < 0.25) {if (!b[x+1][y]) x++;} 
				else if (temp < 0.50) {if (!b[x][y+1]) y++;} 
				else if (temp < 0.75) {if (!b[x-1][y]) x--;} 
				else if (temp < 1.00) {if (!b[x][y-1]) y--;}
			}
			if ((x == 0) || (x == N - 1) || (y == 0) || (y == N  - 1)) { System.out.printf("X = %d,  Y = %d \n", x, y); }
		}
		System.out.println(100.0*deadEnds/T + "% dead ends");
		
	}

}
