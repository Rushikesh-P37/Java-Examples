package com.test;

public class Sort_Array {
//Bubble Sort
	public static void main(String[] args) {

		int arr[] = new int[] { 12, 4, 13, 9, 8 };

		// declare the "temp" variable to store the last element.
		// Shift all elements one position to the right.
		// place "temp" variable to first position.

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) 
		{
			for (int j = 0; j < n - i - 1; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted array is:");

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
