package solution;

public class Main {

	private static int biggestNumber = 0;
	
	public static void main(String[] args) {
		int first = 1000;
		int second = first;
		
		for (int i = 0; i < 1000; i++) {
			second = first;

			if (isPalindrome(first-- * second)) {
				break;
			}
			
			for (int j = i; j < 1000; j++) {
				if (isPalindrome(first * second--)) {
					break;
				}
			}
		}
		
	}
	
	public static boolean isPalindrome(int number) {
		String numberString = String.valueOf(number);
		int length = numberString.length();
		
		for (int i = 0; i <= length / 2; i++) {
			if (numberString.charAt(i) == numberString.charAt(length - i - 1)) {
			} else {
				return false;
			}
		}

		if (number > biggestNumber) {
			biggestNumber = number;
			System.out.println("New biggest Number: " + biggestNumber);
		}
		return true;
	}
}
