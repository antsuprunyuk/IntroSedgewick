package anton.alerty.algorithms;

public class Exercise436 {

	
	
	public static void main(String[] args) {

		 ArrayStackOfStrings stack = new  ArrayStackOfStrings(25);
		 String str = StdIn.readString();
		 for (int i = 0; i < str.length(); i++) {
			 String ch = str.substring(i, i+1);
			 if (ch.equals("(") || ch.equals("[") || ch.equals("{")) {		
				 stack.push(ch);
			 }
			 else if (ch.equals(")")) {
				 if (!(stack.pop()).equals("(")) { 
					 System.out.println("All is lost");
					 return;
				 }
			 }
			 else if (ch.equals("]")) {
				 if (!(stack.pop()).equals("[")) { 
					 System.out.println("All is lost");
					 return;
				 }
			 }
			 else if (ch.equals("}")) {
				 if (!(stack.pop()).equals("{")) { 
					 System.out.println("All is lost");
					 return;
				 }
			 }
		 }
		 if (stack.isEmpty()) System.out.println("That`s really true");
		 
	}

}
