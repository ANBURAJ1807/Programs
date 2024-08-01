package week1.day1.HomeAsses;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				System.out.println("NOT A PRIME NUMBER");
				

			}
		}
	}
}


