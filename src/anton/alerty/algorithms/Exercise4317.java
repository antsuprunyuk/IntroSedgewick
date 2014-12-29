package anton.alerty.algorithms;

import java.util.Iterator;

public class Exercise4317 {

	
	public static Stack<String> copy(Stack<String> S) {
	
		Stack<String> copyS = new Stack<String>();
		Stack<String> temp = new Stack<String>();
		Iterator<String> i = S.iterator();
		while(i.hasNext()) {
			temp.push(i.next());
		}
		while (!temp.isEmpty()) {
			copyS.push(temp.pop());
		}
		return copyS;
	}
	
	public static void main(String[] args) {
		
		Stack<String> S = new Stack<String>();
		while (!StdIn.isEmpty()) {
			String str = StdIn.readString();
			if (!str.equals("-")) {
				S.push(str);
			} else System.out.println(S.pop());	
		}
		
		Stack<String> copyS = copy(S);
		for (String iterS : copyS) {
			System.out.print(iterS + " ");
		}
		System.out.println();
		for (String iterS : S) {
			System.out.print(iterS + " ");
		}	
	}

}
