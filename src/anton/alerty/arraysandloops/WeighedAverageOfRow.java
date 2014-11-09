package anton.alerty.arraysandloops;

public class WeighedAverageOfRow {

	public static void main(String[] args) {
		int[][] a = { 
				   { 99, 85, 98 }, 
				   { 98, 57, 78 }, 
				   { 92, 77, 76 }, 
				   { 94, 32, 11 }, 
				   { 99, 34, 22 }, 
				   { 90, 46, 54 }, 
				   { 76, 59, 88 }, 
				   { 92, 66, 89 }, 
				   { 97, 71, 24 }, 
				   { 89, 29, 38 }
				};
		double[] weighs = { 0.25, 0.25, 0.5 };
		double[] result = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < weighs.length; j++){
				result[i] += a[i][j] * weighs[j];  
			}			
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

}
