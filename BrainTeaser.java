package CSCI1010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BrainTeaser {
	
	//ArrayList of Pair
	private ArrayList<Pair> list = new ArrayList<Pair>();
	private int score;
	
	public void createContentFile() throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("myFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		System.out.println("Enter your word: ");
		while(input.hasNext()) {
			String word = input.next();
			if(word.toLowerCase().equals("done"))
				break;
			pw.println(word);
			System.out.println("Enter your word: ");
		}
		
		input.close();
		pw.close();
	}
	
	public boolean generateList() throws FileNotFoundException {
		Scanner scan = null; 
		boolean result = false;
		
		try {
			scan = new Scanner(new BufferedReader(new FileReader("myFile.txt")));

			while(scan.hasNextLine()) {
				boolean redo = false;
				String word = scan.nextLine();
				String shuffled;
				
				do {
					shuffled = this.getShuffled(word);
					if(shuffled.contains(word))
						redo = true;
				}while(redo);
				
				Pair pair = new Pair(word, shuffled);
				list.add(pair);
				
				result = true;
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Error opening content file: " + e);
			
		}finally {
			System.out.println("\nLet's create the content file...\n");
		}
		
		return result;
	}
	
	public void displayList() {
		System.out.println("The contents of the list: ");
		
		for(Pair pair: list) {
			System.out.println(pair.getOriginal() + ", " + pair.getShuffled());
		}
	}
	
	public String getShuffled(String word) {
		String result = null;
		Random rand = new Random();
		
		char charray[] = new char[word.length()];
		
		int index = 0;
		int pos;
		while(index < word.length()) {
			pos = rand.nextInt(word.length());
			if(charray[pos] == 0x00)
				charray[pos] = word.charAt(index++);
		}
		
		result = new String(charray); // converts char array to a String
		return result;
	}
	
	public void quiz() {
		//get a pair from the list
		//display the shuffled word to the user
		//prompt the user to guess and type the original word
		//compare the typed word with the original one in the pair read from the list.
		//if there is a match then the user scores a point
		//continue with the rest of the pairs from the list
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quiz begins...\n");
		
		for(int i=0; i < this.list.size(); i++) {
			Pair pair = list.get(i);
			System.out.println("Shuffled word: " + pair.getShuffled());
			System.out.println("Guess and type your word: ");
			
			if(input.hasNext()) {
				String word = input.next();
				if(word.equals(pair.getOriginal())) {
					this.score++;
					System.out.println("Congratulations! You got it right!");
				}
				else {
					System.out.println("Sorry you got it wrong!");
				}
			}
		}
		
		System.out.println("Done!");
	}
}
