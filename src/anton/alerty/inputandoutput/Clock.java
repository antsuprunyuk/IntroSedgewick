package anton.alerty.inputandoutput;

public class Clock {

	public static void main(String[] args) {
		int startHour = Integer.parseInt(args[0]);
		int startMinute = Integer.parseInt(args[1]);
		int startSecond = Integer.parseInt(args[2]);
		int hour = startHour % 12;
		int minute = startMinute;
		int second = startSecond;
		double xMin = -1.0;
		double xMax = 1.0;
		double yMin = - 1.0;
		double yMax = 1.0;
		double radius = 1.0;
		StdDraw.setXscale(xMin, xMax);
		StdDraw.setYscale(yMin, yMax);
		double ticForMinAndSec = 6 * 2 * Math.PI / 360;
		double ticForHour = 30 * 2 * Math.PI / 360;
		while (true) {
			for (int h = hour; h < 12; h++) {
				for (int m = minute; m < 60; m++) {
					for (int s = second; s < 60; s++) {
						StdDraw.clear();
						StdDraw.setPenRadius(0.01);
						StdDraw.circle(0, 0, radius);
						StdDraw.line(radius*90/100,					0, 				radius*95/100, 					0);
						StdDraw.line(-radius*90/100,				0, 				-radius*95/100, 				0);
						StdDraw.line(0, 				radius*90/100,  			0,						 radius*95/100);
						StdDraw.line(0, 				-radius*90/100, 			0, 						-radius*95/100);
						//secondsLine
						StdDraw.setPenRadius(0.005);
						StdDraw.line(0, 0, -0.97*Math.cos(s*ticForMinAndSec+Math.PI/2), 0.97*Math.sin(s*ticForMinAndSec+Math.PI/2));
						//minutesLine
						StdDraw.setPenRadius(0.012);
						StdDraw.line(0, 0, -0.7*Math.cos((m+s/60.0)*ticForMinAndSec+Math.PI/2), 0.7*Math.sin((m+s/60.0)*ticForMinAndSec+Math.PI/2));
						//hoursLine
						StdDraw.setPenRadius(0.02);
						StdDraw.line(0, 0, -0.5*Math.cos((h+m/60.0)*ticForHour+Math.PI/2), 0.5*Math.sin((h+m/60.0)*ticForHour+Math.PI/2));
						StdDraw.show(998);
						//System.out.printf("%d : %d : %d\n", h, m, s);
					}
					second = 0;
				}
				minute = 0;
			}
			hour = 0;
		}
		
	}

}
