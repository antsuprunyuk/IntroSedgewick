package anton.alerty.datatypes;
import java.awt.Color;

public class Luminance {

	public static double lum(Color color) {
		int r = color.getRed();
		int g = color.getGreen();
		int b = color.getBlue();
		return .299*r + .587*g + .114*b; 
	}
	
	public static Color toGray(Color color) {
		int y = (int) Math.round(lum(color));
		Color gray = new Color(y, y, y);
		return gray;
	}
	
	public static boolean compatible(Color a, Color b){
		return Math.abs(lum(a) - lum(b)) >= 128;
	}
	
	public static void main(String[] args) {
		int[] a = new int[6];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		Color c1 = new Color(a[0], a[1], a[2]);
		Color c2 = new Color(a[3], a[4], a[5]);
		StdOut.print(compatible(c1, c2)+ " " + lum(c1) + " " + lum(c2));
	}

}
