package com.example;

import java.util.HashMap;

public class TwoSum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,3};
		Solution1  sol = new Solution1();
		int res[] = sol.twoSum(nums, 6);
		for(int i:res) {
			System.out.println(i);
		}
		
	}

}



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i=0; i<nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            for (int j=i+1; j<nums.length; j++) {
                if(nums[j] == b) {
                result[0] = i;
                result[1] = j;
                }
            }
        }
        return result;
    }
}





class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap map = new HashMap();
        for(int i=0; i<nums.length; i++) {
        	map.put(nums[i], i);
        }
        System.out.println(map);
        for(int j=0; j<nums.length; j++) {
        	int a = nums[j];
        	int b = target - a;
        	System.out.println("a - b : "+a +"-"+b);
        	if(map.containsKey(b) && (int)map.get(b) != j) {
        		result[0] = j;
        		result[1] = (int) map.get(b);
        		return result;
        	}
        }
		return result;
        
    }
}
