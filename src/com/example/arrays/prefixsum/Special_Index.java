package com.example.arrays.prefixsum;

public class Special_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,1,6,4};
		Special_Index s =  new Special_Index();
		System.out.println(s.solve(A));
	}

	public int solve(int[] A) {
		int count = 0;
		int[] pseven = getPrefixsumEvenArray(A);
		int[] psodd = getPrefixsumOddArray(A);
		int len = A.length - 1; 
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < A.length; i++) {
			if(i == 0) {
				sumEven = (psodd[len] - psodd[i]);
				sumOdd = (pseven[len] - pseven[i]);
			} else {
				System.out.println("for index "+i+" pseven[i-1] "+pseven[i-1]+" (psodd[len] - psodd[i]) "+(psodd[len] - psodd[i]));
				System.out.println("for index "+i+" psodd[i-1] "+psodd[i-1]+" (pseven[len] - pseven[i]) "+(pseven[len] - pseven[i]));
				sumEven = pseven[i-1]+(psodd[len] - psodd[i]);
				sumOdd = psodd[i-1]+(pseven[len] - pseven[i]);
			}
			System.out.println("-------------------------------");
			if(sumEven == sumOdd)
				count++;
		}


		return count;
	}

	private int[] getPrefixsumOddArray(int[] A) {
		int[] pseven = new int[A.length];
		pseven[0] = A[0];

		for (int i = 1; i < pseven.length; i++) {
			if((i&1) == 0) 
				pseven[i] = pseven[i-1] + A[i];
			else 
				pseven[i] = pseven[i-1];
		}
		return pseven;
	}

	private int[] getPrefixsumEvenArray(int[] A) {
		int[] psodd = new int[A.length];
		psodd[0] = 0;

		for (int i = 1; i < psodd.length; i++) {
			if((i&1) == 1) 
				psodd[i] = psodd[i-1] + A[i];
			else 
				psodd[i] = psodd[i-1];
		}
		return psodd;
	}

}
