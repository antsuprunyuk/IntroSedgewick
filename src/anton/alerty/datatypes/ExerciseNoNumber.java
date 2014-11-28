package anton.alerty.datatypes;

import java.awt.Color;

public class ExerciseNoNumber {

	public static void main(String[] args){
		int x =956;
		int y = 956;
		int r = Integer.parseInt(args[0]);
		int g = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		Color color = new Color(r, g, b);
		Picture pic = new Picture(x, y);
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				pic.set(i, j, color);
			}
		}
		pic.show();
	}	
}
