/**
*@purpose	:Simulates a gambler who start with $stake and place fair $1 bets until
he/she goes broke reach $goal. Keeps track of the number of
times he/she wins and the number of bets he/she makes. Run the experiment N
times, averages the results, and prints them out
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/



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