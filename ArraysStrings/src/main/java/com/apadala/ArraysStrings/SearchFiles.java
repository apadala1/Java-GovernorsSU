package com.apadala.ArraysStrings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SearchFiles {

	public static void FineEach(String filePath)
	// TODO Auto-generated method stub

	{
		double count = 0, countBuffer = 0, countLine = 0;
		String lineNumber = "";

		BufferedReader br;
		String inputSearch = "systhrow";
		String line = "";

		try {
			br = new BufferedReader(new FileReader(filePath));
			try {
				while ((line = br.readLine()) != null) {
					countLine++;
					//System.out.println(line);
					String[] words = line.split(" ");

					for (String word : words) {
						if (word.equalsIgnoreCase(inputSearch)) {
							count++;
							countBuffer++;
						}
					}

					if (countBuffer > 0) {
						countBuffer = 0;
						lineNumber += countLine + ",";
					}
					
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(filePath);
		if (count > 0) {
			System.out.println("Times found at--" + count);
			System.out.println("Times found at--" + filePath);
			System.out.println("Word found at--" + lineNumber);
		}

		try {

// Open given file in append mode. 
			BufferedWriter out = new BufferedWriter(new FileWriter("output 2.txt", true));
			if (count > 0) {
				out.write(
						"------------------------------------------------------------------------------------------------------------");
				out.newLine();
				out.write("Times found at--" + count);
				out.newLine();
				out.write("Times found at--" + filePath);
				out.newLine();
				out.write("Word found at--" + lineNumber);

				out.write(
						"------------------------------------------------------------------------------------------------------------");
				out.newLine();

			}
			out.close();
			BufferedWriter out1 = new BufferedWriter(new FileWriter("output.bat", true));
			if (count > 0) {
				
				out1.newLine();
				out1.write(filePath);
				

			}
			out1.close();
			
		} catch (IOException e) {
			System.out.println("exception occoured" + e);
		}

	}

}
