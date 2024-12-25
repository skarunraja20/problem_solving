package com.example.arrays.subarrays;

import java.util.ArrayList;

public class Alternating_Subarrays_Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,0,0,1,0,0,0,1,0,1,1};
		int B = 1;
		Alternating_Subarrays_Easy a = new Alternating_Subarrays_Easy();
		int[] res = a.solve(A, B);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

	public int[] solve(int[] A, int B) {
		int subArrLen = (2*B)+1;
		boolean isAltArr = false;
		ArrayList<Integer> resList = new ArrayList<Integer>();
		int start = 0;
		int end = subArrLen-1;

		while(end < A.length) {
			isAltArr = isAlternatingArr(A, start, end);
			if(isAltArr) {
				resList.add((start + end) / 2);
			}

			start++;
			end++;
		}
		return copyListToArray(resList);
	}

	private boolean isAlternatingArr(int[] A, int start, int end) {
		for (int j = start; j < end; j++) {
			if(A[j] == A[j+1])
				return false;
		}
		return true;
	}

	private int[] copyListToArray(ArrayList<Integer> resList) {
		int[] result = new int[resList.size()];
		for (int i = 0; i < resList.size(); i++) {
			result[i] = resList.get(i);
		}
		return result;
	}

}
