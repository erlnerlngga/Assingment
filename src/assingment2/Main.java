package assingment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		boolean isPlay = true;
		while (isPlay) {
			System.out.println("Welcome......");
			System.out.println("1. Play (play again)");
			System.out.println("9. Exit");
			System.out.print("Choose the number: ");
			
			
			int ans = scan.nextInt();
			if (ans == 1) {
				System.out.println("\n\n\n");
				Umpire play = new Umpire();
				play.collectNumberFromGuesser();
				play.collectNumberFromPlayer();
				play.compare();
				System.out.println("\n\n\n");
			} else if (ans == 9) {
				isPlay = false;
				System.out.println("\n\n\n");
				System.out.println("GoodBye Thank U for Playing.....");
			} else {
				System.out.println("\n\n\n");
			}
		}

	}

}
