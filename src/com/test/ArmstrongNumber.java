package com.test;

//The number is equal to the sum of the cube digits.
//n=153, 1*1*1+5*5*5+3*3*3 = 1+125+27 = 153

//n: The number to be checked (initialized as 153 in this case).
//sum: A variable to store the sum of the cubes of the digits.
//r: Temporary variable to store the remainder (each digit).
//temp: A copy of n to compare the final result.

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153, sum = 0, r, temp;

		temp = n;
		
		while (n > 0) {  //3>0
			r = n % 10;  //Extract(get) the last digit of n using n % 10 and store it in r.
			sum = sum + (r * r * r); //Cube the digit (r * r * r) and add it to sum.
			n = n / 10; //remove the last digit from n by performing integer division (n / 10).
		}
		if (temp == sum) //Compare (sum) with the original number (temp).
			System.out.println("Armstrong number");
		else
			System.out.println("Not an armstrong number");
	}

}

