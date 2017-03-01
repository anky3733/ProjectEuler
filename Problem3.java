package com.aniket;

import java.util.*;

public class Problem3 {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		isPrime s=new isPrime();
		for (i = 1; i < n; i++) {
			if ((n % i == 0) && (s.isPrime(i))) {
				System.out.println(i);
				
			}

		}
	}
}
