package april29th;

import java.util.Scanner;

public class Problem29Apr_2 {

	public static void main(String[] args) {
		// Problem 2 from Lecture No3, 29th April
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		//System.out.println("Please enter an integer, a: ");
		//int numA = input.nextInt();
		int numA = -99;
		
		if (numA > 0) {
			if (numA % 2 == 0){
	            System.out.println("a=" + numA + " is positive and even.");
	        } else {
	            System.out.println("a=" + numA + " is positive and odd.");
	        }
		} else if (numA < 0){
			if (numA % 2 == 0){
				System.out.println("a=" + numA + " is negative and even.");
			} else {
				System.out.println("a=" + numA + " is negative and odd.");
			}
		} else {
			System.out.println("a is zero!");
		}
			
	}

}
