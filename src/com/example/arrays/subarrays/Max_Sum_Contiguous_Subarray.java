package com.example.arrays.subarrays;

public class Max_Sum_Contiguous_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		Max_Sum_Contiguous_Subarray m = new Max_Sum_Contiguous_Subarray();
		System.out.println(m.maxSubArray(A));
	}
	
	public int maxSubArray(final int[] A) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < A.length; i++) {
			int sum=0;
			for (int j = i; j < A.length; j++) {
				sum = sum + A[j];
				max = Integer.max(max, sum);
			}
		}
		
		return max;
    }

}
