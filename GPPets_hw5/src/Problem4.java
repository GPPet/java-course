import java.util.Scanner;

public class Problem4 {
	//Search a number in A[n] and prints out the index i of the element

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter the number x:");
		int x = input.nextInt();
		int hits = 0;
		
		/*
		int[] array = new int[15];
		
		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}
		*/
		
		int[] array = {0,2,5,6,7,3,4,5,23,567,890,545,23,45,56}; 
		
		
		for(int i = 0; i < array.length; i++){
			if (array[i] == x){
				System.out.print("A[" + i + "] ");
				hits++;
			}
		}
				
		System.out.println();
		
		if (hits != 0){
			System.out.println("x is present " + hits + " time(s) in the array!");
		} else {
			System.out.println("x is not present in the array!");
		}

	}

}
