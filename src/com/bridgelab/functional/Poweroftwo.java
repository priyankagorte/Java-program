/**
*@purpose	:This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/




package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class Poweroftwo {
		public static void main (String[] args)
		{
			
			int i=0;
			int power=Integer.parseInt(args[0]);			
			
			Utility.poweroftwo(power);
		}

}