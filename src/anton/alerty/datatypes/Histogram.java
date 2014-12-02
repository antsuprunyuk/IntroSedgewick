package anton.alerty.datatypes;

public class Histogram {

	private final double[] freq;
	private double max;
	
	public Histogram(int N) {
		freq = new double[N];
	}
	
	public void addDataPoint(int i) {
		freq[i]++;
		if (freq[i] > max) {max = freq[i];}
	}
	
	public void draw() {
		StdDraw.setYscale(0, max);
		StdStats.plotBars(freq);
	}
	
	public static void main(String[] args) {
		int N = 50;
		int T = 100000;
		Histogram histogram = new Histogram(N);
		for (int t = 0; t < T; t++) {
			histogram.addDataPoint(Bernoulli.binominal(N));
			StdDraw.clear();
			histogram.draw();
			StdDraw.show(20);
		}
		StdDraw.setCanvasSize(500, 100);
	}

}
