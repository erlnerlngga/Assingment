package assingment2;

public class Guesser {
	
	int start;
	int end;
	
	Guesser(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	int guesNumber() {
		System.out.println("Guess the number from "  + this.start + " to " + this.end);
		double temp = start +  Math.random() * this.end;
		int result = (int) temp;
		
//		System.out.println(result);
		return result;
	}
}
