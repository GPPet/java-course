package may08th;

public class Problem1 {
	//Array symmetry check

	public static void main(String[] args) {

		int[] symm = new int[5];
		
		symm[0] = 1;
		symm[1] = 2;
		symm[2] = 2;
		symm[3] = 2;
		symm[4] = 1;
		
		int n = symm.length;
		String symmetry = "";
		
		
		if(n % 2 == 0){
			for(int i = 0; i < (n/2); i++){
				if (symm[i] == symm[n-i-1] ) {
					symmetry = "symmetric";
				} else {
					symmetry = "not symmetric";
				}
			}
		} else {
			for(int i = 0; i < (n/2); i++){
				if ( symm[i] == symm[n-i-1] ) {
					symmetry = "symmetric";
				} else {
					symmetry = "not symmetric";
				}
			}
		}
		
		System.out.print("Array is " + symmetry + ".");
	}
}