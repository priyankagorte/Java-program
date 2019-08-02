/**
*@purpose	:A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/



package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class Sumofthree {

		public static void main(String[] args) 
		{
			int[] arr = {0,-1,2,-3,1};
			int n= arr.length;
			
			Utility.FindTriplet(arr,n);
			
		}

	}
