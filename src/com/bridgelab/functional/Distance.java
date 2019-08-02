/**
*@purpose	:Write a program ​ Distance.java t ​ hat takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/




package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class Distance {
	public static void main(String[] args)
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
        
        Utility.distance(x,y);
}

}
