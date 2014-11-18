package anton.alerty.functionsandmodules;

public class Rescaling {

	public static double min(double[] d) {
		double min = d[0];
		for (int i = 1; i < d.length; i++) {
			if (d[i] < min) {
				min = d[i];
			}
		}
		return min;
	}
	
	public static double max(double[] d) {
		double max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > max) { 
				max = d[i];
			}
		}
		return max;
	}
	
	public static void rescale(double[] d) {
		double min = min(d);
		double max = max(d);
		double mean = max - min;
		for (int i = 0; i < d.length; i++) {
			d[i] = (d[i] - min) / mean;
		}
	}
	public static void main(String[] args) {
		double[] d = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			d[i] = Double.parseDouble(args[i]);
		}
		rescale(d);
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		
	}

}
