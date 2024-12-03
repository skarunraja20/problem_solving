package com.example;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power p = new Power();
		System.out.println(p.pow(71045970, 41535484, 64735492));//20805472
	}
	
	public int pow(int A, int B, int C) {
		if(A == 0) return 0;
		if(B == 0) return 1;
		
		if(A < 0 && B == 1)
			return ((A % C) + C) % C ;
		
		if(B == 1) {
			System.out.println("A%C is "+(A%C));
			return A%C;
		}
		
		long x = pow(A, B/2, C);
		//int squareOfx = (((x%C) * (x%C))%C);
		long squareOfx = findSquareOfX(x, C);
		
		if((B & 1) == 1) { //B is odd number
			System.out.println(((A%C * squareOfx)%C));
			return (int)(((A%C) * squareOfx)%C);
		} else {
			System.out.println("squareOfx is :"+squareOfx);
			return (int)squareOfx;
		}

    }
	
	
	
	
	private long findSquareOfX(long x, int C) {
		System.out.println("x%c is "+(x%C));
		System.out.println("(((x%C) * (x%C))%C) "+(((x%C) * (x%C))%C));
		return (((x%C) * (x%C))%C);
		
	}

	public int pow1(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
		if(B == 0) return 1;
		if(B == 1) return A;
		
		int x = pow(A, B/2, C);
		int squareOfx = x * x;
		
		if((B & 1) == 1) { //B is odd number
			return A * squareOfx;
		} else {
			return squareOfx;
		}

    }
	
	
    public int pow2(int A, int B, int C) {

		if(A == 0) return 0;
		if(B == 0) return 1;
		
		if(A < 0 && B == 1)
			return ((A % C) + C) % C ; //remainder cannot be negative. therefore add C and take modulo

		if(B == 1)
			return A%C;

		long x = pow(A, B/2, C);
		long xSqu = ((x%C) * (x%C))%C;
 
		if((B&1) == 1) {
			return (int) (((A%C) * xSqu) % C);
		} else {
			return (int)xSqu;
		}
	}

}
