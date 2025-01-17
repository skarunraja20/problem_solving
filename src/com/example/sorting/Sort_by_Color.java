package com.example.sorting;

public class Sort_by_Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,1,0,2,2,1,0,0,1,2};
		Sort_by_Color s = new Sort_by_Color();
		int[] results = s.sortColors(A);
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}








	public int[] sortColors1(int[] A) {
		int[] result = new int[A.length];
		int start = 0;
		int end = A.length - 1 ;

		for(int i = 0; i < A.length; i++) {
			if(A[i] == 0) {
				result[start] = A[i];
				start++;
			}
			if(A[i] == 2) {
				result[end] = A[i];
				end--;
			}

		}

		for(int i = 0; i < A.length; i++) {
			if(A[i] == 1) {
				result[start] = A[i];
				start++;
			}

		}

		return result;
	}


	public int[] sortColors(int[] A) {
		int start = 0;
		int end = A.length - 1 ;
		int i = 0;

		while (i <= end) {
			if(A[i] == 0) {
				swap(A, start, i);
				start++;
				i++; //here increment i, because you will always swap 0 with 1 only. because as you move from left to right in array, smallest number is pushed to left side.

			} else if(A[i] == 2) {
				swap(A, end, i);
				end--;
				// Don't increment i here, because 2 can be swapped either 0 or 1, therefore it needs to be swapped again by going through loop
			} else {
				i++; // if A[i] == 1
			}
		}

		return A;
	}
	
	
	private void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
}
