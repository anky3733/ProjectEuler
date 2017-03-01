package com.aniket;

public class Problem7 {

	public static void main(String[] args) {
		isPrime c = new isPrime();
		int i, index = -1;
		for (i = 2; i < 1000000; i++) {
			if (c.isPrime(i)) {
				index++;
				System.out.println(index + " - " + i);
				if (index == 10001) {
					break;
				}
			}
		}

	}

}
