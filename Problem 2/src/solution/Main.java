package solution;

public class Main {
	
	private static final int FIBB_LIMIT = 4_000_000;
	private static int sum = 0;

	public static void main(String[] args) {

		System.out.println(countFibb(1, 1));
		System.out.println(sum);
		
	}
	
	public static int countFibb(int prev, int current) {
		if (current % 2 == 0) {
			sum += current;
		}
		
		if (prev + current > FIBB_LIMIT) {
			return current;
		}
		
		return current + countFibb(current, prev + current); 
	}
	
}
