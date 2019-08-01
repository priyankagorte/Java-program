package com.bridgelab.functional;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Permutation {
	
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string for permutation");
	String str=sc.nextLine();
	Utility.FindPermutation(str," ");

	}
}


