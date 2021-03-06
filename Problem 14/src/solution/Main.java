package solution;

public class Main {

	public static void main(String[] args) {
		int max = 0;

		for (int i = 4; i < 1_000_000; i++) {
			int count = 0;
			int number = i;

			count = getCount(count, number);

			if (max < count) {
				max = count;
				System.out.println("Current count: " + max + " at: " + i);
			}
		}

	}

	private static int getCount(int count, long number) {
		while (number > 1) {
			count++;

			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = 3 * number + 1;
			}
		}

		return count;
	}
}
