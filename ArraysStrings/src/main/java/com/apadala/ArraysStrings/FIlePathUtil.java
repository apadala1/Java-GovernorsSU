/**
 * 
 */
package com.apadala.ArraysStrings;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Akhileshwar.Padala
 *
 */
public class FIlePathUtil {
	static public ArrayList<String> al = new ArrayList<String>();

	public static void main(String[] args) {
		File currentDir = new File("E:\\Myworkspace\\kroger");
		displayDirectoryContents(currentDir);
		System.out.println(al.size());
		//System.out.println(al);
	}

	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					//System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				} else {
					//System.out.println("     file:" + file.getCanonicalPath());
					al.add(file.getCanonicalPath());

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("null pointer exception " + e);
		}
	}

}
