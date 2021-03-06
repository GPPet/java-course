import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int n, k, m;
		long factN = 1;
		long factK = 1;
		long factM = 1;
		
		System.out.println("Enter N and K: ");
		n = input.nextInt();
		k = input.nextInt();
		
		if ((n >= 21 ) | (k >= 21)){
			System.out.println("N or K too big! Please re-enter N and K:");
			n = input.nextInt();
			k = input.nextInt();
		}
		
		if (k >= n ){
			System.out.println("K >= N! Please re-enter K:");
			k = input.nextInt();
		}
		
		for (int i=1; i<=n; i++){
			factN *=i;
		}
		
		for (int i=1; i<=k; i++){
			factK *=i;
		}
		
		m = n-k;
		for (int i=1; i<=m; i++){
			factM *=i;
		}
			
		long result = (factN / factM) * factK;
		
		if (result < 0){
			System.out.println("Error!");
		} else {
			System.out.println("N!*K!/(N-K)! " + " = (" + factN + "*" + factK + ")/" + factM + " = " + result);
		}
	}

}
