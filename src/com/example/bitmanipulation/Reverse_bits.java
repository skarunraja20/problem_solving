package com.example.bitmanipulation;

public class Reverse_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_bits r = new Reverse_bits();
		System.out.println(r.reverse1(3));
		
	}
	
	public long reverse(long a) {
		long res = 0;
		long num= 1;
		for(int i=0; i<32; i++) {
			if((a & (num << i)) > 0) {
				res = res + (num << (31-i));
			}
		}
		return res;
	}

	public long reverse1(long a) {
		long res = 0;
		long num= 1;
		for(int i=0; i<32; i++) {
			if((a & 1) == 1) { // the last bit is 1, therefore calculate contribution in reverse and add it to result.
				res = res + (num << (31-i));
			}
			a = a>>1; // right shift by 1 thereby looking for next bit in input is 1 or 0;
		}
		return res;
	}
}
