import java.util.Scanner;
import java.util.Stack;


public class Problem_1 {

	public static void main(String[] args) {
		// Напишете програма, която обръща думите в едно изречение на обратно. Използвайте стек.
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a sentence:");
//		String sentence = input.nextLine();
		
//		String sentence = "I am from planet Earth";
		
		String sentence = "Murder for a jar of red Rum";
		System.out.println("Original:\n" +  sentence);
		
		System.out.println("\nReversed:");
		String[] stringSentence = sentence.split("[ .,?!]");
		
		Stack<String> stackSentence = new Stack<String>();
		for(String word : stringSentence){
			stackSentence.add(word);
		}
		
		String reverseSentence = "";
		while(stackSentence.size() > 0){
			reverseSentence += stackSentence.pop() + " ";
		}
		
		System.out.print(reverseSentence.trim() + ".");
		
		
		//Mirror
		System.out.println("\nMirror:");
		Stack<Character> mirrorSentence = new Stack<Character>();
		for(int letter = 0; letter < sentence.length(); letter++){
			mirrorSentence.add(sentence.charAt(letter));
		}
		
		String mirror = "";
		while(mirrorSentence.size() > 0){
			mirror += mirrorSentence.pop();
		}
		
		System.out.print(mirror.trim());
		
		
		
	}

}
