package may22th.countries;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Coutries_capitals {

	public static void main(String[] args) {
		String pathRead = "/home/gp5/Documents/Java/GPPet_java-course/GPPets_labwork/src/may22th/countries/countries.txt";
		String pathWrite = "/home/gp5/Documents/Java/GPPet_java-course/GPPets_labwork/src/may22th/countries/capitals.txt";
		
		Scanner input = new Scanner(System.in);
		
		try {
			FileReader countries = new FileReader(pathRead);
			BufferedReader bufferedCountries = new BufferedReader(countries);
			FileWriter capitals = new FileWriter(pathWrite);
			BufferedWriter bufferedCapitals = new BufferedWriter(capitals);
			
			while (bufferedCountries.ready()){
				try {
					String line = bufferedCountries.readLine();
					System.out.println(line);
					System.out.println("# Please, enter the capital of " + line);
					String capital = input.nextLine() + "\n";
					bufferedCapitals.write(capital);
					
				} catch (Exception e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}
			}
			
			bufferedCapitals.close();
			bufferedCountries.close();
		
		} catch (IOException e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("Ready!!! :-)");
		
	}

}
