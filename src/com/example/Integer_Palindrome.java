package com.example;

import java.util.ArrayList;

public class Integer_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer_Palindrome i = new Integer_Palindrome();
		System.out.println(i.isPalindrome(121));
	}

	public boolean isPalindrome(int x) {
		if(x < 0 || x < 11) return false;
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		boolean isPalindrome = true;

		while(x >= 10) {
			nums.add(x%10);
			x = x/10;
		}
		
		if(x < 10) {
			nums.add(x);
			x=0;
		}
		
		int i = 0;
		int j = nums.size() - 1;
		
		while(i<j) {
			if(nums.get(i) != nums.get(j)) {
				isPalindrome = false;
			}
			i++;
			j--;
		}
		
		System.out.println(nums);
		return isPalindrome;
		
	}

}
