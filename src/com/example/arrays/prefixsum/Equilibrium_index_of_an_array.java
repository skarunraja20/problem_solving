package com.example.arrays.prefixsum;

public class Equilibrium_index_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equilibrium_index_of_an_array eq = new Equilibrium_index_of_an_array();
		int[] A = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(eq.solve(A));
	}
	
	public int solve(int[] A) {
		int[] ps = getPrefixSumArray(A);
		for(int i=0; i<A.length; i++) {
			int sumleft = 0;
			int sumright = 0;
			
			if(i == 0)
				sumleft = 0;
			else
				sumleft = ps[i-1];
			
			sumright = ps[A.length-1] - ps[i];
			
			if(sumleft == sumright)
				return i;
		}
		return -1;
    }

	private int[] getPrefixSumArray(int[] A) {
		// TODO Auto-generated method stub
		int[] ps = new int[A.length];
		ps[0] = A[0];
		for(int i=1; i<A.length; i++) {
			ps[i] = ps[i-1] + A[i];
		}
		return ps;
	}

}
