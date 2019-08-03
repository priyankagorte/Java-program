/**
*@purpose	:A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/




package com.bridgelab.functional;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class twodarray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Rows you want in array");
		int row=sc.nextInt();
		System.out.println("How many Column you want in array");
		int col=sc.nextInt();
		
		Utility.twodarray(row,col);
		
	}

}
