/*
 * Class: CMSC203 
 * Instructor: 
 * Description: Create a program where you the user tries to guess a random color
 * Due: 9/15/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Grant Chien
*/
// Imports
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ESPGame {
	public static void main(String[] args)throws FileNotFoundException{
		// Variable Declaration
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		final int GAME_LOOP = 3;
		final String FILE_NAME = "EspGameResults.txt";
		int option, correct = 0, number, count = 0;
		String name, description, dueDate, guess, newGame, color1 = "", color2 = "", color3 = "", color4 = "", color5 = "", color6 = "", color7 = "", color8 = "", color9 = "", color10 = "", color11 = "", color12 = "", color13 = "", color14 = "", color15 = "", color16 = "";
		
		System.out.println("Welcome to ESP - extrasensory perception!");
		
		do {
		String color = "", fileName;
		
		// Menu Option
		System.out.println("Would you please choose one of the 4 options from the menu: \n\n");
		System.out.println("\t1- read and display on the screen first 16 names of colors from a file colors.txt, so the player can select one of them names of colors.");
		System.out.println("\t2- read and display on the screen first 10 names of colors from a file colors.txt, so the player can select one of them names of colors.");
		System.out.println("\t3- read and display on the screen first 5 names of colors from a file colors.txt, so the player can select one of them names of colors.");
		System.out.println("\t4- Exit form a program");
		
		System.out.println("Enter the option: ");
		option = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the filename: ");
		fileName = sc.nextLine();
		
		File file = new File(fileName);
		if(!file.exists()) {
			System.out.println("File Does Not Exist.");
			continue;
		}
		int limit = 0;
		
		Scanner readFile1 = new Scanner(file);
		if(option == 1) {
			limit = 16;
			System.out.println("There are sixteen colors form a file:");
			while(readFile1.hasNextLine() && count < limit) {
				count++;
				color = readFile1.nextLine();
				System.out.println(count + " " + color);
				if(count == 1) {
					color1 = color;
				} else if(count == 2) {
					color2 = color;
				} else if(count == 3) {
					color3 = color;
				} else if(count == 4) {
					color4 = color;
				} else if(count == 5) {
					color5 = color;
				} else if(count == 6) {
					color6 = color;
				} else if(count == 7) {
					color7 = color;
				} else if(count == 8) {
					color8 = color;
				} else if(count == 9) {
					color9 = color;
				} else if(count == 10) {
					color10 = color;
				} else if(count == 11) {
					color11 = color;
				} else if(count == 12) {
					color12 = color;
				} else if(count == 13) {
					color13 = color;
				} else if(count == 14) {
					color14 = color;
				} else if(count == 15) {
					color15 = color;
				} else if(count == 16) {
					color16 = color;
				}
			}
			readFile1.close();
		} else if(option == 2) {
			limit = 10;
			System.out.println("There are ten colors form a file:");
			while(readFile1.hasNextLine() && count < limit) {
				count++;
				color = readFile1.nextLine();
				System.out.println(count + " " + color);
				if(count == 1) {
					color1 = color;
				} else if(count == 2) {
					color2 = color;
				} else if(count == 3) {
					color3 = color;
				} else if(count == 4) {
					color4 = color;
				} else if(count == 5) {
					color5 = color;
				} else if(count == 6) {
					color6 = color;
				} else if(count == 7) {
					color7 = color;
				} else if(count == 8) {
					color8 = color;
				} else if(count == 9) {
					color9 = color;
				} else if(count == 10) {
					color10 = color;
				}
			}
			readFile1.close();
		} else if(option == 3) {
			limit = 5;
			System.out.println("There are five colors form a file:");
			while(readFile1.hasNextLine() && count < limit) {
				count++;
				color = readFile1.nextLine();
				System.out.println(count + " " + color);
				if(count == 1) {
					color1 = color;
				} else if(count == 2) {
					color2 = color;
				} else if(count == 3) {
					color3 = color;
				} else if(count == 4) {
					color4 = color;
				} else if(count == 5) {
					color5 = color;
				}
			}
			readFile1.close();
		} else {
			System.out.println("Invalid Option.");
			continue;
		}
		
	
		correct = 0;
		
		// Playing Game Loop
		for(int i = 1; i < GAME_LOOP + 1; i++) {
			Scanner readFile2 = new Scanner(file);
			System.out.println("\nRound " + i);
			System.out.println("\nI am thinking of a color.");
			System.out.println("Is it one of list of colors above?");
			System.out.println("Enter your guess: ");
			guess = sc.nextLine();
			while(!guess.equalsIgnoreCase(color1) && !guess.equalsIgnoreCase(color2) && !guess.equalsIgnoreCase(color3) && !guess.equalsIgnoreCase(color4) && !guess.equalsIgnoreCase(color5)
					&& (limit < 6 || !guess.equalsIgnoreCase(color6)) && (limit < 7 || !guess.equalsIgnoreCase(color7)) && (limit < 8 || !guess.equalsIgnoreCase(color8)) && (limit < 9 || !guess.equalsIgnoreCase(color9))
					&& (limit < 10 || !guess.equalsIgnoreCase(color10)) && (limit < 11 || !guess.equalsIgnoreCase(color11)) && (limit < 12 || !guess.equalsIgnoreCase(color12)) && (limit < 13 || !guess.equalsIgnoreCase(color13))
					&& (limit < 14 || !guess.equalsIgnoreCase(color14)) && (limit < 15 || !guess.equalsIgnoreCase(color15)) && (limit < 16 || !guess.equalsIgnoreCase(color16))) {
				System.out.println("Invalid Option. Guess Again.");
				guess= sc.nextLine();
			}
			number = random.nextInt(limit) + 1;
			for(int j = 0; j < number; j++) {
				color = readFile2.nextLine();
			}
			System.out.println("\nI was thinking of " + color);
			if(guess.equalsIgnoreCase(color)) {
				correct++;
			}
			for(int k = 0; k < 15 - number; k++) {
				readFile2.nextLine();
			}
			readFile2.close();
			
		}
		
		System.out.println("Game Over\n");
		System.out.println("You guessed " + correct + " out of 3 colors correctly.");
		System.out.println("Would you like to continue a Game? Type Yes/No");
		newGame = sc.nextLine();
		if(newGame.equalsIgnoreCase("yes")) {
			continue;
		} else {
			break;
		}
		
		} while(option != 4);
		
		// Asks user for information and prints it
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Describe yourself: ");
		description = sc.nextLine();
		System.out.println("Due Date: ");
		dueDate = sc.nextLine();
		System.out.println("Username: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Date: " + dueDate);
		
		// Prints output to file
		PrintWriter file = new PrintWriter(FILE_NAME);
		file.println("Game Over\n");
		file.println("\tYou guessed " + correct + " out of 3 colors correctly.");
		file.println("Due Date: " + dueDate);
		file.println("\tUsername: " + name);
		file.println("\tUser Description: " + description);
		file.println("\tDate: " + dueDate);
		file.close();
		sc.close();
	}
}
