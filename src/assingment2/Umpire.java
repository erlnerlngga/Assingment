package assingment2;

import java.util.Scanner;

public class Umpire {

	int[] numberGuessFromPlayer;
	int numFromGuesser;
	int numberOfPlayer;
	Scanner scan = new Scanner(System.in);;
	
	Umpire(){
		System.out.print("How many player want to play: ");
		numberOfPlayer = scan.nextInt();
		
		this.numberGuessFromPlayer = new int[numberOfPlayer];
	}
	
	void collectNumberFromGuesser() {
		System.out.println();
		System.out.println("Give the range of number.");
		System.out.print("Start: ");
		int start = this.scan.nextInt();
		System.out.print("End: ");
		int end = this.scan.nextInt();
		System.out.println();
		
		Guesser gues = new Guesser(start, end);
		numFromGuesser = gues.guesNumber();
	}
	
	void collectNumberFromPlayer() {
		for (int i = 0; i < numberGuessFromPlayer.length; i++) {
			System.out.print("Player " + (i+1) + " give the guess: ");
			numberGuessFromPlayer[i] = scan.nextInt();
		}
		System.out.println();
	}
	
	void compare() {
		String win = "The Winner is: ";
		boolean checkWin = false;
		for (int i = 0; i < numberGuessFromPlayer.length; i++) {
			if (numberGuessFromPlayer[i] == numFromGuesser) {
				win = win + "Player" + (i+1) + " ";
				checkWin = true;
			}
		}
		
		if (checkWin) {
			System.out.println(win);
		}else {
			System.out.println("There are no WINNER.....");
		}
		
		
	}
}
