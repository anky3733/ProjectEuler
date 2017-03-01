package com.aniket;

public class Project10 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		isPrime c = new isPrime();
		int maxCheck = 2000000;
		boolean[] primes = c.calcPrimes(maxCheck);     

		int i;
		long sum = 0;
		for (i = 2; i < maxCheck; i++) {
			if (primes[i]) {
				sum += i;
			}
		}
		System.out.println("Sum is " + sum);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("totaltime: " + totalTime);

	}

}
