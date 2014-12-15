package anton.alerty.algorithms;

public class WordFrequency {

	public static boolean validString(String str) {
		//boolean valid = true;
		String validStart="abcdefghijklmnoqprstvuwxyzABCDEFGHIJKLMNOQPRSTUVWXYZ";
		String validLetters = "abcdefghijklmnoqprstvuwxyzABCDEFGHIJKLMNOQPRSTUVWXYZ.,:;?!-0123456789 ";
		if(str.length() < 2 || str.length() > 15) return false;
		if(!validStart.contains(str.substring(0,1))) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if(!validLetters.contains(str.substring(i, i+1))) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		In in = new In("wordfreqOut.txt");
		Out out = new Out("wordfreqOut2.txt");
		while (!in.isEmpty()) {
			String str = in.readLine();
			if (validString(str)) {
				out.println(str);
			}
		}	
	}

}
