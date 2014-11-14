package anton.alerty.inputandoutput;

public class PlottingDiamond {

	public static void main(String[] args) {
		double r = 0.5, x = 0.5, y = 0.5;		
		double[] xd = { x - r, x, x + r, x };
		double[] yd = { y, y + r, y , y - r };
		StdDraw.polygon(xd, yd);
		double[] xs = {x - r, x - r, x + r, x + r };
		double[] ys = {y - r, y + r, y + r, y - r };
		StdDraw.polygon(xs, ys);
		StdDraw.square(x, y, Math.sqrt(2)*r/2);
	}
}
/*Hello. I found one suspicious thing in your book Intro to Programming in Java. Please, check it, may be it`s misprint or mistake.  Page 142, almost on the top: 

" For example,
     double[] xd = { x-r, x, x+r, x };
     double[] yd = { y, y+r, y, y-r };
     StdDraw.polygon(xd,yd);
plots a diamond (a rotated 2r-by-2r square) centered on the point (x,y) "

     As I understand it`s not 'a rotated 2r-by-2r square'.    It`s a rotated Sqrt(2)*r - by - Sqrt(2)*r square.
                                        Thanks for attention.   
*/