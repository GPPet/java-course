package may07th;

import java.util.Scanner;

public class Problem07May_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N and M");
		int n = input.nextInt();
		int m = input.nextInt();
		long pow = 1;
		
		for (int i = 1; i <= m; i++) {
			pow *= n; 
		}
		
		System.out.println("N^M = " + pow);
			
	}
}
