package assingment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignmentNumber1(7);
//		assignmentNumber2(4);
//		assignmentNumber3(14);
//		assignmentNumber4(14);
//		assignmentNumber5(14);

	}
	
	static void assignmentNumber1(int len) {
		int mid = len / 2;
		System.out.println();
		
		for (int i = 0; i < len; i++) {
			
			// i
			for (int j = 0; j < 1; j++) {
				System.out.print("* ");
			}
			System.out.print("   ");
			
			// n
			for (int j = 0; j < len; j++) {
				if (j == 0 || j == len - 1 || (j == i && (i != 0 || i != len-1))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			// e
			for (int j = 0; j < len-mid; j++) {
				if (j == 0 || i == 0 || i == mid || i == len-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			// u
			for (int j = 0; j < len; j++) {
				if ((j == 0 && i != len-1 || j == len-1 && i != len-1) || (i == len-1 && j > 0 && j < len-1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			// r
			for (int j = 0; j <= len - mid; j++) {
				if ((i == 0 && j < mid) || j == 0 || (i == mid && j < mid) || (j == mid && (i == 1 || i == 2)) || (i > mid && j == i - mid)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			// o
			for (int j = 0; j < len; j++) {
				if ((j == 0 && i > 0 && i < len-1 || j == len-1 && i > 0 && i < len-1) || (i == len-1 && j > 0 && j < len-1) || (i == 0 && j > 0 && j < len-1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			// n
			for (int j = 0; j < len; j++) {
				if (j == 0 || j == len - 1 || (j == i && (i != 0 || i != len-1))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
	}
	
	static void assignmentNumber2(int len) {
		for (int column = 1; column <= len; column++) {
			for (int row = 0; row < len; row++) {
				System.out.print(column);
			}
			System.out.println();
		}
	}
	
	static void assignmentNumber3(int len) {
		int mid = len / 2;
		int start = mid - 1;
		int end = mid - 1;
		for (int row = 0; row < len; row++) {
			for (int column = 0; column < len; column++) {
				if (row > 0 && row < len-1 && (column >= start && column <= end)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			if (start > 1 && row > 0 && row < len-1) {
				start--;
			}
			
			if (end < len-2 && row > 0 && row < len-1) {
				end++;
			}
			
			System.out.println();
		}
	}
	
	static void assignmentNumber4(int len) {
		int mid = len / 2 - 2;
		int start = 0;
		int end = len - 1;
		for (int row = 0; row < len; row++) {
			for (int column = 0; column < len; column++) {
				if (row > mid && (column <= start || column >= end)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (row > mid) {
				start++;
				end--;
			}
			
			System.out.println();
			
			
		}
	}
	
	static void assignmentNumber5(int len) {
		int mid = len / 2 - 1;
		for (int row = 0; row < len; row++) {
			int numOfColumn;
			if (row > mid && row < len - 1) {
				numOfColumn = (row - mid) + 1;
			} else if (row > 0 && row <= mid) {
				numOfColumn = (mid - row) + 1;
			} else {
				numOfColumn = len;
			}
			
			for (int column = 0; column < numOfColumn; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
