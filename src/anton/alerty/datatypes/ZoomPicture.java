package anton.alerty.datatypes;

import java.awt.Color;

public class ZoomPicture {

	static public Picture cut(Picture pic, double x, double y, double s) {
		int w = pic.width();
		int h = pic.height();
		int w2 = (int) (w * s); 
		int h2 = (int) (h * s);
		
		Picture pic2 = new Picture(w2, h2);
		for (int i = 0; i < w2; i++) {
			for (int j = 0; j < h2; j++) {
				Color c = pic.get((int)((x-s/2)*w+i), (int)((y - s/2)*h+j));
				pic2.set(i, j, c);
			}
		}
		
		return pic2;
	}
	
	public static void main(String[] args) {
		Picture pic = new Picture(args[0]);
		
		while(!StdIn.isEmpty()) {
		double x = StdIn.readDouble();
		double y = StdIn.readDouble();
		double s = StdIn.readDouble();
		Picture pic2 = cut(pic, x, y, s);
		pic2.show();
		
		
		}
	}

}
