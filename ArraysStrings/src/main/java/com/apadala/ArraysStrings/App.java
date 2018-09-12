package com.apadala.ArraysStrings;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		long lStartTime = System.nanoTime();
		String input="abcdefghijklmnopqrstuvwxyza";

		//System.out.println(new StringUniqueChars().StringTest(input));
		//System.out.println(new StringUniqueChars().StringTestncs(input));
		//System.out.println(new StringUniqueChars().StringTestSet(input));
		//System.out.println(new StringUniqueChars().StringTestSetncs(input));
		//System.out.println(new StringUniqueChars().StringTestBln(input));
		//System.out.println(new StringUniqueChars().StringTestSetncs(input));
		
		/// ugly brute force code to
		File currentDir = new File("E:\\Myworkspace\\kroger");
	
		FIlePathUtil.displayDirectoryContents(currentDir);
		int count =0;
		for (String str : FIlePathUtil.al) {
			SearchFiles.FineEach(str);
			count++;
			
		}
		System.out.println(count);
		
		long lEndTime = System.nanoTime();

		// time elapsed
		long output = lEndTime - lStartTime;

		System.out.println("Elapsed time in milliseconds: " + output / 1000000);

	}
}