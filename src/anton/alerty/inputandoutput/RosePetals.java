package anton.alerty.inputandoutput;

public class RosePetals {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		StdDraw.setXscale(-1, 1);
		StdDraw.setYscale(-1, 1);
		StdDraw.setPenColor(StdDraw.PINK);
		
		double x0 = 0;
		double y0 = 0;
		for (int i = 0; i < 360; i++) {
			double theta = Math.toRadians(i);
			double r = Math.sin(N * theta);
			double x1 = r * Math.cos(theta);
			double y1 = r * Math.sin(theta);
			StdDraw.line(x0, y0, x1, y1);
			x0 = x1;
			y0 = y1;
		}
	}

}
