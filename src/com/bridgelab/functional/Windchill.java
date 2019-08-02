/**
*@purpose	:Write a program ​ WindChill.java that takes two double command-line arguments t
and v and prints the wind chill.
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/



package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class Windchill {

		public static void main(String[] args)
		{
			double t=Double.parseDouble(args[0]);
			double v=Double.parseDouble(args[1]);
			
	
           Utility.windchill(t, v);
}

}
