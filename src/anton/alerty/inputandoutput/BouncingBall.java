package anton.alerty.inputandoutput;

public class BouncingBall {

	public static void main(String[] args) {
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		double rx = .180, ry = .860;
		double vx = -0.05 + Math.random()/10, vy = 0.03 + Math.random()/50;
		double radius = .05;
		StdDraw.clear(StdDraw.LIGHT_GRAY);
		int i = 1;
		while (true) {
			if (Math.abs(rx + vx) + radius > 1.0) { vx = - vx;}// for (int j = 0; j < 2000; j++) StdAudio.play("wall.wav"); }
			if (Math.abs(ry + vy) + radius > 1.0) { vy = - vy;}// if (vy > 0) for (int j = 0; j < 2000; j++) StdAudio.play("floor.wav");   }
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(rx, ry, radius);
			if (Math.abs(vx) > 0.000001) {
				if (ry > -0.98) {
					vx = vx / 1.001;
				} else { 
					vx = vx / 1.03;
				}
				rx += vx;
			}	
			if ((Math.abs(vy - (i/20_000_000.0*i)) > 0.000002)&(ry > -0.99)) { 
				System.out.println(vy - (i/20_000_000.0*i));
				ry += vy - (i/20_000_000.0*i);
				vy = vy - (i/20_000_000.0*i);
				i++;
			}
			
			//StdDraw.clear(StdDraw.GRAY);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(rx, ry, radius);
			StdDraw.show(10);
		}
	}

}
