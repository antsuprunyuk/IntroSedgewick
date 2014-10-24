package anton.alerty;

public class Testing2 {

	public static void main(String[] args) {
		double x, y;
		int count = 0;
		final int T = 100000;
		for (int i = 0; i < T; i++) {
			x = 2 * Math.random();
			y = 2 * Math.random();
			if ((x > 0) && (x < 1) && (y > 0) && (y < 1)) {
				System.out.println (x + " " + y + "  condition (0 < x < 1) & (0 < y < 1) is accomplished");
				count++;
			} else {
				System.out.println(x + " " + y + " condition failed");
			}
		}
		System.out.println("% of succed is about" + 100.0 * count/T);
	}
}
