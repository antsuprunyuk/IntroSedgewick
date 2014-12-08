package anton.alerty.algorithms;

public class No2SlashLinear {

	public static char[] no2slash(char[] name) {
		int count = 0;
		char[] correctName = new char[name.length];
		correctName[0] = name[0];
		int correctX = 1;
		for (int x = 1; x < name.length; x++) {
			if ((name[x-1] == '/') && (name[x] == '/')) {
				count++;
				continue;			
			}  else {
				correctName[correctX] = name[x];
				correctX++;
			}
		}
		
		
		name = (new String(correctName)).substring(0, name.length-count).toCharArray();
		return name;
	}
	public static void main(String[] args) {
		String s = "///////////////////////////////d:///////////work//////////////////////////////pho//////////////////////////////////////////////to//////////////////////////";
		s = s + s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s+ s + s + s + s;
		s = s + s + s + s + s + s+ s + s + s + s+ s + s + s+s + s + s + s + s + s+ s + s + s + s+ s + s + s+s + s + s + s + s + s + s + s + s+ s + s + s + s+ s + s + s+s + s + s + s + s + s + s + s + s+ s + s + s + s+ s + s + s+s + s + s + s ;
		s = s + s + s + s; 
		char[] chArray = s.toCharArray();
		Stopwatch sw = new Stopwatch();
		char[] chArrayNo2Slash = no2slash(chArray);
		double est = sw.elapsedTime();
		System.out.println(chArray);
		System.out.println(chArrayNo2Slash);
		System.out.println(est);
	}

}
