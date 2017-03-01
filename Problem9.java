package com.aniket;

public class Problem9 {

	public static void main(String[] args) {
		int i, a = 0, b = 0, c = 0;

		for (b = 1; b < 1000; b++) {
			for (a = 1; a < b; a++) {
				c = a * a + b * b;
				int sqrt = (int) Math.sqrt(c);
				if ((sqrt * sqrt == c) && (a + b + Math.sqrt(c) == 1000)) {
					System.out.println(a + " " + b + " = " + Math.sqrt(c));
				}

			}
		}

	}
}
