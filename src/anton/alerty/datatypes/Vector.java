package anton.alerty.datatypes;

public class Vector {

	private final double[] coords;
	
	public Vector(double[] a) {
		coords = a;
	}
	
	public Vector plus(Vector b) {
		double[] c = new double[coords.length];
		for (int i = 0; i < coords.length; i++) {
			c[i] = coords[i] + b.coords[i]; 
		}
		return new Vector(c);
	}
	
	public Vector minus(Vector b) {
		double[] c = new double[coords.length];
		for (int i = 0; i < coords.length; i++) {
			c[i] = coords[i] - b.coords[i];
		}
		return new Vector(c);
	}
	
	public Vector times(double t) {
		double[] c = new double[coords.length];
		for (int i = 0; i < coords.length; i++) {
			c[i] = t * coords[i];
		}
		return new Vector(c);
	}
	
	public double dot(Vector b) {
		double sum = 0.0;
		for (int i = 0; i < coords.length; i++) {
			sum += coords[i] * b.coords[i];
		}
		return sum;
	}
	
	
	public double magnitude() {
		return Math.sqrt(this.dot(this));
	}
	
	public Vector direction() {
		return this.times(1/this.magnitude());
	}
	
	public double cartesian(int i) {
		return coords[i];
	}
	
	public String toString() {
		String str = "Vector: [";
		for (int i = 0; i < coords.length; i++) { 
			if (i != coords.length - 1) str += String.format("%.2f ", coords[i]);
			else str += String.format("%.2f", coords[i]);;
		}
		str += "]";
		return str;
	}
	
	
	public static void main(String[] args) {
		double[] c = {0.5, 0.2, 0.7};
		double[] d = {0.1, 0.2, 1.0};
		Vector v1 = new Vector(c);
		Vector v2 = new Vector(d);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.plus(v2));
		System.out.println(v1.minus(v2));
		System.out.println(v1.times(2));
		System.out.println(v1.dot(v2));
		System.out.println(v1.magnitude());
		System.out.println(v1.cartesian(1));
		System.out.println(v1.cartesian(2));		
		
	}

}
