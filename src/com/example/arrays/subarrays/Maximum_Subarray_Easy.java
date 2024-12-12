package com.example.arrays.subarrays;

public class Maximum_Subarray_Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] C = {8,7};
		int B = 4;
		Maximum_Subarray_Easy m = new Maximum_Subarray_Easy();
		System.out.println(m.maxSubarray(C.length, B, C));
	}
	
	public int maxSubarray(int A, int B, int[] C) {
		
		int maxSum = 0;
		
		for (int s = 0; s < C.length; s++) {
			int sum = 0;
			for (int e = s; e < C.length; e++) {
				sum = sum +C[e];
				if(sum >= maxSum && sum <= B) {
					maxSum = sum;
				}
			}
		}
		
		return maxSum;
    }

}
