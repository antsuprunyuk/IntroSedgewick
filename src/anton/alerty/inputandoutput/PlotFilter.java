package anton.alerty.inputandoutput;

//to execute the program type in terminal from ../IntroductionSedgewick/bin/   'java anton.alerty.inputandoutput.PlotFilter.java < USA.txt'
//USA.txt should be placed in   '../bin/' 
public class PlotFilter {

	public static void main(String[] args) {
		double x0 = StdIn.readDouble();
		double y0 = StdIn.readDouble();
		double x1 = StdIn.readDouble();
		double y1 = StdIn.readDouble();
		StdDraw.setXscale(x0, x1);
		StdDraw.setYscale(y0, y1);
		//StdDraw.setPenRadius(0.1);
		//read and plot the rest of the points
		while (!StdIn.isEmpty()) {
			double x = StdIn.readDouble();
			double y = StdIn.readDouble();
			StdDraw.point(x, y);
		}
	}

}
