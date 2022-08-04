package assingment2;

import java.util.Scanner;

public class Player {
	
	int number;
	
	int guesNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Player guess the number: ");
		number = scan.nextInt();
		return number;
	}
	
}
