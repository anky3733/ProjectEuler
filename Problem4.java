package com.aniket;

import java.util.*;

public class Problem4 {

	public static void main(String[] args) {
		isPalindrome c = new isPalindrome();

		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				int n = i * j;
				{
					if (c.isPalindrome(n)) {
						System.out.println(n);
					}
				}

			}

		}

	}
}
