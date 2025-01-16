package com.example.modular_arithmetic;

public class Excel_column_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Excel_column_number e = new Excel_column_number();
		System.out.println(e.titleToNumber("AA"));

	}
	
	public int titleToNumber(String A) {
		int result = 0;
		
		for(int i = A.length()-1; i>=0; i--) {
			int charPosition = A.charAt(i) - 64;
			double digitPosition =  Math.pow(26, A.length()-1-i);
			result = (int) (result + (digitPosition * charPosition));
		}
		
		return result;
	}

}
