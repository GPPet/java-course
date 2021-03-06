import java.util.HashMap;
import java.util.Scanner;


public class hw10_P3 {

	public static void main(String[] args) {
		// Напишете програма, която приема 5 карти от тестето за игра. 
		// Програмата трябва да извежда на екрана дали играчът има чифт, сет или каре. 
		// Картите да са числата от 2 до 10 плюс буквите: J, Q, K, A.
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please, enter the cards:");
//		String text = input.nextLine();
		
		String text = "2,2,J,J,Q";
		
		String[] splitText = text.split("\\W");
		
		int count = 0;
		
		HashMap<String, Integer> cardCount = new HashMap<String, Integer>();
		for(String card : splitText){
			if(card != "") cardCount.putIfAbsent(card, count);
		}
		
		for(String card : cardCount.keySet()){
			count = 0;
			for(int i = 0; i < splitText.length; i++){
				if(splitText[i].equals(card)) count++;
			}
			cardCount.put(card, count);
		}
		
		System.out.print("Unique cards: " ); 
		for(String card : cardCount.keySet()){
			if(cardCount.get(card)==1) System.out.print(card + " ");
		}
		
		System.out.println();
		
		System.out.println("Counting cards: " ); 
		for(String card : cardCount.keySet()){
			if(card!="" && cardCount.get(card)==2) System.out.println("Pair: " + card);
			if(card!="" && cardCount.get(card)==3) System.out.println("Set: " + card);
			if(card!="" && cardCount.get(card)==4) System.out.println("Quads: " + card);
		}

	}

}
