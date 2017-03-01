package com.aniket;

public class Problem5 {

	public static void main(String[] args) {
		for (long i = 2500; i< 1000000000; i++) {
			boolean isMyNumber = true;
			for (long j = 1; j < 21; j++) {

				if (i % j != 0) {
					isMyNumber = false;
					break;
				}

			}
			if (isMyNumber) {
				System.out.println("my number:" + i);
			}
		}

	}

}
