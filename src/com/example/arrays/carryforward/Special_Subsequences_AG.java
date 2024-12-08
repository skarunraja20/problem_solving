package com.example.arrays.carryforward;

public class Special_Subsequences_AG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Special_Subsequences_AG s = new Special_Subsequences_AG();
		System.out.println(s.solve("ABCGAG"));

	}
	
	public int solve(String A) {
		int countOfA = 0;
		int countOfAG = 0;
		StringBuilder sb = new StringBuilder(A);
		for(int i=0; i<A.length(); i++) {
			if(A.charAt(i)=='A') {
				countOfA++;
			} else if(A.charAt(i)=='G') {
				countOfAG = (countOfAG % 1000000007 + countOfA)%1000000007;
			}
		}
		return countOfAG;
    }

}
