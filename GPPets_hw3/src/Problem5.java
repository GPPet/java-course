import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// Game bonus points
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		/*System.out.println("Please, enter your score: ");
		int numA = input.nextInt();
		or:*/
		int numA = 8; 
		
		//Calculate bonus points and print out the total score:
		if ((numA >= 1) & (numA <= 3)){
			int bonus = numA*5;
			int total = numA + bonus;
			System.out.println("Score:\t" + numA + "\nBonus:\t" + bonus + "\nTotal:\t" + total);
		} else if ((numA >= 4) & (numA <= 6)){
			int bonus = numA*10;
			int total = numA + bonus;
			System.out.println("Score:\t" + numA + "\nBonus:\t" + bonus + "\nTotal:\t" + total);
		} else if ((numA >= 7) & (numA <= 9)){
			int bonus = numA*50;
			int total = numA + bonus;
			System.out.println("Score:\t" + numA + "\nBonus:\t" + bonus + "\nTotal:\t" + total);
		} else {
			System.out.println("Incorrect value! Please, re-enter your score!");
		}
		
	}
}
