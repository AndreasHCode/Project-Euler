package solution;

public class Main {
	
	private static final int UPPER_LIMIT = 20;
	
	public static void main(String[] args) {
		boolean searching = true;
		int number = UPPER_LIMIT;
		
		while (searching) {
			
			for (int i = 1; i <= UPPER_LIMIT; i++) {
				if (number % i != 0) {
					break;
				} else if (i == UPPER_LIMIT) {
					System.out.println("Number: " + number + " is Valid");
					searching = false;
				}
			}
			
			number += UPPER_LIMIT;
		}
		
	}

}
