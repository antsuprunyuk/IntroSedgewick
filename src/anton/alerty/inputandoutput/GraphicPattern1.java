package anton.alerty.inputandoutput;

import java.awt.Color;

public class GraphicPattern1 {

	public static void main(String[] args) {
		double x = 1.0;
		double y = 1.0;
		Color color1 = StdDraw.BLACK;
		Color color2 = StdDraw.GRAY;
		Color color3 = StdDraw.WHITE;
		StdDraw.setXscale(0, x);
		StdDraw.setYscale(0, y);
		
		StdDraw.setPenColor(color1);
		StdDraw.filledSquare(x/2, y/2, x/2);
		
		StdDraw.setPenColor(color2);
		double[] xp1 = {0, x/2, x, x/2};
		double[] yp1 = {y/2, y, y/2, 0};
		StdDraw.filledPolygon(xp1, yp1);
		
		StdDraw.setPenColor(color3);
		double[] xp2 = {0, x/4, x/4};
		double[] yp2 = {y/4, y/4, 0};
		StdDraw.filledPolygon(xp2, yp2);
		double[] xp3 = {0, x/4, x/4};
		double[] yp3 = {3*y/4, y, 3*y/4};
		StdDraw.filledPolygon(xp3, yp3);
		double[] xp4 = {3*x/4, 3*x/4, x};
		double[] yp4 = {0, y/4, y/4};
		StdDraw.filledPolygon(xp4, yp4);
		double[] xp5 = {3*x/4, 3*x/4, x};
		double[] yp5 = {3*y/4, y, 3*y/4};
		StdDraw.filledPolygon(xp5, yp5);
	}

}
