
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class hw9_P6 {

	public static void main(String[] args) {
		String pathRead = "/home/gp5/Documents/Java/GPPet_java-course/GPPets_hw9/src/hw9_P6/LOTR.txt";
		String pathWrite = "/home/gp5/Documents/Java/GPPet_java-course/GPPets_hw9/src/hw9_P6/LOTR_noSigns.txt";
		
		
		try {
			FileReader original = new FileReader(pathRead);
			BufferedReader bufferedOriginal = new BufferedReader(original);
			FileWriter noSigns = new FileWriter(pathWrite);
			BufferedWriter bufferedNoSigns = new BufferedWriter(noSigns);
			
			while (bufferedOriginal.ready()){
				try {
					String line = bufferedOriginal.readLine();
					//System.out.println(line);
					String lineNoSigns = line.replaceAll("\\p{P}", "");
					bufferedNoSigns.write(lineNoSigns);
					
				} catch (Exception e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}
			}
			
			bufferedNoSigns.close();
			bufferedOriginal.close();
		
		} catch (IOException e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("Ready!!! :-)");
		
	}

}
