package anton.alerty.algorithms;

/*************************************************************************
 *  Compilation:  javac Bernoulli.java
 *  Execution:    java Bernoulli N T
 *  Dependencies: StdDraw.java
 *  
 *  Each experiment consists of flipping N fair coins T times.
 *  Plots a histogram of the number of times i of the N coins are heads.
 *
 *  % java Bernoulli 32 1000
 *
 *  % java Bernoulli 64 1000
 *
 *  % java Bernoulli 128 1000
 *
 *************************************************************************/



public class Bernoulli { 

    // number of heads when flipping N biased-p coins
    public static int binominal(int N, double p) {
        int heads = 0;
        for (int i = 0; i < N; i++) {
            if (StdRandom.bernoulli(p)) {
                heads++;
            }
        }
        return heads;
    } 

    // number of heads when flipping N fair coins
    // or call binomial(N, 0.5)
    public static int binominal(int N) {
        int heads = 0;
        for (int i = 0; i < N; i++) {
            if (StdRandom.bernoulli(0.5)) {
                heads++;
            }
        }
        return heads;
    } 



    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);   // number of coins to flip per trial
        int T = Integer.parseInt(args[1]);   // number of trials


        // flip N fair coins, T times
        double[] norma = new double[N+1];
        int[] freq = new int[N+1];
        for (int t = 0; t < T; t++) {
            freq[binominal(N)]++;
            for (int i = 0; i <= N; i++) {
            	norma[i] = freq[i];
            }
            StdDraw.setYscale(0, t);
            if( t % 1000 == 0) {StdDraw.show(10);
            StdDraw.clear();
            StdStats.plotBars(norma);}
        }
        

        // plot normalized values
        double[] normalized = new double[N+1];
        for (int i = 0; i <= N; i++) {
            normalized[i] = (double) freq[i] / T;
        }
        StdStats.plotBars(normalized);

        // plot Gaussian approximation

        StdDraw.setYscale(0, 1);
        StdDraw.setPenRadius(0.1);
        double mean = N / 2;
        double stddev = Math.sqrt(N)/2;
        double[] phi  = new double[N+1];
        for (int i = 0; i <= N; i++) {
        	phi[i] = Gaussian.phi(i, mean, stddev);
        }
        //StdDraw.setYscale(0, StdStats.max(phi));
        StdStats.plotLines(phi);
        StdDraw.show(10);
    } 
} 