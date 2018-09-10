/**
 * 
 */
package com.apadala.ArraysStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Akhileshwar.Padala Implement an algorithm to determine if a string
 *         has all unique characters. special case : what if you cannot use
 *         additional data structures.
 */
public class StringUniqueChars {

	/**
	 * This method implementation only uses String APi , No other Data Structures,
	 * Case Sensitive CASE sensitive Retrun true if all unique
	 * 
	 * @param input
	 * @return
	 */
	boolean StringTest(String input) {
		boolean flag = false;
		char ch[] = input.toCharArray();
		int i = 0;
		while (!flag && i < ch.length) {
			int j = 0;
			while (!flag && j < ch.length) {
				if (i != j) {

					flag = ch[i] == ch[j];
				}
				j++;

			}
			i++;
		}

		return !flag;

	}

	/**
	 * This method implementation only uses String APi , No other Data Structures
	 * NoT Case Sensitive CASE sensitive Retrun true if all unique
	 * 
	 * @param input
	 * @return
	 */

	boolean StringTestncs(String input) {
		boolean flag = false;
		String temp1, temp2;
		char ch;
		int i = 0;
		while (!flag && i < input.length()) {
			int j = 0;
			while (!flag && j < input.length()) {
				if (i != j) {
					flag = input.toLowerCase().charAt(i) == input.toLowerCase().charAt(j);

				}
				j++;

			}
			i++;
		}

		return !flag;

	}

	/**
	 * method implementation uses Set interface to find the if String has All unique
	 * , Case Sensitive CASE sensitive Characters Retrun true If All unique
	 * 
	 * @param input
	 * @return
	 */
	boolean StringTestSet(String input) {
		boolean flag = true;
		Set<Character> s1 = new HashSet<Character>();
		int i = 0;
		try {
			while (i < input.length() && (flag = s1.add(input.charAt(i)))) {

				// System.out.println(input.charAt(i)+"===="+i);
				// System.out.println("================");
				i++;

			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);

		}
		// System.out.println(s1);

		return flag;
	}

	/**
	 * method implementation uses Set interface to find the if String has All unique
	 * ,NOT Case Sensitive CASE sensitive Characters Retrun true If All unique
	 * 
	 * @param input
	 * @return
	 */

	boolean StringTestSetncs(String input) {
		boolean flag = true;
		Set<Character> s1 = new HashSet<Character>();
		int i = 0;
		while ((i < input.length() && (flag = s1.add(input.toLowerCase().charAt(i))))) {
			i++;

		}
		//System.out.println(s1);

		return flag;
	}

	/***
	 * Method Uses boolean array to find the answer
	 * 
	 * @param str
	 * @return
	 */

	public static boolean StringTestBln(String input) {
		boolean[] char_set = new boolean[256];

		for (int i = 0; i < input.length(); i++) {

			if (char_set[(int) (input.charAt(i))])
				return false;
			char_set[(int) (input.charAt(i))] = true;
		}
		return true;
	}

}
