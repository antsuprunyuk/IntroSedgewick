package anton.alerty;

import java.awt.*;

import javax.swing.*;

public class MarsagliaRandom {

class  MyDrawPanel extends JPanel {
	public void paintComponet(Graphics g) {
		g.setColor(Color.ORANGE);
		

	}
}
	public static void main(String[] args) {
		double a = 0, b = 0;
		do {
			a = 2 * Math.random() - 1;
			b = 2 * Math.random() - 1;
		} while ((a*a + b*b) > 1);
		System.out.println(a + " " + b);
		double x =  (2 * a * Math.sqrt(1 - a*a - b*b));
		double y =  (2 * b * Math.sqrt(1 - a*a - b*b));
		double z = (1 - 2 * (a*a + b*b));
		System.out.println(x + " " + y + " " + z + "      " + (
				x*x + y*y + z*z));
	}

}
