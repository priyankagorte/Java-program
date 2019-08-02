/**
	 * purpose: Flip coin and Print percentage of Head and Tails
	 * @author Bridgelabz
	 * @version 1.8
	 */
/**
*@purpose	:Flip Coin and print percentage of Heads and Tails
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/

package com.bridgelab.functional;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

import java.util.Random;

public class Flipcoin {
	

		public static void main(String[] args) {
			
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the number of flipse do you want");
			
			int flips=sc.nextInt();
			
			
			Utility.flipCoin(flips);
		
			
		}
			


}
