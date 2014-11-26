package anton.alerty.datatypes;
import java.awt.Color;
public class Potential {

	public static void main(String[] args) {
		int N = StdIn.readInt();
		Charge[] a = new Charge[N];
		for (int i = 0; i < N; i++) {
			double x0 = StdIn.readDouble();
			double y0 = StdIn.readDouble();
			double q0 = StdIn.readDouble();
			a[i] = new Charge(x0, y0, q0);
		}
		
		int size = 512;
		Picture pic = new Picture(size, size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				double x = (double) i / size;
				double y = (double) j / size;
				double V = 0.0;
				for (int k = 0; k < N; k ++) {
					V += a[k].potentialAt(x, y);
				}
				int g = 128 + (int) (V / 2.0e10);
				System.out.println(g);
				if (g > 255) g = 255;
				if (g < 0) g = 0;
				Color color = new Color(g, g, g);
				pic.set(i, size-1-j, color);
			}
		}
		pic.show();
	}

}
