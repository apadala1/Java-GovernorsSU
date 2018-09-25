/**
 * 
 */
package com.apadala.ArraysStrings;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Akhileshwar.Padala
 *
 */
public class HackerRank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		HackerRank.miniMaxSum(arr);

	}

	/**
	 * Print the absolute difference between the sums of the matrix's two diagonals
	 * as a single integer.
	 * 
	 * 
	 * @param arr
	 * @return
	 */

	static int diagonalDifference(int[][] arr) {

		if (arr[0].length != arr.length) {
			return 0;
		}

		for (int i = 1; i < arr.length; i++) {
			arr[0][0] += arr[i][i];
		}
		for (int i = 1, j = arr.length - 2; j >= 0 && i < arr.length; i++, j--) {
			arr[0][arr.length - 1] += arr[i][j];
		}

		if (arr[0][0] > arr[0][arr.length - 1]) {
			return arr[0][0] - arr[0][arr.length - 1];
		} else if (arr[0][0] < arr[0][arr.length - 1]) {
			return -arr[0][0] + arr[0][arr.length - 1];
		} else
			return 0;
	}

	/**
	 * simple bill calculations
	 * 
	 * @param meal_cost
	 * @param tip_percent
	 * @param tax_percent
	 */
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double h_1 = 100.00;
		double tax = meal_cost * (tax_percent / h_1);
		double tip = meal_cost * (tip_percent / h_1);
		System.out.println(Math.round((meal_cost + tax + tip)));

	}

	/**
	 * miniMaxSUm HackerRank Solution
	 * 
	 * @param arr
	 */
	static void miniMaxSum(int[] arr) {
		int sum[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			sum[i]=0;
			for (int j=0;j<arr.length;j++) {
				if(i!=j)
				sum[i]+=arr[j];
			}
			
		}
		Arrays.sort(sum);
		System.out.println(sum[0]);
		System.out.println(sum[sum.length-1]);
	}

	
}
