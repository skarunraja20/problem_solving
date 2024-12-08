package com.example.arrays.carryforward;

public class Closest_MinMax {

	public static void main(String[] args) {
		Closest_MinMax c = new Closest_MinMax();
		int[] A = {4,4,4,4,4};
		System.out.println(c.solve(A));
	}

	public int solve(int[] A) {
		int minsize = Integer.MAX_VALUE;
		int pos = -1;
		
		int[] min_max_arr = getMinMaxInArr(A);
		int min = min_max_arr[0];
		int max = min_max_arr[1];
		
		if(min == max) return 1;
		
		for (int i = 0; i < A.length; i++) {
			if(pos == -1 && (A[i] == min || A[i] == max))
				pos = i;

			if(pos != -1 && (A[i] == min || A[i] == max)) {
				
				if(A[pos] != A[i]) 
					minsize = Integer.min(minsize, (i-pos+1));
				
				pos = i;
			}
			
		}
		return minsize;
	}

	private int[] getMinMaxInArr(int[] A) {
		int[] min_max_arr = new int[2];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {
			if(A[i]<min)
				min = A[i];
			if(A[i]>max)
				max = A[i];
		}
		min_max_arr[0]=min;
		min_max_arr[1]=max;
		return min_max_arr;
	}

}
