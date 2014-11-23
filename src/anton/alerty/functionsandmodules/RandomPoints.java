package anton.alerty.functionsandmodules;

public class RandomPoints {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		for (int i = 0; i < N; i++) {
			double x = StdRandom.uniform(-1.0, 1.05);
			double y = StdRandom.uniform(-1.0, 1.05);
			StdDraw.point(x, y);
		}
		
	}

}
