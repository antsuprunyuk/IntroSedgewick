package anton.alerty.datatypes;
import java.awt.Color;

public class GrayScale {

	public static void main(String[] args) {
		Picture pic1 = new Picture(args[0]);
		for (int x = 0; x < pic1.width(); x++) {
			for (int y = 0; y < pic1.height(); y++) {
				Color color = pic1.get(x, y);
				Color gray = Luminance.toGray(color);
				pic1.set(x, y, gray);
			}
		}
		pic1.show();
		pic1.save(args[1]);
	}
}
