package anton.alerty.datatypes;

public class DrunkenTurtles {

	public static void main(String[] args) {
		int N = 20;
		int T = 10000;
		double step = 0.005;
		Turtle[] turtles = new Turtle[N];
		for (int i = 0; i < N; i++) {
			turtles[i] = new Turtle(Math.random(), Math.random(), 0.0);
		}
		for (int t = 0; t < T; t++) {
			for (int i = 0; i < N; i++) {
				turtles[i].turnLeft(360.0 * Math.random());
				turtles[i].goForward(step);
			}
		}
	}
}