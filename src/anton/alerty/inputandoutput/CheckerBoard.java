package anton.alerty.inputandoutput;

public class CheckerBoard {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if ((i + j) % 2 == 0) {
					StdDraw.setPenColor(StdDraw.RED);
				} else {
					StdDraw.setPenColor(StdDraw.BLACK);
				}
				StdDraw.filledSquare(j+0.5, i+0.5, 0.5);
				StdDraw.show(50);
			}
		}
	}
}
