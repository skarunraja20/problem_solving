package com.example.arrays.prefixsum;

public class Pick_from_both_sides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pick_from_both_sides p = new Pick_from_both_sides();
		int[] A = {5, -2, 3 , 1, 2};
		System.out.println(p.solve(A, 5));
	}
	
	 public int solve(int[] A, int B) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		int[] psArr = getPrefixSumArray(A);
		int left = B;
		int right = 0;
		int len = A.length-1;
		
		while(left>=0 && right<=B) {
			if(right == 0)
				sum = psArr[left-1];
			else if(left == 0 && right == A.length)
				sum = psArr[len];
			else if(left == 0)
				sum = psArr[len] - psArr[len-right];
			else {
				sum = psArr[left-1] + (psArr[len] - psArr[len-right]);
			}
			maxSum = Integer.max(maxSum, sum);
			left--;
			right++;
		}
		return maxSum;
	 }
	 
		private int[] getPrefixSumArray(int[] A) {
			int[] ps = new int[A.length];
			ps[0] = A[0];
			for(int i=1; i<A.length; i++) {
				ps[i] = ps[i-1] + A[i];
			}
			return ps;
		}

}
