package anton.alerty.algorithms;
import java.util.Arrays;

public class No2Slash {

	public static char[] no2slash(char[] name) {
		int count = 0;
		for (int x = 1; x < name.length-count; ) {
			
			if ((name[x-1] == '/') && (name[x] == '/')) {
				for (int y = x + 1; y < name.length; y++) {
					name[y-1] = name[y];
				}
				count++;			
			} else x++; 
		}
		
		name = (new String(name)).substring(0, name.length-count).toCharArray();
		return name;
	}
	public static void main(String[] args) {

		String s = "///////////////////////////////d:///////////work//////////////////////////////pho//////////////////////////////////////////////to//////////////////////////";
		s = s + s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s;
		s = s + s + s + s + s + s ;
		char[] chArray = s.toCharArray();
		Stopwatch sw = new Stopwatch();
		char[] chArrayNo2Slash = no2slash(chArray);
		double est = sw.elapsedTime();
		System.out.println(est);
		System.out.println(chArray);
		System.out.println(chArrayNo2Slash);
	}

}
