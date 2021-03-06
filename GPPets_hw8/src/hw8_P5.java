public class hw8_P5 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 10; i <= 999; i++){
			if (checkIntSymmetry(i) == true){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total: " + count);
		
	}

	public static boolean checkIntSymmetry(int a){
		boolean isSymmetric = true;
		int tmp = a;
		int aDigits = 1;
		
		while ((tmp=tmp/10) != 0){
			aDigits++;
		}
		
		int[] aInDigits = new int[aDigits];
		
		for(int i = 0; i < aDigits; i++){
			aInDigits[aDigits-1-i] = a % 10;
			a = a / 10;
		}
		
		
		for(int i = 0; i < (aDigits + aDigits % 2) / 2; i++){
			if (aInDigits[i] != aInDigits[aDigits-1-i]){
				isSymmetric = false;
				break;
			} 
		}
		
		return isSymmetric;
	
	}
}