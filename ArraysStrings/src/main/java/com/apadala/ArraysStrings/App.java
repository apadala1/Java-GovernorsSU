package com.apadala.ArraysStrings;

import java.io.File;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		long lStartTime = System.nanoTime();
		String input = "abcdefghijklmnopqrstuvwxyza";

		// System.out.println(new StringUniqueChars().StringTest(input));
		// System.out.println(new StringUniqueChars().StringTestncs(input));
		// System.out.println(new StringUniqueChars().StringTestSet(input));
		// System.out.println(new StringUniqueChars().StringTestSetncs(input));
		// System.out.println(new StringUniqueChars().StringTestBln(input));
		// System.out.println(new StringUniqueChars().StringTestSetncs(input));

		/* test case for files and search */
		/*
		 * File currentDir = new File("E:\\Myworkspace\\kroger");
		 * 
		 * FIlePathUtil.displayDirectoryContents(currentDir); int count =0; for (String
		 * str : FIlePathUtil.al) { SearchFiles.FineEach(str); count++;
		 * 
		 * }
		 */
		/*
		 * test case for duplicate string 
		 * 
		 */
		// RemoveDuplicateChar rmd=new RemoveDuplicateChar();
		//ArrayList<String> alist= new ArrayList();
		//alist.add("akhileshwarpadala");
		//alist.add("aaaaaaaaaaaaaaaaa");
		//alist.add("");
		//alist.add("aaaabbbbcccc");
		//////////////////////////////////////////////////
		
	//	RemoveDuplicateChar.rmvDuplicateLow("0123456".toCharArray());
		
		
		
		
		long lEndTime = System.nanoTime();

		// time elapsed
		long output = lEndTime - lStartTime;

		System.out.println("\nElapsed time in milliseconds: " + output / 1000000);

	}
}