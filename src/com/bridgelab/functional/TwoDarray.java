package com.bridgelab.functional;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class TwoDarray {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("How many Rows you want in array");
			int row=sc.nextInt();
			System.out.println("How many Column you want in array");
			int col=sc.nextInt();
			Utility.twodarray(row , col);

}
}