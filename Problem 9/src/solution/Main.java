package solution;

public class Main {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < 500; i++) {
			b = a;
			a++;

			for (int j = a; j < 500; j++) {
				b++;
				double squareSum = Math.pow(a, 2) + Math.pow(b, 2);
				double doubleRoot = Math.sqrt(squareSum);
				int intRoot = (int) Math.sqrt(squareSum);

				if (intRoot == doubleRoot) {
					c = intRoot;

					if (a + b + c == 1000) {
						System.out.println("1000 for a - " + a + " and b - "
								+ b + ".");
						System.out.println("Result: " + a * b * c);
					}
				}
			}
		}

	}
}
