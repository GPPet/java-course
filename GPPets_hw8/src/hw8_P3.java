import java.util.Random;


public class hw8_P3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a, b, c;
		int count = 0;
		long prod = 1;
		
		while (count < 20){
			a = rand.nextInt(100) + 1;
			b = rand.nextInt(100) + 1;
			c = rand.nextInt(100) + 1;
			
			prod *= multiplyThreeInt(a, b, c);
			System.out.println("Run " + count + " : " + prod + ";");	
			count++; 
		}
		
		System.out.println("Final: " + prod + ".");

	}
	
	public static long multiplyThreeInt(int a, int b, int c){
		long prod = a*b*c;
		return prod;
	}

}
