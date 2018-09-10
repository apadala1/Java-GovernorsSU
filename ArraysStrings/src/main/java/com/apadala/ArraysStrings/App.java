package com.apadala.ArraysStrings;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
        long lStartTime = System.nanoTime();

		System.out.println("strrting string testing ............");
		System.out.println("Passing String values...............");
		
		System.out.println(new StringUniqueChars().StringTestncs("AkHil"));
		
		long lEndTime = System.nanoTime();

		//time elapsed
        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output / 1000000);

		
	}
}