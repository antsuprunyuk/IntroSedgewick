package anton.alerty.datatypes;

public class Exercise311 {

	public static void main(String[] args) {
		double w = Double.parseDouble(args[0]);
		Charge c1 = new Charge(.5 + w,  .5,			1.0);
		Charge c2 = new Charge(.5 - w,  .5, 		1.0);
		Charge c3 = new Charge(.5, 		.5 - w, 	1.0);
		Charge c4 = new Charge(.5, 		.5 + w, 	1.0);
		double px = .25;
		double py = .5;
		double potential = c1.potentialAt(px, py) + c2.potentialAt(px, py) +
						   c3.potentialAt(px, py) + c4.potentialAt(px, py);
		System.out.println(potential);
		
	}

}
