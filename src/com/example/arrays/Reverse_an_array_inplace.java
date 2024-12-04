package com.example.arrays;

import java.util.Arrays;

public class Reverse_an_array_inplace {

	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		reverse(A);
		Arrays.stream(A).forEach(System.out::print);
		
	}

	private static void reverse(int[] A) {
		int i = 0;
		int j = A.length-1;
		int  temp = 0;
		while(i < j) {
			temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++;
			j--;
		}
	}
	
	

}
