package com.example.arrays.twodimarrays;

public class Column_Sum {

	public static void main(String[] args) {
		Column_Sum a = new Column_Sum();
		
		int[][] A = {{1,2,3,4},
					 {5,6,7,8},
					 {9,10,11,12}
					 };
		
		int[] result = a.solve(A);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
	
	public int[] solve(int[][] A) {
		int[] result = new int[A[0].length];
		
		for (int j = 0; j < A[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < A.length; i++) {
				sum = sum + A[i][j];
			}
			result[j] = sum;
		}
		
		return result;
    }

}
