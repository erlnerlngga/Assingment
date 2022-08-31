package assingment3;

public class Main {
	public static void main(String[] args) {
//		number1("iNeuron");
//		number2("Think Twice");
//		number3("Clint Eastwood", "old west action");
//		number4("he quick brown fox jumps over the lazy dog");
//		number5("erlan erlangga..??");
//		String ansNumber6 = number6("erlan erlangga");
//		System.out.println(ansNumber6);
//		number7("ineUron");
//		number8("Asgh.,??hHHAR@");
	}
	
	static void number1(String str) {
		String ans = "";
		for (int i = str.length()-1; i >=0; i--) {
			ans += str.charAt(i);
		}
		
		System.out.println(ans);
	}
	
	static void number2(String str) {
		String strLower = str.toLowerCase();
		String[] strSplit = strLower.split("\\s");
		String ans = "";
		
		for(int str1 = 0 ;  str1 < strSplit.length ; str1++) {
			for (int i = strSplit[str1].length() - 1; i >=0; i--) {
				ans += strSplit[str1].charAt(i);
			}
			if (str1 != strSplit.length-1) {
				ans += " ";
			}
		}
		
		System.out.println(ans);
	}
	
	static void number3(String str1, String str2) {
		str1 = str1.replace(" ", "");
		str1 = str1.toLowerCase();
		str2 = str2.replace(" ", "");
		str2 = str2.toLowerCase();
		int total1 = 0;
		int total2 = 0;
		
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				total1 += str1.charAt(i) + 0;
				total2 += str2.charAt(i) + 0;
			}
			
			if (total1 == total2) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
			
		} else {
			System.out.println("Not Anagrammm");
		}
		
		
		
		
	}
	
	static void number4(String str) {
		char tes;
		str = str.toLowerCase();
		boolean pangram = true;
		for (int i = 0; i <= 25; i++) {
			tes =  (char) ('a' + i);
//			System.out.print(tes + " ");
			if (!str.contains(String.valueOf(tes))) {
				System.out.println("Not Pangram");
				pangram = false;
				break;
			}
		}
		if (pangram) {
			System.out.println("Pangram");
		}
		
		
	}
	
	static void number5(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			if (ans.contains(String.valueOf(str.charAt(i)))) {
				continue;
			}
			
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					ans += str.charAt(i) + " " ;
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
	
	static String number6(String str) {
		str = str.replace(" ", "");
		str = str.toLowerCase();
		
		if (str.length() == 1) {
			return str;
		}
		
		int mid = str.length() / 2;
		
		String left = number6(str.substring(0, mid));
		String right = number6(str.substring(mid, str.length()));
		
		return merge(left, right);
		
	}

	private static String merge(String left, String right) {
		// TODO Auto-generated method stub
		String ans = "";
		int i = 0;
		int j = 0;
		
		while(i < left.length() && j < right.length()) {
			if (left.charAt(i) < right.charAt(j)) {
				ans += left.charAt(i);
				i++;
			}else {
				ans += right.charAt(j);
				j++;
			}
		}
		
		while (i < left.length()) {
			ans += left.charAt(i);
			i++;
		}
		
		while (j < right.length()) {
			ans += right.charAt(j);
			j++;
		}
		
		return ans;
	}
	
	static void number7(String str) {
		str = str.replace(" ", "");
		str = str.toLowerCase();
		
		String vocal = "aiueo";
		int ansVocal = 0;
		int ansConsonant = 0;
		
		for (int i = 0; i < vocal.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (vocal.charAt(i) == str.charAt(j)) {
					ansVocal++;
				}
			}
		}
		ansConsonant = str.length() - ansVocal;
		
		System.out.println("Vocal	 : " + ansVocal);
		System.out.println("Consonant: " + ansConsonant);
		
	}
	
	static void number8(String str) {
		str = str.replace(" ", "");
		str = str.toLowerCase();
		int ans = 0;
		
		for (int i = 0; i < str.length(); i++) {
			int tesCase = str.charAt(i) + 0;
			if ((tesCase >= 48 && tesCase <= 57) || (tesCase >= 97 && tesCase <= 122)) {
				continue;
			}
			
			ans++;
		}
		
		System.out.println("Number of Special Character: " + ans);
		
	}
}
