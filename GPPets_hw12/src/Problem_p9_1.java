import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Problem_p9_1 {

	public static void main(String[] args) {
		// Направете програма, която приема масив от 10 числа. След това програмата приема 1 число. 
		// Ако числото фигурира в масива, изведете на екрана следващото по големина число от подадените
		
		Scanner input = new Scanner(System.in);
		int[] numberArr = new int[10];
		
		for(int i = 0; i < numberArr.length; i++){
			System.out.println("Enter a number:");
			numberArr[i] = input.nextInt();
		}
		Arrays.sort(numberArr);
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(numberArr[0]);
		for(int i = 1; i < numberArr.length; i++){
			if(numberArr[i] != numberArr[i-1]) numberList.add(numberArr[i]);
		}
		System.out.println("You entered " + numberList.size() + " unique numbers!");
		System.out.println(numberList);
		
		System.out.println("Now enter a number to find:");
		int key = input.nextInt();
		boolean keyIsFound = false;
		
		for(int i = 0; i < numberArr.length; i++){
			if(numberArr[i] == key && (i != numberArr.length-1)) {
				System.out.println("number " + key + " was found. Next larger number is " + numberArr[i+1]);
				keyIsFound = true;
				break;
			}
			if(numberArr[i] == key && (i == numberArr.length-1)) {
				System.out.println("number " + key + " was found and is the largest in the series");
				keyIsFound = true;
				break;
			}
		}
		if (keyIsFound == false) System.out.println("number " + key + " was not found in the series!");
		
	}

}
