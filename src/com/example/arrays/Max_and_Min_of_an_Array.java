package com.example.arrays;

import java.util.Scanner;

public class Max_and_Min_of_an_Array {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		String line = myObj.nextLine();

		String[] arr = line.split(" ");
		int[] inputArr = new int[Integer.parseInt(arr[0])];
		for(int i=1; i <= arr.length-1; i++) {
			inputArr[i-1] = Integer.parseInt(arr[i]);
		}
		
		findMaxMinOfArray(inputArr);
		
	}

	private static void findMaxMinOfArray(int[] inputArr) {
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;
		
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i] < min) {
				min = inputArr[i];
			}
			
			if(inputArr[i] > max) {
				max = inputArr[i];
			}
		}
		
		System.out.println(max +" "+min);
		
	}
	

}
