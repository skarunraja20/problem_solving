package com.example.arrays.twodimarrays;

import java.util.Iterator;

public class Anti_Diagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anti_Diagonals a = new Anti_Diagonals();
		
		int[][] A = {{1,2,3,4},
					 {5,6,7,8},
					 {9,10,11,12},
					 {13,14,15,16}};
		
		int[][] result = a.diagonal(A);
		printArray(result);
		
	}

	private static void printArray(int[][] result) {
		// TODO Auto-generated method stub
		int rows = result.length;
		int col = result[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(result[i][j] +" ");
			}
			System.out.println("\n");
		}
		
	}

	public int[][] diagonal(int[][] A) {
		int rows = (2 * A.length) - 1;
		int col = A[0].length;
		int [][] result = new int[rows][col];
		
		int i=0;
		int j=0;
		
		int resArrRow=0;
		int resArrCol=0;
		
		while(j < A.length) {
			resArrCol = 0;
			for(int k=i,l=j; l >= 0; k++,l--, resArrCol++) {
				result[resArrRow][resArrCol] = A[k][l];
			}
			j++;
			resArrRow++;
		}
		
		j = A.length - 1;
		i=1;
		
		while(i < A.length) {
			resArrCol = 0;
			for(int k=i,l=j; k < A.length; k++,l--, resArrCol++) {
				result[resArrRow][resArrCol] = A[k][l];
			}
			i++;
			resArrRow++;
		}
		
		return result;
	}

}
