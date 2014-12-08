package anton.alerty.datatypes;

import java.util.Arrays;

public class Vector implements Comparable<Vector> {

	private final double[] coords;
	
	public Vector(double[] a) {
		coords = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			coords[i] = a[i];
		}
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
	
	@Override
	public int compareTo(Vector other) {
		if (this.magnitude() > other.magnitude()) return 1;
		if (this.magnitude() < other.magnitude()) return -1;
		else return 0;
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
	/*
2 3 4
0 1 1 
22 22 11
28 0 1
7 6 6
	 */
	public static void main(String[] args) {
		int k = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		double[] a = new double[k];
		Vector[] v = new Vector[N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < k; j++) {
				a[j] = StdIn.readDouble();
			}
			v[i] = new Vector(a);
		}
		for (int i = 0; i < v.length; i++) {
			System.out.println(i + " " + v[i]);
		}
		Arrays.sort(v);
		//System.out.println(Arrays.toString(v));
		for (int i = 0; i < v.length; i++) {
			System.out.println(i+" " + v[i]);
		}
	}
}
