package com.example.arrays.carryforward;

public class Bulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,1,0,1};
		Bulbs b = new Bulbs();
		System.out.println(b.bulbs(A));
	}
	
	
	public int bulbs(int[] A) {
		int count = 0;
		int pos = -1;
		for (int i = 0; i < A.length-1;) {
			if(A[i] == 0 && A[i+1] == 1) {
				count = count + 2;
				i = i+2;
				pos = i;
			} else {
				i = i+1;
			}
			
		}
		if(pos == A.length)
			return count;
		else
			return (count+1);
    }

}
