package com.bridgelab.functional;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Quadratic 
	{
			public static void main(String[] args)
			{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of a:");
			double a=sc.nextDouble();
			System.out.println("enter the value of b:");
			double b=sc.nextDouble();
			System.out.println("enter the value of c");
			double c=sc.nextDouble();
			
			Utility.quadratic( a,b,c);
			}
	}
