import java.util.Scanner;


public class hw8_P2 {

	public static void main(String[] args) {
		System.out.println("Please, enter your name:");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		String nameCap = name.substring(0,1).toUpperCase() + name.substring(1);
		String greetingName = sayGreetingName(nameCap);
		System.out.println(greetingName);

	}

	public static String sayGreetingName(String name){
		String sayGreetingName = "Greeting, " + name + "!";
		return sayGreetingName;
	}
}
