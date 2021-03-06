package hw2;

import java.util.Scanner;

public class Problem6_improved {
	// Circle; 
	// The initial project (hw2,problem6) is improved by using Math class
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please, enter the radius of the circle (r, in cm)");
		double radius = input.nextDouble();
		
		//perimeter
		double perim = 2 * Math.PI * radius;
		
		//area
		double area = Math.PI*Math.pow(radius, 2);
		
		System.out.println("The perimeter and area of a circle with r=" + radius + "cm are:\n" + perim + "cm and " + area + "cm\u00B2, respectively.");
		
		
	}	
}