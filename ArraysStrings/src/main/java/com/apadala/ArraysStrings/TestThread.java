package com.apadala.ArraysStrings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;

	ThreadDemo(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);

		try {
			//while (true ) {
				BufferedReader br = new BufferedReader(new FileReader("E:\\text.txt"));
				String line;
				while ((line = br.readLine()) != null) {
			//	System.out.println(line + threadName);

				}
			//}
			
		} catch (Exception e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");

	}
}

public class TestThread {

	public static void main(String args[]) {
		ThreadDemo T1 = new ThreadDemo("Thread-1");

		ThreadDemo[] T2 = new ThreadDemo[15];
		for (int i = 0; i < 15; i++) {
			T2[i] = new ThreadDemo(String.valueOf(i));
			T2[i].start();
		}

		// T1.start();
	}
}