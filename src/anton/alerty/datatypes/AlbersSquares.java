package anton.alerty.datatypes;

import java.awt.Color;

public class AlbersSquares {

    public static void main(String[] args) {

        StdDraw.setCanvasSize(1200, 1200);
        double ratio = 1000/1000.0;

        int N = 6; 
        Color[] c = new Color[N];
        // first color
        int r1 = Integer.parseInt(args[0]);
        int g1 = Integer.parseInt(args[1]);
        int b1 = Integer.parseInt(args[2]);
        c[0] = new Color(r1, g1, b1);

        // second color
        int r2 = Integer.parseInt(args[3]);
        int g2 = Integer.parseInt(args[4]);
        int b2 = Integer.parseInt(args[5]);
        c[1] = new Color(r2, g2, b2);
        
        // third color
        int r3 = Integer.parseInt(args[6]);
        int g3 = Integer.parseInt(args[7]);
        int b3 = Integer.parseInt(args[8]);
        c[2] = new Color(r3, g3, b3);

        for (int i = 0; i < 2; i++) {
        	for (int j = 0; j < 3; j++) {
	        	StdDraw.setPenColor(c[j]);
	        	StdDraw.filledSquare((2*j + 1)/6.0, (2*i + 1)/4.0, 1/8.0);
	        	StdDraw.setPenColor(c[(j+ i + 1)%3]);
	        	StdDraw.filledSquare((2*j + 1)/6.0, (2*i + 1)/4.0, 1/12.0);
        	}	
        }
    } 
} 
