package com.bridgelab.functional;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class PrimeFactor {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			
			Utility.findPrimeFactor(n);
		}
}
