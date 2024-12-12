package com.example.arrays.subarrays;

public class Sum_of_All_subarrays_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3};
		Sum_of_All_subarrays_sum s = new Sum_of_All_subarrays_sum();
		System.out.println(s.subarraySum(A));
	}
	
	public long subarraySum(int[] A) {
		long sum = 0;
		for (int i = 0; i < A.length; i++) {
			long occurencesInSubarrays = (long)(i+1) * (long)(A.length - i) ;
			long contribution = A[i] * occurencesInSubarrays;
			sum = sum + contribution;
		}
		return sum;
    }

}
