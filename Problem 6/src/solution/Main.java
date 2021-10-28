package solution;

public class Main {

	public static void main(String[] args) {

		int squareSum = 0;
		int sum = 0;
		int sumSquare = 0;
		
		for (int i = 1; i <= 100; i++) {
			squareSum += Math.pow(i, 2);
			sum += i;
		}
		
		sumSquare += Math.pow(sum, 2);
		
		System.out.println("Difference is: " + (sumSquare - squareSum));
		
	}
	
}
