/**
 * 
 */
package com.apadala.ArraysStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Akhileshwar.Padala Perfect right-angled triangles Problem 218
 *         Consider the right angled triangle with sides a=7, b=24 and c=25. The
 *         area of this triangle is 84, which is divisible by the perfect
 *         numbers 6 and 28. Moreover it is a primitive right angled triangle as
 *         gcd(a,b)=1 and gcd(b,c)=1. Also c is a perfect square.
 * 
 *         We will call a right angled triangle perfect if -it is a primitive
 *         right angled triangle -its hypotenuse is a perfect square
 * 
 *         We will call a right angled triangle super-perfect if -it is a
 *         perfect right angled triangle and -its area is a multiple of the
 *         perfect numbers 6 and 28.
 * 
 *         How many perfect right-angled triangles with c≤1016 exist that are
 *         not super-perfect? solution
 */
public class TriangleEuler {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		int count = 0;
		long lStartTime = System.nanoTime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> a = new ArrayList();
		List<Integer> b = new ArrayList();
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

		// loop end
		PerfectSquare ps = new PerfectSquare(n);
		ps.start();
		PrimitiveRT prat = new PrimitiveRT(a, b, n);
		prat.start();
		supereRT srat = new supereRT(a, b, n);
		srat.start();

		ps.join();
		prat.join();
		srat.join();

		for (int i = 0; i < prat.rat.length; i++) {
			// System.out.println("entered test ");

			if (prat.rat[i] && !srat.srt[i]) {
				count++;

			}

		}
		/// test loop not for submission

		System.out.println(count);

		long lEndTime = System.nanoTime();

		// time elapsed
		long output = lEndTime - lStartTime;

		System.out.println("Elapsed time in milliseconds: " + output / 1000000);

	}

}

class PerfectSquare extends Thread {
	public Boolean ps;
	int c;

	PerfectSquare(int c) {
		this.c = c;

	}

	public void run() {
		// TODO perfect square
		// System.out.println("entered ps");
		int a = (int) Math.sqrt(c);
		if (a * a == c) {
			this.ps = true;
		}

	}

}

class PrimitiveRT extends Thread {
	public boolean rat[];

	public PrimitiveRT(List<Integer> a, List<Integer> b, int c) {
		super();
		rat = new boolean[a.size()];
		this.a = a;
		this.b = b;
		this.c = c;
	}

	List<Integer> a, b;
	int c;

	public void run() {
		// primitive triangle
		// System.out.println("entered prat");
		int gcd1 = 1, gcd2 = 1;
		for (int j = 0; j < a.size(); j++) {

			for (int i = 1; i <= a.get(j) && i <= b.get(j); ++i) {
				if (a.get(j) % i == 0 && b.get(j) % i == 0)
					gcd1 = i;
			}
			for (int i = 1; i <= b.get(j) && i <= c; ++i) {

				if (b.get(j) % i == 0 && c % i == 0)
					gcd2 = i;
			}

			if (gcd1 == 1 && gcd2 == 1) {
				rat[j] = true;
			} else
				rat[j] = false;

		}
	}

}

class supereRT extends Thread {
	public boolean srt[];
	List<Integer> a, b;
	int c;

	public supereRT(List<Integer> a, List<Integer> b, int c) {
		super();
		srt = new boolean[a.size()];
		this.a = a;
		this.b = b;
		this.c = c;
	}

	synchronized public void run() {
		// System.out.println("entered srat");
		for (int i = 0; i < a.size(); i++) {
			int area = (int) (0.5 * a.get(i) * b.get(i));
			if (area % 6 == 0 && area % 28 == 0) {
				srt[i] = true;
			} else
				srt[i] = false;
		}

	}

}