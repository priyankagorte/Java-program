/**
*@purpose	:Given N distinct Coupon Numbers, how many random numbers do you
need to generate distinct coupon number? This program simulates this random
process.
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/


package com.bridgelab.functional;

 import java.util.Random;
 
import java.util.Scanner;

import com.bridgelab.utility.Utility;
 
public class CouponNumber {
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("How Many Coupon You Want");
			int no=sc.nextInt();
			
            Utility.couponnumber(no);

		}
}
