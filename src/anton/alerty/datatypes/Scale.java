package anton.alerty.datatypes;

public class Scale {

	public static void main(String[] args) {
		int w = Integer.parseInt(args[1]);
		int h = Integer.parseInt(args[2]);
		Picture source = new Picture(args[0]);
		Picture target = new Picture(w, h);
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				int sx = x * source.width() / w;
				int sy = y * source.height() / h;
				target.set(x,  y, source.get(sx, sy));
			}
		}
		source.show();
		target.show();
	}

}
