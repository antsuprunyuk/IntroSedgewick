package anton.alerty.datatypes;

import java.awt.Color;

public class GlassFilter {

	public static int random(int a, int b) {
		return a + (int)((b - a + 1)*Math.random());
	}
	
	public static void main(String[] args) {

		Picture pic1 = new Picture(args[0]);
		int w = pic1.width();
		int h = pic1.height();
		Picture pic2 = new Picture(w, h);
		pic1.show();
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				int xx = (w + i + random(-2, 2)) % w;
				int yy = (h + j + random(-2, 2)) % h;
				Color c = pic1.get(xx,  yy);
				pic2.set(i, j, c);
			}
		}
		pic2.show();
	}
}
