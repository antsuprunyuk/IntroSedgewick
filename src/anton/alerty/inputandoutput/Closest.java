package anton.alerty.inputandoutput;
/*************************************************************************
 *  Compilation:  javac Closest.java 
 *  Execution:    java Closest x y z
 *         [ input required from standard input                        ]
 *         [ use Ctrl-d (OS X or Dr. Java) or Ctrl-z (Windows) for EOF ]
 *
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Takes three command-line arguments x, y, z; reads from standard input a
 *  sequence of point coordinates (xi, yi, zi), and prints the coordinates
 *  of the point closest to (x, y, z).
 *
 *  % java Closest 1.0 5.0 2.0
 *  1.0 3.0 9.0
 *  5.0 3.0 2.5
 *  9.0 6.0 2.0
 *  2.0 6.0 3.0
 *  5.0 6.0 5.0
 *  <Ctrl-d>
 *  Closest point = (2.000000, 6.000000, 3.000000)  
 *
 *************************************************************************/

public class Closest {

	public static void main(String[] args) {
		double x0 = Double.parseDouble(args[0]);
		double y0 = Double.parseDouble(args[1]);
		double z0 = Double.parseDouble(args[2]);
		double dist = Double.POSITIVE_INFINITY;
		double x1, y1, z1;
		x1 = y1 = z1 = 0.0;
		while(!StdIn.isEmpty()) {
			double x = StdIn.readDouble();
			double y = StdIn.readDouble();
			double z = StdIn.readDouble();
			if ((x0 - x)*(x0 - x) + (y0 - y)*(y0 - y) + (z0 - z)*(z0 - z) < dist) {
				dist = (x0 - x)*(x0 - x) + (y0 - y)*(y0 - y) + (z0 - z)*(z0 - z);
				x1 = x;
				y1 = y;
				z1 = z;
			}
		}
		StdOut.printf("Closest point is (%f, %f, %f)", x1, y1, z1);
	}

}

