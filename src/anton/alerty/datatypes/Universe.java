package anton.alerty.datatypes;

public class Universe {

	private final double radius;
	private final int N;
	private final Body[] orbs;
	
	public Universe() {
		N = StdIn.readInt();
		radius = StdIn.readDouble();
		StdDraw.setXscale(-radius, radius);
		StdDraw.setYscale(-radius, radius);
		orbs = new Body[N];
		for (int i = 0; i < N; i++) {
			double rx = StdIn.readDouble();
			double ry = StdIn.readDouble();
			double[] position = {rx, ry};
			double vx = StdIn.readDouble();
			double vy = StdIn.readDouble();
			double[] velocity = {vx, vy};
			double mass = StdIn.readDouble();
			Vector r = new Vector(position);
			Vector v = new Vector(velocity);
			orbs[i] = new Body(r, v, mass);
		}
	}
	
	public void increaseTime(double dt) {
		Vector[] f = new Vector[N];
		for (int i = 0; i < N; i++) {
			f[i] = new Vector(new double[2]);
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					f[i] = f[i].plus(orbs[i].forceFrom(orbs[j]));
				}
			}
		}
		for (int i = 0; i < N; i++) {
			orbs[i].move(f[i], dt);
		}
	}
	
	public void draw() {
		for (int i = 0; i < N; i++) {
			orbs[i].draw();
		}
	}
	
	public static void main(String[] args) {

		Universe newton = new Universe();
		double dt = Double.parseDouble(args[0]);
		while (true) {
			StdDraw.clear();
			newton.increaseTime(dt);
			newton.draw();
			StdDraw.show(10);
		}
	}

}
