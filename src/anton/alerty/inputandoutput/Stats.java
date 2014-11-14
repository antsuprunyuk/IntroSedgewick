package anton.alerty.inputandoutput;

public class Stats { 
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        double[] a = new double[N];

        // read data and compute statistics
        for (int i = 0; i < N; i++) {
            a[i] = StdIn.readDouble();
        }

        // compute mean
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        double mean = sum / N;

        // compute standard deviation
        double sum2 = 0.0;
        for (int i = 0; i < N; i++) {
            sum2 += (a[i] - mean) * (a[i] - mean);
        }
        double stddev = Math.sqrt(sum2) / (N - 1);

        // print results
        StdOut.println("Mean               = " + mean);
        StdOut.println("Standard deviation = " + stddev);
    }
}