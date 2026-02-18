public class TwinPrime {
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Twin primes from 1 to 100:");

		int prevPrime = -1;
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				if (prevPrime != -1 && (i - prevPrime == 2)) {
					System.out.println("(" + prevPrime + "," + i + ")");
				}
				prevPrime = i;
			}
		}
	}
}
