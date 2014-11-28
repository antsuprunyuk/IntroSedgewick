package anton.alerty.datatypes;

import java.awt.Color;

public class FlipImage {

	public static void main(String[] args) {
		Picture pic = new Picture(args[0]);
		int x = pic.width();
		int y = pic.height();
		Picture pic2 = new Picture(x,y);
		for (int i = 0; i < x/2; i++) {
			for (int j = 0; j < y; j++) {
				Color temp1 = pic.get(i, j);
				Color temp2 = pic.get(x-i-1, j);
				Color buffer = temp1;
				temp1 = temp2;
				temp2 = buffer;
				pic2.set(i, j, temp1);
				pic2.set(x-i-1, j, temp2);
			}
		}
		pic2.show();
	}

}
