package com.test;

public class Remove_DuplicateElement {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 1, 2 };

		System.out.println("Duplicate elements are:");
		
		//Nested Loops to Compare Elements:
		for (int i = 0; i < arr.length; i++) //Outer Loop (i = 0, arr[0] = 1)
		{
			for (int j = i + 1; j < arr.length; j++) //Compare with inner loop, arr[1] = 2 → No match.
			{
				if (arr[i] == arr[j]) 
				{
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
