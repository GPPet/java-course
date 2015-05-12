package may08th;

public class Problem4 {
	//Fill in array's elements, 4x4, horizontal
	
	public static void main(String[] args) {
		
		int[][] twoD = new int[4][4];
		
		for(int row = 0; row < twoD.length; row++){
			for(int col = 0; col < twoD[row].length; col++){
				twoD[row][col] = ((col+1) + (row*twoD.length)) ;
				System.out.print(twoD[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int row = 0; row < twoD.length; row++){
			for(int col = 0; col < twoD[row].length; col++){
				if (twoD[row][col] % 2 != 0) {
					twoD[row][col] = twoD[row][col] *2 ;
				}
				System.out.print(twoD[row][col] + " ");
			}
			System.out.println();
		}
		
	}
		
		
}