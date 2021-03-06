package solution;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static List<Long> primes = new ArrayList<>();

	public static void main(String[] args) {
		long number = 3L;
		primes.add(2L);
		long result = 2L;

		while (number < 2_000_000) {

			if (isPrime(number)) {
				primes.add(number);
				result += number;
			}

			number += 2;
		}

		System.out.println(result);
	}

	private static boolean isPrime(long number) {
		for (Long aPrime : primes) {
			if (aPrime > Math.sqrt(number)) {
				return true;
			}

			if (number % aPrime == 0) {
				return false;
			}
		}

		return true;
	}
}
