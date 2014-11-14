package anton.alerty.inputandoutput;

public class BouncingBall {

	public static void main(String[] args) {
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		double rx = .480, ry = .860;
		double vx = 0.015, vy = 0.023;
		double radius = .05;
		StdDraw.clear(StdDraw.LIGHT_GRAY);
		int i = 1;
		while (true) {
			if (Math.abs(rx + vx) + radius > 1.0) { vx = - vx; }
			if (Math.abs(ry + vy) + radius > 1.0) { vy = - vy; }
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(rx, ry, radius);
			rx += vx;
			if ((Math.abs(vy - (i*i/10000000.0)) > 0.0001)&(ry > -0.984)) { 
				ry += vy - (i*i/10000000.0);
				vy = vy - (i*i/10000000.0);
			}
			
			//StdDraw.clear(StdDraw.GRAY);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(rx, ry, radius);
			StdDraw.show(20);
			i++;
		}
	}

}
