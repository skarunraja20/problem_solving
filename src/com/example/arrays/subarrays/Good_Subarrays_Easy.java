package com.example.arrays.subarrays;

public class Good_Subarrays_Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 4, 5};
		Good_Subarrays_Easy g = new Good_Subarrays_Easy();
		System.out.println(g.solve(A, 4));
	}
	
	 public int solve(int[] A, int B) {
		 int count = 0;
		 
		 for (int s = 0; s < A.length; s++) {
			 int sum = 0;
			for (int e = s; e < A.length; e++) {
				sum = sum + A[e];
				int subArrLen = e-s+1;
				
				if(subArrLen % 2 == 0) {
					if(sum < B)
						count++;
				} else {
					if(sum > B)
						count++;
				}
					
			}
		}
		 
		 
		 return count;
	 }

}
