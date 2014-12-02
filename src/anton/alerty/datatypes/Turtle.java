package anton.alerty.datatypes;

public class Turtle {
	
	private double x;
	private double y;
	private double a;

	public Turtle(double x0, double y0, double a0) {
		x = x0;
		y = y0;
		a = a0;
	}
	public void turnLeft(double delta) {
		a = a + delta;
	}
	
	public void goForward(double step) {
		double oldX = x;
		double oldY = y;
		x = x + step * Math.cos(Math.toRadians(a));
		y = y + step * Math.sin(Math.toRadians(a));
		StdDraw.line(oldX, oldY, x, y);
	}
	
	public static void main(String[] args) {
		int N = 40;
		double decay = 1.001;
		double delta = 360 / N;
		double step = Math.sin(Math.toRadians(delta/2));
		Turtle turtle = new Turtle(.5, .0, delta/2);
		for (int i = 0; i < N*100; i++) {
			step /= decay;
			turtle.goForward(step);
			turtle.turnLeft(delta);
		}
	}

}
