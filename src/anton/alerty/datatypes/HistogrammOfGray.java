package anton.alerty.datatypes;

import java.awt.Color;

public class HistogrammOfGray {
	public final static int NUMBER_OF_COLORS = 256; 

	public static void main(String[] args) {
		Picture pic = new Picture("01_02_2006.JPG");
		int[] freq = new int[NUMBER_OF_COLORS];
		int x = pic.width();
		int y = pic.height();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				Color c = pic.get(i, j);
				int f = (int)Math.round(Luminance.lum(c));
				freq[f]++;
			}
		}
		StdDraw.setCanvasSize(1600, 900);
		int maxY = StdStats.max(freq);
		StdDraw.setYscale(0, maxY);
		StdDraw.setXscale(-1, NUMBER_OF_COLORS);
		for (int i = 0; i < NUMBER_OF_COLORS; i++) {
			StdDraw.setPenColor(new Color(100, 100, 100));
			StdDraw.filledRectangle(i, freq[i]/2, 0.4, freq[i]/2);
			if (freq[i] == StdStats.max(freq)) System.out.println(i);
		}
		
	}

}
