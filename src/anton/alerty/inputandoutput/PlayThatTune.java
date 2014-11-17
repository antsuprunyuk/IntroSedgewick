package anton.alerty.inputandoutput;

public class PlayThatTune {

	public static void main(String[] args) {
		int sps = 44100;
		int hzA = 440;
		double temp = 0.5;
		double volume = 0.22;
		while(!StdIn.isEmpty()) {
			StdDraw.clear();
			int pitch = StdIn.readInt();
			double duration = StdIn.readDouble();
			double hz = hzA * Math.pow(2, pitch / 12.0);
			int N = (int)(duration * sps/temp);
			StdDraw.setXscale(0, 2.0/hzA);
			StdDraw.setYscale(-1, 1);
			StdDraw.setPenRadius(0.01);
			double[] a = new double[N+1];
			for(int i = 0; i <= N; i++) {
				a[i] = volume*Math.sin(2 * Math.PI * hz * i / sps);
			
			}
			/*
			for(int i = 4; i <= hzA/2; i += 4) {
				StdDraw.line(1.0*(i-4)/sps, a[i-4], 1.0*(i)/sps, a[i]);
				StdDraw.show(5);
				//StdDraw.clear();
			}
			*/		
			StdAudio.play(a);
		}
	}

}
//   7 .25 6 .25 7 .25 6 .25 7 .25 2 .25 5 .25 3 .25 0 .50   Fur Elise