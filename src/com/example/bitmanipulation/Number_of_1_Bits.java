package com.example.bitmanipulation;

public class Number_of_1_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_of_1_Bits n = new Number_of_1_Bits();
		System.out.println(n.numSetBits(11));
	}
	
	
	
    public int numSetBits(int A) {
		int count = 0;
		int rem=0;
		while(A>0) {
			//rem = A%2;
			rem = A&1;
			if(rem == 1)
				count++;
			A = A/2;
			
		}

		return count;
    }

}
