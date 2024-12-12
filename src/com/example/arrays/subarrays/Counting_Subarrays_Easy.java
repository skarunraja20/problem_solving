package com.example.arrays.subarrays;

public class Counting_Subarrays_Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2, 5, 6};
		Counting_Subarrays_Easy c = new Counting_Subarrays_Easy();
		System.out.println(c.solve(A, 10));
	}
	
	 public int solve(int[] A, int B) {
		 int count = 0;
		 for (int s = 0; s < A.length; s++) {
			 int sum = 0;
			for (int e = s; e < A.length; e++) {
				sum = sum + A[e];
				if(sum < B)
					count++;
			}
		}
		 return count;
	 }

}
