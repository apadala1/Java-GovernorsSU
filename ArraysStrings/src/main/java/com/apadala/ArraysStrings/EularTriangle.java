package com.apadala.ArraysStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EularTriangle {
	static int count;

	public static boolean perfectSquare(int c) {
		int a = (int) Math.sqrt(c);

		return a * a == c;

	}

	public static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}

	public static boolean hcf(int a, int b, int c) {

		return hcf(hcf(a, b), c) == 1;

	}

	public static boolean supert(int area) {
		return (area % 6 == 0 && area % 28 == 0);
	}

	public static void process(int a, int b, int c) {

		if (hcf(a, b, c)) {

			if (!supert((int) (0.5 * a * b))) {
				count++;

			}
		}

	}

	public static void main(String... strings) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		if(k<1) {
			System.out.println(0);
			System.exit(0);
		}
		List<Integer> c = new ArrayList<Integer>();
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			c.add(Integer.parseInt(br.readLine()));

		}
		for (int n : c) {
			if (!perfectSquare(n)) {
				System.out.println(0);
			} else {
				for (int i = 1; i < n; i++) {
					for (int j = 1; j < n; j++) {
						if (i * i + j * j == n * n) {

							if (!b.contains(i))
								a.add(i);
							if (!a.contains(j))
								b.add(j);

						}
					}
				}

				for (int l = 0; l < a.size(); l++) {
					process(a.get(l), b.get(l), n);
				}
				System.out.println(count);
				count = 0;
				a.clear();
				b.clear();
			}
		}
	}
}
