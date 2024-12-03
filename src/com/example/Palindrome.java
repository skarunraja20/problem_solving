package com.example;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		System.out.println(p.solve("MADNM"));
	}
	
	public int solve(String A) {
		if(A.length() == 0)
			return 0;
		return checkPalindrome(A, 0, (A.length()-1));
    }

	private int checkPalindrome(String a, int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("i is: "+i +" j is: "+j);
		if(i>=j) return 1;
		
		if(a.charAt(i) == a.charAt(j)) {
			return checkPalindrome(a, i+1, j-1);
		}
		
		return 0;
	}
}
