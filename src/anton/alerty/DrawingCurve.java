package anton.alerty;

import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		int x = 1, y = 1;
		for (int i = -200; i < 200; i++) {
			x = i;
			y = (int) (x * x - 25);
			g.fillRect(200+x*5, 500-y, 3, 3);
			System.out.println(x + " " + y );
		}
	}
}

public class DrawingCurve {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test graphics");
		MyDrawPanel panel = new MyDrawPanel();
		frame.getContentPane().add(panel);
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
