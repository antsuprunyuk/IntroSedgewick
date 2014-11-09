package anton.alerty.arraysandloops;

import java.awt.*;

import javax.swing.*;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.blue);
		int x = 250, y = 250, count = 0;
		while ((x > 0)&&(x < 500)&&(y > 0)&&(x < 500)){
			double r = Math.random();
			if (r < 0.25) {
				x++;
			} else if (r < 0.5) {
				x--;
			} else if (r < 0.75) {
				y++;
			} else {
				y--;
			}
			g.fillRect(x, y, 1, 1);
			count++;
		}			
		System.out.println(count);
	}
}

public class RandomWalk {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("RandomWalk");
		MyPanel panel = new MyPanel();
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}