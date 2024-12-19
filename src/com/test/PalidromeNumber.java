package com.test;

//First and last digit should be same

//reverse-temporary variable to store the remainder
public class PalidromeNumber {

	public static void main(String[] args) {
		
		int n = 303, sum = 0, reverse, temp;

		temp = n;

		while (n > 0) //(process continues until all digits are reversed). 
		{           														     //Iteration 1:
			reverse = n % 10;  //This gets the last digit of the current number   //303 % 10 = 3
			sum = (sum * 10) + reverse;                                           //0 * 10 + 3 = 3
			n = n / 10;  //Remove Last Digit from n:                              //303 / 10 =  30
	
		}																	     //Iteration 2:
		if (temp == sum)  // 													  //30 % 10=0
			System.out.println("Palidrome Number");								  //3 * 10 + 0 = 30
		else																	  //30 / 10 = 3
			System.out.println("Not a palidrome number");
	}
}

/*
 *1. Original number: 121
 *2. Reversed number: Start with sum = 0
 *
Extract & get last digit rev: 121 % 10 --> 12.1 = 1

Update reversed number: sum = 0 * 10 + 1 = 1

Remove last digit from original n: 121 / 10 --> 12.1 = 12
---------------------------------------------------
Extract last digit rev: 12 % 10 = 2

Update reversed number: sum = 1 * 10 + 2 = 12

Remove last digit from original n: 12 // 10 = 1
----------------------------------------------------
Extract last digit rev: 1 % 10 = 1

Update reversed number: sum = 12 * 10 + 1 = 121

Remove last digit from original n: 1 // 10 = 0

*3. Comparison: 121 == 121, so the number is a palindrome.
 * */
