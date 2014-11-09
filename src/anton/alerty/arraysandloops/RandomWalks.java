package anton.alerty.arraysandloops;

import java.awt.*;

import javax.swing.*;

class MyPanel1 extends JPanel {
	public void paintComponent(Graphics g){
		g.setColor(Color.blue);
		int N = 25;
		int T = 10;
		int dx = 20;
		int dy = 20;
		final int WID = 2;
		int length = 0;
		int deadEnds = 0;
		for (int i = 0; i < 1; i++) {
			int x = N / 2, y = N / 2;
			boolean[][] b = new boolean[N][N];
			while ((x > 0) && (x  < N - 1) && (y > 0) && (y  < N  - 1)) {
				
				int tx = dx * x;
				int ty = dy * y;
				b[x][y] = true;
				if ((b[x-1][y])&&(b[x+1][y])&&(b[x][y-1])&&(b[x][y+1])) {
					System.out.println("DEADWALK, length = "  + length); 
					deadEnds++; 
					break;
				}
				double temp = Math.random();
				if 		(temp < 0.25) {if (!b[x+1][y]) {
											x = x + 1;
											g.fillRect(tx, ty, dx, WID);
											length++;
									   } 
				} else if (temp < 0.50) {if (!b[x][y+1]){
											y = y + 1;
											g.fillRect(tx, ty, WID, dy);
											length++;
										}
				} else if (temp < 0.75) {if (!b[x-1][y]){
											x = x - 1;
											g.fillRect(tx - dx, ty, dx, WID);
											length++;
										}
				} else if (temp < 1.00) {if (!b[x][y-1]) {
											y = y - 1;
											g.fillRect(tx, ty - dy, WID, dy);
											length++;
											}
				}
			}
			if ((x == 0) || (x == N - 1) || (y == 0) || (y == N  - 1)) { System.out.printf("X = %d,  Y = %d, length = %d \n", x, y, length); }
		}
		//System.out.println(100.0deadEndsT + % dead ends);
	}
}

public class RandomWalks {

	public static void main(String[] args) {
		JFrame frame = new JFrame("RandomWalksSelfAvoiding");
		MyPanel1 panel = new MyPanel1();
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}