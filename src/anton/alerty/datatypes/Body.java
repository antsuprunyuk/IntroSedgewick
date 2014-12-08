package anton.alerty.datatypes;

public class Body {

	private Vector r; 
	private Vector v;
	private final double mass;
	
	public Body(Vector r0, Vector v0, double m0) {
		r = r0; 
		v = v0; 
		mass = m0;
	}
	
	public void move(Vector f, double dt) {
		Vector a = f.times(1 / mass);
		v = v.plus(a.times(dt));
		r = r.plus(v.times(dt));
	}
	
	public Vector forceFrom(Body b) {
		Body a = this;
		double G = 6.67e-11;
		Vector delta = b.r.minus(a.r);
		double dist = delta.magnitude();
		double F = ((G * a.mass * b.mass) / dist * dist);
		return delta.direction().times(F);
	}
	
	public void draw() {
		StdDraw.setPenRadius(0.025);
		StdDraw.point(r.cartesian(0), r.cartesian(1));
	}
	
	
	public static void main(String[] args) {

	}

}
