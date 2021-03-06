package solution;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		BigInteger number = new BigInteger("600851475143");
		
		for (int i = 1; i < 10000; i++) {
			BigInteger m = new BigInteger(String.valueOf(i));
			BigInteger mod = number.mod(m);
			
			if (mod.toString().equals("0")) {
				System.out.println("Divisibly by: " + i);
				
				number = number.divide(m);
				System.out.println("Value after division: " + number.toString());
				
				System.out.println(m.isProbablePrime(10));
			}
		}
	}
	
}
