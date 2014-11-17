package anton.alerty.inputandoutput;

import java.awt.Color;

public class GraphicPattern1 {

	public static void main(String[] args) {
		int N = 2+ (int)(Math.random()*9);
		Color color1 = StdDraw.BLACK;
		Color color2 = StdDraw.GRAY;
		Color color3 = StdDraw.WHITE;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N);
		double x = 1.0;
		double y = 1.0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (((i + j) % 2) == 0) {
					StdDraw.setPenColor(color3);
					StdDraw.circle(j+x/2, i+y/2, x/2);
				} else {
					StdDraw.setPenColor(color1);
					StdDraw.filledSquare(j+x/2, i+y/2, x/2);
					
					StdDraw.setPenColor(color2);
					double[] xp1 = {j+0, j+x/2, j+x, j+x/2};
					double[] yp1 = {i+y/2, i+y, i+y/2, i+0};
					StdDraw.filledPolygon(xp1, yp1);
					
					StdDraw.setPenColor(color3);
					double[] xp2 = {j+0, j+x/4, j+x/4};
					double[] yp2 = {i+y/4, i+y/4, i+0};
					StdDraw.filledPolygon(xp2, yp2);
					double[] xp3 = {j+0, j+x/4, j+x/4};
					double[] yp3 = {i+3*y/4, i+y, i+3*y/4};
					StdDraw.filledPolygon(xp3, yp3);
					double[] xp4 = {j+3*x/4, j+3*x/4, j+x};
					double[] yp4 = {i+0, i+y/4, i+y/4};
					StdDraw.filledPolygon(xp4, yp4);
					double[] xp5 = {j+3*x/4, j+3*x/4, j+x};
					double[] yp5 = {i+3*y/4, i+y, i+3*y/4};
					StdDraw.filledPolygon(xp5, yp5);
				}	
			}	
		}	
	}

}
