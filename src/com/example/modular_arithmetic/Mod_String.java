package com.example.modular_arithmetic;

public class Mod_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mod_String m = new Mod_String();
		System.out.println(m.findMod("43535321", 47));
	}
	
	 public int findMod(String A, int B) {
		 int result = 0;
		 
		 for(int i = A.length()-1; i >= 0; i--) {
			 int num = Character.getNumericValue(A.charAt(i));
			 int powerToRaiseInt = A.length()-1 - i;
			 result = (result + calculateDigitposIncludingMod(num, powerToRaiseInt, B)) % B;
		 }
		 
		 return (result % B);
				 
				
	 }

	private int calculateDigitposIncludingMod(int num, int digitPos, int b) {
		double power = Math.pow((10 % b), digitPos);
		int powModulo = (int) (power % b);
		int numModulo = num % b;
		
		return((numModulo * powModulo) % b);
	}

}
