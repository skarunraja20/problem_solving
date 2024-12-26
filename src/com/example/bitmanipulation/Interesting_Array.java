package com.example.bitmanipulation;

public class Interesting_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interesting_Array i = new Interesting_Array();
		int[] A = {9,17};
		System.out.println(i.solve(A));
	}
	
	public String solve(int[] A) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			result = result ^ A[i];
		}
		
		if((result & 1) == 0) { // check if result is even.
			return "Yes";
		}
		
		return "No";
	}

}
