import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int n, k;
		long factN = 1;
		long factK = 1;
		
		System.out.println("Enter N and K: ");
		n = input.nextInt();
		
		if (n >= 21 ){
			System.out.println("N too big! Please re-enter N");
			n = input.nextInt();
			System.out.println("Now enter K");
		}
		
		k = input.nextInt();
		
		if ((k <= 1) || (k >=n )){
			System.out.println(" K <= 1 or K > N! Please re-enter K!");
			k = input.nextInt();
		}
		
		for (int i=1; i<=n; i++){
			factN *=i;
		}
		
		for (int i=1; i<=k; i++){
			factK *=i;
		}
			
		long result = factN / factK;
		
		System.out.println("N!/K! " + " = " + factN + "/" + factK + " = " + result);
		
	}

}
