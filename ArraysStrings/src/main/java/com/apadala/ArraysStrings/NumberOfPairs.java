package com.apadala.ArraysStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * finds number of pairs of numbers in a array.
 * 
 * @author Akhileshwar.Padala
 *
 */
public class NumberOfPairs {
	/**
	 * Returns number of pairs in array
	 * 
	 * @param n
	 * @param ary
	 * @return
	 */
	public static int FindPairs(int n, int ary[]) {
		Map<Integer, Integer> mh = new HashMap();

		int j = 0;
		for (Integer i : ary) {
			if (!mh.containsKey(i)) {
				mh.put(i, 1);
			} else {
				j = mh.get(i) + 1;
				// System.out.println("enetered ");
				mh.replace(i, j);
			}

		}
		n = 0;
		for (Integer i : mh.values()) {

			// System.out.println("i="+i);
			n += i / 2;
			// System.out.println("/////////////");
			// System.out.println("n="+n);
		}
		return n;
	}

	public static void main(String... strings) {

		int[] a = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.print(NumberOfPairs.FindPairs(9, a));
	}

}
