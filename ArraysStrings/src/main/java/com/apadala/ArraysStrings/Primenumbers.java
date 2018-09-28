package com.apadala.ArraysStrings;

import java.util.ArrayList;

public class Primenumbers {
	static ArrayList<Integer> l = new ArrayList<Integer>();

	static void primnum(int n) {

		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {

			if (prime[p] == true) {

				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}

		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				l.add(i);

			}

		}
		System.out.print(l);
	}
}
