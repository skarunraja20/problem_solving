package com.example.arrays;

import java.util.Arrays;

public class Reverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_of_an_array a = new Reverse_of_an_array();
		int[] A = {1,2,3,4,5};
		a.solve(A);
	}


	public int[] solve(final int[] A) {
		int[] B = new int[A.length];
		int i = 0;
		int j = A.length-1;
		
		while(j >= 0) {
			B[i] = A[j];
			i++;
			j--;
		}
		Arrays.stream(B).forEach(System.out::print);
		return B;
	}

}
