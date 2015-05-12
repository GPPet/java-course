import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter array length n:");
		int n = input.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < array.length; i++){
			array[i] = i + (i+n)%7;
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		int sumEven = 0;
		
		for(int i = 0; i < array.length; i++){
			if (array[i] % 2 == 0){
				sumEven +=array[i];
			}
		}
		System.out.println("Sum of even elements:" + sumEven);
		
		
	}

}
