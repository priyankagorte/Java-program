/**
*@purpose	:Check year is a Leap Year or not.
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/
package com.bridgelab.functional;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class LeapYear {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		int mYear;
		
		do
		{
			System.out.println("Enter Four Digit the Year");
			mYear=scanner.nextInt();
		}while(!utility.isFourDigit(mYear));
		
		if(mYear%4==00|| mYear%100==0 && mYear%400==00)
			System.out.println(mYear+ " is Leap Year");
		else
			System.out.println(mYear+ " is NOT Leap Year");


	}
}
