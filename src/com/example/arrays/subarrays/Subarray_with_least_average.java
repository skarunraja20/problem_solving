package com.example.arrays.subarrays;

public class Subarray_with_least_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {20,3,13,5,10,14,8,5,11,9,1,11};
		int B = 9;
		Subarray_with_least_average s = new Subarray_with_least_average();
		System.out.println(s.solve(A, B));
	}
	
	
	public int solve(int[] A, int B) {
		 int sum = 0;
		 int leastAvgIndex = 0;
		 int leastSum = 0;
		 
		 for(int i=0; i<B; i++) { //sum of first subarray
			 sum = sum + A[i];
		 }
		 leastSum = sum;

		 for(int i=B, j=0; i<A.length; i++, j++) { //sum of remaining subarray
			 sum = (sum + A[i]) - A[j];
			 if(sum < leastSum) {
				 leastSum = sum;
				 leastAvgIndex = (i - B) + 1;
			 }
		 }
		 
		 return leastAvgIndex;
				 
    }

}
