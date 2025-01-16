package com.example;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		System.out.println(f.findAthFibonacci(7));
	}
	
	public int findAthFibonacci(int A) {
		if(A == 1 || A == 2)
			return 1;
		
		return findAthFibonacci(A-1)+findAthFibonacci(A-2);
		
    }

}
