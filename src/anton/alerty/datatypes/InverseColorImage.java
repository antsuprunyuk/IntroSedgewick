package anton.alerty.datatypes;

import java.awt.Color;

public class InverseColorImage {

	public static void main(String[] args) {
		Picture pic = new Picture(args[0]);
		int x = pic.width();
		int y = pic.height();
		Picture pic2 = new Picture(x, y);
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				Color color = pic.get(i, j);
				Color colorInverse = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
				pic2.set(i,j,colorInverse);
			}
		}
		pic2.show();
	}
}
