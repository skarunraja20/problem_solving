package com.example.bitmanipulation;

public class Help_from_sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Help_from_sam h = new Help_from_sam();
		System.out.println(h.solve(7));

	}

	public int solve(int A) {
		int count = 0; //always start by taking help from alex to start scoring.
		if(A == 0)return 0;
		while(A > 0) {
			if((A&1) == 1) { //odd number
				A = A-1;
				count++;
			} else {
				System.out.println("A is "+A);
				A = A >> 1;
			}
		}
		return count;
	}

}
