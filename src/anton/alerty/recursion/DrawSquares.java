package anton.alerty.recursion;

public class DrawSquares {

	public static void draw(int n, double x, double y, double r){
		if (n == 0) return;
		draw(n - 1, x - r, y + r, r/3);
		draw(n - 1, x - r, y - r, r/3);
		draw(n - 1, x + r, y - r, r/3);
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		StdDraw.filledSquare(x, y, r);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.square(x, y, r);
		draw(n - 1, x + r, y + r, r/3);
		StdDraw.show(200);
	}
	
	public static void main(String[] args) {
		draw(4, 0.5, 0.5, 0.35);
	}

}
