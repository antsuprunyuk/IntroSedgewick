package anton.alerty.recursion;

public class BeckettGrayCode {
	static int[] code = new int[4];
	
	public static void moves(int n, boolean enter) {
		if (n == 0) return;
		moves(n-1, true);
		if (enter) {
			//System.out.println("enter " + n);
			code[4-n] = 1;
		}
		else { 
			//System.out.println("exit " + n);
			code[4-n] = 0;
		}
		for (int i = 0; i < code.length; i++) {
			System.out.print(code[i]);
		}
		System.out.println();
		
		moves(n-1, false);
	}
	public static void main(String[] args) {
		for (int i = 0; i < code.length; i++) {
			System.out.print(code[i]);
		}
		System.out.println();
		moves(4, true);
	}

}
