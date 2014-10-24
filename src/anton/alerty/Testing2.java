package anton.alerty;

public class Testing2 {

	public static void main(String[] args) {
		int d = Integer.parseInt(args[0]);
		int v = 1; //power of 2
		
		//finding the highest power of 2
		while (v <= d/2) {
			v *= 2;
		}
		System.out.println(d);
		while (d > 0) {
			//System.out.println(d + "  " + v);
			if (v <= d) {
				System.out.print("1");
				d -= v;
			} else {
				System.out.print("0");
				
			}
			v /= 2;
		}
	}

}
