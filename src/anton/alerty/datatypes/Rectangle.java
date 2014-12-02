package anton.alerty.datatypes;

public class Rectangle {

	private final double x;
	private final double y;
	private final double width;
	private final double height;
	
	public Rectangle(double x0, double y0, double w, double h) {
		x = x0;
		y = y0;
		width = w;
		height = h;
	}
	
	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}
	
	public boolean intersects(Rectangle b) {
		return ((Math.abs(x - b.x) <= (width + b.width) / 2) && (Math.abs(y-b.y) <= (height + b.height) / 2)) && (!this.contains(b)) && (!b.contains(this));
	}
	
	public boolean contains(Rectangle b) {
	//	System.out.println(Math.abs(x - b.x));
		
		//System.out.println((width - b.width)/2);
		return (Math.abs(x - b.x) < (width - b.width) / 2) && (Math.abs(y-b.y) < (height - b.height) / 2);
	}
	
	public void show() {
		StdDraw.rectangle(x, y, width / 2, height / 2);
	}
	
	public String toString() {
		return "(" + x + ", "  + y + ") - Width = " + width + ", Height = " + height;
	}
	
	public static void main(String[] args) {
		
		int N = Integer.parseInt(args[0]);
		double min = Double.parseDouble(args[1]);
		double max = Double.parseDouble(args[2]);
		Rectangle[] rec = new Rectangle[N];
		for (int i = 0; i < N; i++) {
			double w = StdRandom.uniform(min, max);
			double h = StdRandom.uniform(min, max);
			double x = StdRandom.uniform(w/2, 1 - w/2);
			double y = StdRandom.uniform(h/2, 1 - h/2);
			rec[i] = new Rectangle(x, y, w, h);
			rec[i].show();
		}
		double Area = .0;
		double Perimeter = .0;
		for (int i = 0; i < N; i++) {
			Area += rec[i].area();
			Perimeter += rec[i].perimeter();
		}
		double averageArea = Area / N;
		double averagePerimeter = Perimeter / N;
		System.out.println(" AverageArea = " + averageArea + " averagePerimeter = " + averagePerimeter);
		
	}
}
