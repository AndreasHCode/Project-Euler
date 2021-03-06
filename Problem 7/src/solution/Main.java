package solution;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static List<Long> primes = new ArrayList<>();

	public static void main(String[] args) {
		long number = 3L;
		primes.add(2L);

		while (primes.size() <= 10000) {

			if (isPrime(number)) {
				primes.add(number);
			}

			number++;
		}

		System.out.println(primes.get(10000));
	}

	private static boolean isPrime(long number) {
		for (Long aPrime : primes) {
			if (number % aPrime == 0) {
				return false;
			}
		}

		return true;
	}

}
