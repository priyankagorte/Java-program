package com.bridgelab.functional;
import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class FlipCoin {
	public static void main(String args[])
	{
		int heads=0;
		int tails=0;
		
		int counter=1;
		double randNum=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("howmany times times will be flipped the coin");
		int flips=sc.nextInt();
		Utility.FlipCoin(flips,counter,randNum,heads,tails);
	}
}