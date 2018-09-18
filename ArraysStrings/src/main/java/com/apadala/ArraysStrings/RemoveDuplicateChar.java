package com.apadala.ArraysStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * Duplicate Characters in a string different ways
 * 
 * @author Akhileshwar.Padala
 *
 */
public class RemoveDuplicateChar {

	/**
	 * Remove duplicate characters in a string Using SET interface
	 * 
	 * @param string
	 * @return String
	 */
	public static String rmvDupicate(String string) {

		Set<Character> n = new HashSet();
		for (int i = 0; i < string.length(); i++) {
			n.add(string.charAt(i));

		}

		return n.toString();
	}

	/**
	 * using boolean array to remove duplicate O(n)
	 * 
	 * @param input
	 * @return
	 */
	public String rmvDuplicateBinary(String input) {
		int lengt = input.length();
		boolean char_set[] = new boolean[256];

		for (int i = 0; i < input.length(); i++) {

			if (char_set[(int) (input.charAt(i))]) {

				input = input.substring(0, i) + input.substring(i + 1);
				i--;
			}
			System.out.println("i = " + i + "str.length" + input.length());
			char_set[(int) (input.charAt(i))] = true;
		}

		return input;
	}

	public static void rmvDuplicateLow(char[] cs) {
		cs[3]=0;
		System.out.println(cs);
		cs[3]=0;
	}
	
	
}
