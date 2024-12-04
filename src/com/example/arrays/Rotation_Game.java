package com.example.arrays;

import java.util.*;

public class Rotation_Game {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		String line = myObj.nextLine();
		int numberOfRotation = myObj.nextInt();

		String[] arr = line.split(" ");
		int[] inputArr = new int[Integer.parseInt(arr[0])];
		for(int i=1; i <= arr.length-1; i++) {
			inputArr[i-1] = Integer.parseInt(arr[i]);
		}
		
		rotateArray(inputArr, numberOfRotation);
	}

	private static void rotateArray(int[] inputArr, int numberOfRotation) {
		int[] tempArr = new int[inputArr.length];
		int arrPos = 0;
		int len = inputArr.length;
		
		if(numberOfRotation > len)
			numberOfRotation = (numberOfRotation % len);
		
		int rotationPos = (len - numberOfRotation);
		
		for(int i=rotationPos; i<len; i++) {
			tempArr[arrPos] = inputArr[i];
			arrPos = arrPos+1;
		}
		
		for(int i=0; i<rotationPos; i++) {
			tempArr[arrPos] = inputArr[i];
			arrPos = arrPos+1;
		}
		
		for(int j=0; j<tempArr.length; j++) {
			System.out.print(tempArr[j] + " ");
		}
	}
	
	

}
