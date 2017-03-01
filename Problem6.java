package com.aniket;

import java.util.*;

public class Problem6 {

	public static void main(String[] args) {
		int i, n;
		int sum = 0, sum1 = 0, sum2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		n = sc.nextInt();
		int a[] = new int[101];
		for (i = 1; i < n; i++) {
			a[i] = i;
		}
		for (i = 1; i < n; i++) {
			sum1 = sum1 + a[i];
			sum2 = sum1 + a[i] * a[i];
		}

		sum = sum2 - sum1 * sum1;
		System.out.println("Sum is " + sum);
	}

}