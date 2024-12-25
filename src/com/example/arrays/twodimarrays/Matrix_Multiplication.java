package com.example.arrays.twodimarrays;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[][] solve(int[][] A, int[][] B) {
		int firstArrRowLen = A.length;
		int firstArrColLen = A[0].length;
		
		int secondArrRowLen = A[0].length;
		int secondArrColLen = B[0].length;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				for (int k = 0;  k < B[0].length; k++) {
					for (int l = 0; l < B.length; l++) {
						if(j==l && k==i) {
							
						}
					}
					
				}
			}
		}

		
		
    }

}
