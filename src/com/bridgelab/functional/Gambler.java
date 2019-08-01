package com.bridgelab.functional;
import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Gambler {
	public static void main(String[] args)
	{
		int stake,goal,numberOfTime;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter $stake Value :");
		stake=sc.nextInt();
		
		System.out.println("Enter $Goal Value :");
		goal=sc.nextInt();
		
		System.out.println("Enter Number of times you want to play:");
		numberOfTime=sc.nextInt();
		
		Utility.Gambler(stake,goal,numberOfTime);
	}



}
