package com.example.arrays.twodimarrays;

public class MatricesAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int[][] solve(int[][] A, int[][] B) {
		int rowLen = A.length;
		int colLen = A[0].length;
		
		int[][] result = new int[A.length][A[0].length];
		
		
		for (int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				result[i][j] = A[i][j] + B[i][j];
			}
			
		}
		
		return result;
    }

}
