import java.util.Scanner;


public class hw8_P1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter total number of integers, n");
		int n = input.nextInt();
		int[] maxSearch = new int[n];
		
		System.out.println("Please, enter " + n + " integers:");
		for (int i = 0; i < n; i++){
			maxSearch[i] = input.nextInt();
		}
		
		printArray(maxSearch);
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < n-1; i++){
			 max = maxNumber(maxSearch[i], maxSearch[i+1]);
		}
		
		for (int i = 0; i < n-1; i++){
			 min = minNumber(maxSearch[i], maxSearch[i+1]);
		}
		
		System.out.println("Min / Max: " + min + " / " + max);

	}
	
	public static int maxNumber(int a, int b){
		int max;
		if (a >= b){
			max = a;
			return max;
		} 
			max = b;
			return max;	
	}

	public static int minNumber(int a, int b){
		int min;
		if (a <= b){
			min = a;
			return min;
		} 
			min = b;
			return min;	
	}
	
	public static void printArray(int[] arr){
		System.out.println("Array:");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
