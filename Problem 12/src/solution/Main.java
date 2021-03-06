package solution;

public class Main {

	public static void main(String[] args) {
		boolean searching = true;
		int number = 1;
		int triangleNumber = 0;
		long start = System.currentTimeMillis();

		while (searching) {
			triangleNumber += number;

			int divisors = 0;
			for (int i = 1; i <= Math.sqrt(triangleNumber); i++) {
				if (triangleNumber % i == 0) {
					divisors += 2;
				}
			}

			if (divisors > 47) {
				System.out.println("Number: " + number + " Triangle: "
						+ triangleNumber + " SIZE: " + divisors);
			}

			if (divisors > 500) {
				System.out.println(triangleNumber);
				searching = false;
			}

			number++;
		}

		long stop = System.currentTimeMillis();
		System.out.println((stop - start));
	}
}
