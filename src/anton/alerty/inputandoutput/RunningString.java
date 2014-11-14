package anton.alerty.inputandoutput;

import java.awt.Font;

public class RunningString {

	public static void main(String[] args) {
		String[] strArray = args;
		String str = "";
		for (int i = 0; i < strArray.length - 1; i++) {
			str += strArray[i] + " ";
		}		
		int speed = Integer.parseInt(args[strArray.length - 1]);
		StdDraw.setXscale(0, 100);
		StdDraw.setYscale(0, 100);
		double x = 0; 
		double y = 50;
		StdDraw.setPenRadius(0.1);
		 Font f = new Font("Arial", Font.BOLD, 60);
		StdDraw.setFont(f);
		while (true) {
			for (int i = 110; i > -15; i--) {
				StdDraw.text(i, y, str);
				StdDraw.show(speed);
				StdDraw.clear();
			}	
		}
	}

}
