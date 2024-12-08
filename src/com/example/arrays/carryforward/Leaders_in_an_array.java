package com.example.arrays.carryforward;

import java.util.ArrayList;

public class Leaders_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leaders_in_an_array l = new Leaders_in_an_array();
		int[] A = {16, 17, 4, 3, 5, 2};
		System.out.println(l.solve(A).length);
	}
	
	
	public int[] solve(int[] A) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		int max = A[A.length-1];
		resultList.add(A[A.length-1]);
		for (int i = A.length-2; i >= 0; i--) {
			if(A[i]>max) {
				max = A[i];
				resultList.add(A[i]);
			}
			
		}
		int[] result = new int[resultList.size()];
		for (int i = 0; i < resultList.size(); i++) {
			result[i]=resultList.get(i);
		}
		return result;
    }

}
