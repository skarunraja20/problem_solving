package com.example.arrays;

import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object

		int numberOfTestCase = myObj.nextInt();


		for(int i=1; i <= numberOfTestCase; i++) {
			Integer n = myObj.nextInt();
			int[] A = new int[n];
			for (int j = 0; j < n; j++) {
				A[j] = myObj.nextInt();
			}
			Integer elementToFind = myObj.nextInt();

			searchElement(A, elementToFind);
		}
	}

	private static void searchElement(int[] A, Integer b) {
		// TODO Auto-generated method stub
		int i=0;		
		while(i<A.length) {
			if(A[i] == b) {
				System.out.println("1");
				return;
			}
			i++;
		}

		System.out.println("0");
	}

}
