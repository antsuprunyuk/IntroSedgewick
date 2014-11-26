package anton.alerty.datatypes;
import java.awt.Color;
public class Fade {

	public static Color blend(Color s, Color t, double alfa) {
		int r =  (int) Math.round(((1 - alfa) * s.getRed() + alfa * t.getRed()) / 2);
		int g =  (int) Math.round(((1 - alfa) * s.getGreen() + alfa * t.getGreen()) / 2);
		int b =  (int) Math.round(((1 - alfa) * s.getBlue() + alfa * t.getBlue()) / 2);
		return new Color(r, g, b);
	}
	
	public static void main(String[] args) {
		Picture source = new Picture(args[0]);
		Picture target = new Picture(args[1]);
		int M = Integer.parseInt(args[2]);
		int x = source.width();
		int y = source.height();
		Picture[] pic = new Picture[M];
		for (int m = 0; m < M; m++) {
			pic[m] = new Picture(x,y);
			for (int i = 0; i < source.width(); i++) {
				for (int j = 0; j < source.height(); j++) {
					Color cs = source.get(i, j);
					Color ct = target.get(i, j);
					Color cb = blend(cs, ct, (double)m/M);
					pic[m].set(i, j, cb);
				}
			}
			pic[m].show();
		}
	}

}
