public class Problem6 {
	//Fill in array's elements, 5x6, with 30->1
	
	public static void main(String[] args) {
		
		int a = 6;
		int b = 7;
		int[][] twoDRev = new int[a][b];
		
		int x = a*b; 
		
		for(int row = 0; row < twoDRev.length; row++){
			for(int col = 0; col < twoDRev[row].length; col++){
						twoDRev[row][col] = x--;
						System.out.print(twoDRev[row][col] + "\t");
				}
			System.out.println();
		}
		
	}		
}