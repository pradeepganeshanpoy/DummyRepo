package PK;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");

		int number = scanner.nextInt();

		if (isPrime(number)) {
			System.out.println(number + " is a Prime number");
		} else {
			System.out.println(number + " is not a Prime number");
		}
	}

	// Method to check if a number is prime
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false; // 0 and 1 are not prime numbers
		}

		// Check divisibility from 2 to sqrt(num)
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // divisible by i, so not prime
			}
		}
		return true; // no divisors found, so prime
	}



}


