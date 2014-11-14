package anton.alerty.inputandoutput;

public class Exercise153 {

	public static void main(String[] args) {
		System.out.print("input number of doubles :");
		final int N = StdIn.readInt();
		System.out.println("input doubles :");
		double[] d = new double[N];
		double sum = 0.0;
		double sumSquares = 0.0;
		double mean = 0.0;
		double stdDeviationPopulation = 0.0;
		double stdDeviationSample = 0.0;
		double stdDeviationBook = 0.0;
		for(int i = 0; i < N; i++) {
			d[i] = StdIn.readDouble();
			sum += d[i];
		}
		mean = sum / N;
		for (int i = 0; i < N; i++) {
			sumSquares += (d[i] - mean) * (d[i] - mean);
		}
		stdDeviationPopulation = Math.sqrt(sumSquares/N);
		System.out.printf("Mean of numbers = %f, Population StandartDeviation = %f\n", mean, stdDeviationPopulation);
		stdDeviationSample = Math.sqrt(sumSquares/(N-1));
		System.out.printf("Mean of numbers = %f, Sample StandartDeviation = %f\n", mean, stdDeviationSample);
		stdDeviationBook = Math.sqrt(sumSquares)/(N-1);
		System.out.printf("Mean of numbers = %f, Book StandartDeviation = %f\n", mean, stdDeviationBook);
		/*
		boolean[] bigDeviation = new boolean[N];
		for (int i = 0; i < N; i++) {
			if (d[i] - mean > 1.5 * stdDeviationPopulation ) {
				System.out.println("		" +d[i]);
			} else System.out.println(d[i]); 
		}
		*/
	}	
}
