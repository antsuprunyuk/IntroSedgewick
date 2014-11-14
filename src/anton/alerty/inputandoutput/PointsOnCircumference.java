package anton.alerty.inputandoutput;

public class PointsOnCircumference {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double prob = Double.parseDouble(args[1]);
		final double circumference = 360.0;
		final double delta = circumference / N;
		double angle = 0;
		double x = 0.0;
		double y = 0.0;
		StdDraw.setXscale(-1, 1);
		StdDraw.setYscale(-1, 1);
		double[][] coord = new double[N][2];
		
		StdDraw.setPenRadius(0.01);
		for (int i = 0; i < N; i++) {
			x = Math.cos(i*delta*2*Math.PI/360);
			y = Math.sin(i*delta*2*Math.PI/360);
			coord[i][0] = x;
			coord[i][1] = y;
			StdDraw.point(x, y);
		}
		StdDraw.setPenRadius();
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (Math.random() < prob) {
					StdDraw.line(coord[i][0], coord[i][1], coord[j][0], coord[j][1]);
					StdDraw.show(10);
				}
			}
		}
	}

}
