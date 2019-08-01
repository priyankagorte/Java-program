/**
*@purpose	:Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:1-08-2019
*/


package com.bridgelab.functional;
import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Harmonic {
	public static void main(String[] args)
	{
		System.out.println("enter any number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("the harmonic series is:");
		Utility.Harmonic(num);
}

}
