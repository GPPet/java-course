package may07th;

public class Problem07May_3c {

	public static void main(String[] args) {
		
		int n;
		
		for (n = 1; n<=100; n++){
			if ((n % 7 == 0) && (n % 11 == 0))  {
				System.out.println("n = " + n);
			}
		} 
			
	}
}