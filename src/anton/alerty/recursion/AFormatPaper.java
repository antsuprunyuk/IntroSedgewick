package anton.alerty.recursion;

public class AFormatPaper {

	public static void drawAFormat(int n, double x0, double y0, double x1, double y1, boolean horizontal) {
		if (n < 0) { return; }
		double[] x = {x0, x0, x1, x1};
		double[] y = {y0, y1, y1, y0};
		StdDraw.polygon(x, y);
		if (horizontal) {
			drawAFormat(n-1, x0, y0, x1, y1/2, !horizontal);
		} else {
			drawAFormat(n-1, x0, y0, x1/2, y1, !horizontal);
		}
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		drawAFormat(8, 0, 0, 0.7, 0.7*Math.sqrt(2), true);
	}

}
