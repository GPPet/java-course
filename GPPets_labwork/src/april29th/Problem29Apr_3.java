package april29th;

import java.util.Scanner;

public class Problem29Apr_3 {

	public static void main(String[] args) {
		// Problem 3 from Lecture No3, 29th April
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		//System.out.println("Please enter an integer, a: ");
		//int numA = input.nextInt();
		int numA = 88;
		
		if ((numA >= 1) && (numA <= 5)) {
			if (numA % 2 == 0){
	            System.out.println("a\u22f2 [1;5] is even!");
	        } else {
	            System.out.println("a\u22f2 [1;5] is odd!");
	        }
		} else if ((numA >= 6) && (numA <=15)){
			if (numA % 3 == 0){
	            System.out.println("a\u22f2 [6;15] and is divisible by 3!");
	        } else {
	            System.out.println("a\u22f2 [6;15] but is not divisible by 3.");
	        }
		} else {
			if (numA > 0){
	            System.out.println("a\u2209 [1;15] and is a positive number.");
	        } else if (numA < 0){
	            System.out.println("a\u2209 [1;15] and is a negative number.");
	        } else {
	        	System.out.println("a is zero!");
	        }
	        }
	}
}
